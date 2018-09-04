package com.yi.uccn.service.impl;

import com.yi.uccn.dao.BannerMapper;
import com.yi.uccn.model.Banner;
import com.yi.uccn.model.BannerExample;
import com.yi.uccn.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 网站首页
 * @author YI
 * @date 2018-8-29 14:36:27
 */
@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    BannerMapper bannerMapper;

    @Override
    public int save(Banner record) {
        return bannerMapper.insert(record);
    }

    @Override
    public int saveSelective(Banner record) {
        return bannerMapper.insertSelective(record);
    }

    @Override
    public List<Banner> selectByExampleWithBLOBs(BannerExample example) {
        return bannerMapper.selectByExampleWithBLOBs(example);
    }
}
