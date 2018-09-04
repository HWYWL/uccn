package com.yi.uccn.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Presentation implements Serializable {
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 品牌
     */
    private String trademark;

    /**
     * 营销
     */
    private String marketing;

    /**
     * 品牌小便签1
     */
    private String trademarkSmallLabel1;

    /**
     * 品牌小便签5
     */
    private String trademarkSmallLabel2;

    /**
     * 品牌小便签3
     */
    private String trademarkSmallLabel3;

    /**
     * 品牌小便签4
     */
    private String trademarkSmallLabel4;

    /**
     * 营销小便签1
     */
    private String marketingSmallLabel1;

    /**
     * 营销小便签2
     */
    private String marketingSmallLabel2;

    /**
     * 营销小便签3
     */
    private String marketingSmallLabel3;

    /**
     * 营销小便签4
     */
    private String marketingSmallLabel4;

    /**
     * 1 为有效 2 为禁用
     */
    private Byte status;

    /**
     * 创建时间
     */
    private Date cratedate;

    /**
     * 简介
     */
    private String brief;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getMarketing() {
        return marketing;
    }

    public void setMarketing(String marketing) {
        this.marketing = marketing;
    }

    public String getTrademarkSmallLabel1() {
        return trademarkSmallLabel1;
    }

    public void setTrademarkSmallLabel1(String trademarkSmallLabel1) {
        this.trademarkSmallLabel1 = trademarkSmallLabel1;
    }

    public String getTrademarkSmallLabel2() {
        return trademarkSmallLabel2;
    }

    public void setTrademarkSmallLabel2(String trademarkSmallLabel2) {
        this.trademarkSmallLabel2 = trademarkSmallLabel2;
    }

    public String getTrademarkSmallLabel3() {
        return trademarkSmallLabel3;
    }

    public void setTrademarkSmallLabel3(String trademarkSmallLabel3) {
        this.trademarkSmallLabel3 = trademarkSmallLabel3;
    }

    public String getTrademarkSmallLabel4() {
        return trademarkSmallLabel4;
    }

    public void setTrademarkSmallLabel4(String trademarkSmallLabel4) {
        this.trademarkSmallLabel4 = trademarkSmallLabel4;
    }

    public String getMarketingSmallLabel1() {
        return marketingSmallLabel1;
    }

    public void setMarketingSmallLabel1(String marketingSmallLabel1) {
        this.marketingSmallLabel1 = marketingSmallLabel1;
    }

    public String getMarketingSmallLabel2() {
        return marketingSmallLabel2;
    }

    public void setMarketingSmallLabel2(String marketingSmallLabel2) {
        this.marketingSmallLabel2 = marketingSmallLabel2;
    }

    public String getMarketingSmallLabel3() {
        return marketingSmallLabel3;
    }

    public void setMarketingSmallLabel3(String marketingSmallLabel3) {
        this.marketingSmallLabel3 = marketingSmallLabel3;
    }

    public String getMarketingSmallLabel4() {
        return marketingSmallLabel4;
    }

    public void setMarketingSmallLabel4(String marketingSmallLabel4) {
        this.marketingSmallLabel4 = marketingSmallLabel4;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCratedate() {
        return cratedate;
    }

    public void setCratedate(Date cratedate) {
        this.cratedate = cratedate;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }
}