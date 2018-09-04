package com.yi.uccn.controller;

import com.yi.uccn.model.Presentation;
import com.yi.uccn.service.PresentationService;
import com.yi.uccn.utils.MessageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简介
 * @author YI
 * @date 2018-8-29 23:17:45
 */
@RestController
@RequestMapping("/presentation")
public class PresentationController {
    @Autowired
    PresentationService presentationService;

    @RequestMapping("/save")
    public MessageResult save(@RequestBody Presentation presentation){
        MessageResult result = MessageResult.ok();

        if (presentation == null){
            return MessageResult.errorMsg("不能为空");
        }

        try {
            presentationService.save(presentation);
        }catch (Exception e){
            result = MessageResult.errorMsg(e.getMessage());
        }

        return result;
    }

    /**
     * 查找简介
     * @return
     */
    @RequestMapping("/find")
    public MessageResult find(){
        MessageResult result = MessageResult.ok();

        try {
            Presentation presentation = presentationService.find();
            result.setData(presentation);
        }catch (Exception e){
            result = MessageResult.errorMsg(e.getMessage());
        }

        return result;
    }
}
