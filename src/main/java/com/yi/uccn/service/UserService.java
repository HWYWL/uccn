package com.yi.uccn.service;

import com.yi.uccn.model.User;

import java.util.List;

/**
 * 用户操作实现类
 * @author YI
 * @date 2018-8-29 11:07:59
 */
public interface UserService {
    /**
     * 查询用户是否存在
     * @param username 用户名
     * @return
     */
    boolean queryUsernameIsExist(String username);

    /**
     * 保存用户(用户注册)
     * @param user
     */
    void saveUser(User user);

    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    List<User> queryUsername(String username);

    /**
     * 获取所有用户
     * @return
     */
    List<User> queryAll();

    /**
     * 通过同户名和密码查找用户
     * @param username  用户名
     * @param password  密码
     * @return
     */
    List<User> queryUsernameAndPassWord(String username, String password);
}
