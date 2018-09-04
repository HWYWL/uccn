package com.yi.uccn.controller;

import com.yi.uccn.model.User;
import com.yi.uccn.service.UserService;
import com.yi.uccn.utils.MessageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/fidnAll")
    public MessageResult findAll(){
        List<User> users = userService.queryAll();

        return MessageResult.ok(users);
    }
}
