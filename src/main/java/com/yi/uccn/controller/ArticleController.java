package com.yi.uccn.controller;

import com.yi.uccn.model.ArticleWithBLOBs;
import com.yi.uccn.service.ArticleService;
import com.yi.uccn.utils.MessageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章
 * @author YI
 * @date 2018-8-30 11:55:09
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    /**
     * 保存文章
     * @param article
     * @return
     */
    @RequestMapping("/saveArticle")
    public MessageResult saveArticle(@RequestBody ArticleWithBLOBs article){
        MessageResult result = MessageResult.ok();
        if (article == null){
            return MessageResult.errorMsg("内容不能为空");
        }

        if (article.getContent() == null){
            return MessageResult.errorMsg("文章不能为空");
        }

        if (article.getTitle() == null){
            return MessageResult.errorMsg("文章标题不能为空");
        }

        try {
            articleService.save(article);
        }catch (Exception e){
            result = MessageResult.errorMsg(e.getMessage());
        }

        return result;
    }
}
