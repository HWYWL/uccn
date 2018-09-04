package com.yi.uccn.model;

import java.io.Serializable;

/**
 * @author 
 */
public class ArticleWithBLOBs extends Article implements Serializable {
    /**
     * 文章
     */
    private String content;

    /**
     * 文章图片视频url，JSON 结构
     */
    private String imgOptions;

    private static final long serialVersionUID = 1L;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgOptions() {
        return imgOptions;
    }

    public void setImgOptions(String imgOptions) {
        this.imgOptions = imgOptions;
    }
}