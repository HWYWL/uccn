package com.yi.uccn.service.impl;

import com.yi.uccn.config.Config;
import com.yi.uccn.dao.UserMapper;
import com.yi.uccn.model.User;
import com.yi.uccn.model.UserExample;
import com.yi.uccn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户操作实现类
 * @author YI
 * @date 2018-8-29 11:11:39
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional(propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
    @Override
    public boolean queryUsernameIsExist(String username) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();

        criteria.andNameEqualTo(username);

        long count = userMapper.countByExample(example);

        return count == 0 ? false : true;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public void saveUser(User user) {

        userMapper.insert(user);
    }

    @Override
    public List<User> queryUsername(String username) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();

        criteria.andNameEqualTo(username);

        return userMapper.selectByExample(example);
    }

    @Override
    public List<User> queryAll() {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();

        criteria.andStatusEqualTo((byte)1);

        return userMapper.selectByExample(example);
    }

    @Override
    public List<User> queryUsernameAndPassWord(String username, String password) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();

        criteria.andNameEqualTo(username);
        criteria.andPasswordEqualTo(password);

        return userMapper.selectByExample(example);
    }
}
