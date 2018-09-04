package com.yi.uccn.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Contact implements Serializable {
    private Integer id;

    /**
     * 办公地址
     */
    private String address;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * qq
     */
    private String qq;

    /**
     * 微信
     */
    private String wx;

    /**
     * 版权所有者，公司名称
     */
    private String ownership;

    /**
     * 创建时间
     */
    private Date cratedate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public Date getCratedate() {
        return cratedate;
    }

    public void setCratedate(Date cratedate) {
        this.cratedate = cratedate;
    }
}