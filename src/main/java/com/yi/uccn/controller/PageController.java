package com.yi.uccn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 页面跳转
 * @author YI
 * @date 2019-1-12 11:17:44
 */
@Controller
public class PageController {

    /**
     * 主页
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /**
     * 公司简介
     * @return
     */
    @RequestMapping("/presentation")
    public String presentation(){
        return "work/presentation";
    }

    /**
     * 文章详情
     * @return
     */
    @RequestMapping("/details")
    public ModelAndView details(Integer id){
        ModelAndView modelAndView = new ModelAndView("work/details");
        modelAndView.addObject("id", id);

        return modelAndView;
    }

    /**
     * 文章管理
     * @return
     */
    @RequestMapping("/article")
    public String article(){
        return "work/article";
    }

    /**
     * 用户
     * @return
     */
    @RequestMapping("/user")
    public String user(){
        return "work/user";
    }

    /**
     * 登录
     * @return
     */
    @RequestMapping("/login")
    public String logon(){
        return "work/login";
    }
}
