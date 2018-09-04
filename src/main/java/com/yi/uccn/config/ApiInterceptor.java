package com.yi.uccn.config;

import cn.hutool.json.JSONUtil;
import com.yi.uccn.utils.CookieUtil;
import com.yi.uccn.utils.MessageResult;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 拦截器 校验前端参数
 * @author YI
 * @date 2018-6-14 09:52:04
 */
public class ApiInterceptor implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(ApiInterceptor.class);

    @Autowired
    public RedisOperator redis;

    /**
     * 拦截请求，在controller调用之前
     * 返回 false：请求被拦截，返回
     * 返回 true ：请求OK，可以继续执行，放行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
        String userToken = CookieUtil.getCookie("userToken");
        String userId = CookieUtil.getCookie("userId");
        logger.info("拦截UserToken：" + userToken + " ======= 拦截UserId：" + userId);
        if (StringUtils.isNotBlank(userId) && StringUtils.isNotBlank(userToken)) {
            String uniqueToken = redis.get(Config.USER_REDIS_SESSION + ":" + userId);
            logger.info("拦截uniqueToken：" + uniqueToken);
            if (StringUtils.isEmpty(uniqueToken) && StringUtils.isBlank(uniqueToken)) {
                response.sendRedirect("/login");
                returnErrorResponse(response, MessageResult.errorTokenMsg("请登录..."));

                return false;
            }
        } else {
            response.sendRedirect("/login");
            returnErrorResponse(response, MessageResult.errorTokenMsg("请登录..."));
            return false;
        }

        return true;
    }

    /**
     * 把拦截数据返回给前端
     * @param response
     * @param result
     * @throws IOException
     */
    private void returnErrorResponse(HttpServletResponse response, MessageResult result) throws IOException {
        response.setContentType("text/json");
        response.setCharacterEncoding("utf-8");
        OutputStream out = null;
        try {
            out = response.getOutputStream();
            out.write(JSONUtil.parse(result).toStringPretty().getBytes("utf-8"));
            out.flush();
        } finally {
            if(out!=null){
                out.close();
            }
        }
    }

    /**
     * 请求controller之后，渲染视图之前
     */
    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3) throws Exception {

    }

    /**
     * 请求controller之后，视图渲染之后
     */
    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3) throws Exception {

    }
}
