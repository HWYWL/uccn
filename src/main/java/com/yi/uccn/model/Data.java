package com.yi.uccn.model;

/**
 * 图床数据
 * @author YI
 * @date 2019-1-11 09:27:21
 */
public class Data {

    private String delete;
    private String filename;
    private String hash;
    private int height;
    private String path;
    private long size;
    private String storename;
    private long timestamp;
    private String url;
    private int width;
    public void setDelete(String delete) {
        this.delete = delete;
    }
    public String getDelete() {
        return delete;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    public String getFilename() {
        return filename;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
    public String getHash() {
        return hash;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public String getPath() {
        return path;
    }

    public void setSize(long size) {
        this.size = size;
    }
    public long getSize() {
        return size;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }
    public String getStorename() {
        return storename;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    public long getTimestamp() {
        return timestamp;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }

}