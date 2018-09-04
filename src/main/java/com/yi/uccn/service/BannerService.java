package com.yi.uccn.service;

import com.yi.uccn.model.Banner;
import com.yi.uccn.model.BannerExample;

import java.util.List;

/**
 * 首页图片
 * @author YI
 * @date 2018-8-29 14:35:32
 */
public interface BannerService {

    /**
     * 保存banner图片地址
     * @param record
     * @return
     */
    int save(Banner record);

    /**
     * 保存banner图片地址
     * @param record
     * @return
     */
    int saveSelective(Banner record);

    /**
     * 按条件查询
     * @param example 条件
     * @return
     */
    List<Banner> selectByExampleWithBLOBs(BannerExample example);
}
