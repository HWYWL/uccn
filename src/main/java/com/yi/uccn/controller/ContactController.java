package com.yi.uccn.controller;

import com.yi.uccn.model.Contact;
import com.yi.uccn.model.ContactExample;
import com.yi.uccn.service.ContactService;
import com.yi.uccn.utils.MessageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 联系详情
 * @author YI
 * @date 2018-8-29 21:31:04
 */
@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    ContactService contactService;

    @RequestMapping("/findLastOneContact")
    public MessageResult findLastOneContact(){
        MessageResult result = MessageResult.ok();
        ContactExample contactExample = new ContactExample();

        contactExample.setLimit(1);
        contactExample.setOrderByClause("crateDate DESC");
        List<Contact> contacts = null;
        try {
            contacts = contactService.selectByExample(contactExample);
            result.setData(contacts);
        }catch (Exception e){
            result = MessageResult.errorMsg(e.getMessage());
        }


        return result;
    }

    /**
     * 保存联系方式
     * @param contact
     * @return
     */
    @RequestMapping("/saveContact")
    @ResponseBody
    public MessageResult saveContact(@RequestBody Contact contact){
        MessageResult result = MessageResult.ok();
        if (contact == null){
            result = MessageResult.errorMsg("填写的数据不能为空！");
        }else {
            try {
                contactService.saveSelective(contact);
            }catch (Exception e){
                result = MessageResult.errorMsg("保存错误，请刷新后重新提交！");
            }
        }

        return result;
    }
}
