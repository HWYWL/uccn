package com.yi.uccn.service.impl;

import com.yi.uccn.dao.ContactMapper;
import com.yi.uccn.model.Contact;
import com.yi.uccn.model.ContactExample;
import com.yi.uccn.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 联系方式
 * @author YI
 * @date 2018-8-29 16:29:50
 */
@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactMapper contactMapper;

    @Override
    public int saveSelective(Contact record) {
        return contactMapper.insertSelective(record);
    }

    @Override
    public List<Contact> selectByExample(ContactExample example) {
        return contactMapper.selectByExample(example);
    }
}
