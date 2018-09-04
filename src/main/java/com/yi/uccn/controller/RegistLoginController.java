package com.yi.uccn.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.digest.DigestUtil;
import com.yi.uccn.config.Config;
import com.yi.uccn.config.RedisOperator;
import com.yi.uccn.model.User;
import com.yi.uccn.model.UserVo;
import com.yi.uccn.service.UserService;
import com.yi.uccn.utils.CookieUtil;
import com.yi.uccn.utils.MessageResult;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 登录注册
 * @author YI
 * @date 2018-7-19 15:58:19
 */
@Controller()
@RequestMapping("/user")
public class RegistLoginController {
    private static final Logger logger = LoggerFactory.getLogger(RegistLoginController.class);

    @Autowired
    private UserService userService;
    @Autowired
    public RedisOperator redis;

    /**
     * 用户注册
     * @param user
     * @return
     */
    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public MessageResult regist(@RequestBody User user){
        if (user == null || StringUtils.isBlank(user.getName()) || StringUtils.isBlank(user.getPassword())){
            return MessageResult.errorMsg("用户名或者密码不能为空");
        }

        boolean isExist = userService.queryUsernameIsExist(user.getName());
        if (isExist){
            return MessageResult.errorMsg("用户名已存在");
        }else {
            user.setPassword(DigestUtil.md5Hex(user.getPassword()));

            userService.saveUser(user);
        }

        List<User> userList = userService.queryUsernameAndPassWord(user.getName(), user.getPassword());

        UserVo userVo = setUserRedisSessionToken(userList.get(0));
        userVo.setPassword("");

        return MessageResult.ok(userVo);
    }

    /**
     * 用户登录
     * @param user
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public MessageResult login(@RequestBody User user) {
        MessageResult respMessage = new MessageResult();
        if (user == null || StringUtils.isBlank(user.getName()) || StringUtils.isBlank(user.getPassword())){
            respMessage.setCode(-1);
            respMessage.setMsg("用户名或者密码不能为空");
            logger.info("error : 用户名或者密码不能为空");
            return respMessage;
        }

        List<User> userList = userService.queryUsername(user.getName());
        if (userList == null || userList.size() == 0){
            respMessage.setCode(-1);
            respMessage.setMsg("用户不存在!");
            logger.info("error : 用户不存在");
            return respMessage;
        }

        User user1 = userList.get(0);
        if (!user1.getPassword().equals(DigestUtil.md5Hex(user.getPassword()))){
            respMessage.setCode(-1);
            respMessage.setMsg("用户或密码不正确!");
            logger.info("error : 用户或密码不正确");
            return respMessage;
        }

        UserVo userVo = setUserRedisSessionToken(user1);
        userVo.setPassword("");
        respMessage.setData(userVo);

        CookieUtil.addCookie("userToken", userVo.getUserToken());
        CookieUtil.addCookie("userId", userVo.getId());
        logger.info("userToken : " + userVo.getUserToken());

        return respMessage;
    }

    /**
     * 用户注销
     * @param userId 用户id
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public MessageResult logout(String userId){
        redis.del(Config.USER_REDIS_SESSION + ":" + userId);

        return MessageResult.ok();
    }

    /**
     * 把Token放入redis
     * @param user
     * @return
     */
    private UserVo setUserRedisSessionToken(User user){
        String token = SecureUtil.simpleUUID();

        redis.set(Config.USER_REDIS_SESSION + ":" + user.getId(), token, Config.REDIS_TIMEOUT);

        UserVo userVo = new UserVo();

        BeanUtil.copyProperties(user, userVo);
        userVo.setUserToken(token);

        return userVo;
    }
}
