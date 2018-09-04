package com.yi.uccn.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Banner implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 0 下线，1 上线
     */
    private Byte status;

    private Date createTime;

    /**
     * 文章图片url，JSON 结构
     */
    private String imgOptions;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getImgOptions() {
        return imgOptions;
    }

    public void setImgOptions(String imgOptions) {
        this.imgOptions = imgOptions;
    }
}