package com.yi.uccn.controller;

import com.yi.uccn.model.*;
import com.yi.uccn.service.ArticleService;
import com.yi.uccn.service.BannerService;
import com.yi.uccn.service.ContactService;
import com.yi.uccn.service.PresentationService;
import com.yi.uccn.utils.MessageResult;
import com.yi.uccn.utils.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 官网
 * @author YI
 * @date 2018-8-29 14:49:05
 */
@RequestMapping("/open")
@RestController
public class HomeController {
    @Autowired
    BannerService bannerService;
    @Autowired
    ContactService contactService;
    @Autowired
    PresentationService presentationService;
    @Autowired
    ArticleService articleService;

    /**
     * 主页数据
     * @return
     */
    @RequestMapping("/home")
    public MessageResult home(){
        MessageResult result = MessageResult.ok();
        Map<String, Object> map = new HashMap<>(16);

        // banner
        BannerExample example = new BannerExample();
        example.setLimit(2);
        example.setOrderByClause("create_time DESC");

        BannerExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(Status.GREEN.getValue());

        List<Banner> banners = bannerService.selectByExampleWithBLOBs(example);

        map.put("banners", banners);

        // 联系
        ContactExample contactExample = new ContactExample();
        contactExample.setLimit(1);
        contactExample.setOrderByClause("crateDate DESC");

        List<Contact> contacts = contactService.selectByExample(contactExample);

        map.put("contacts", contacts);

        // 简介
        Presentation presentation = presentationService.find();

        map.put("presentation", presentation);

        // 文章
        ArticleExample articleExample = new ArticleExample();
        articleExample.setLimit(8);
        articleExample.setOrderByClause("create_time DESC");

        List<ArticleWithBLOBs> homeArticle = articleService.findHomeArticle(articleExample);
        map.put("article", homeArticle);

        result.setData(map);

        return result;
    }

    /**
     * 根据id查询文章详情
     * @param id
     * @return
     */
    @RequestMapping("/findArticle")
    public MessageResult findArticle(Integer id){
        MessageResult result = MessageResult.ok();
        if (id == null){
            return MessageResult.errorMsg("id不能为空");
        }

        try {
            ArticleWithBLOBs article = articleService.findArticle(id);
            result.setData(article);
        }catch (Exception e){
            result = MessageResult.errorMsg(e.getMessage());
        }

        return result;
    }
}
