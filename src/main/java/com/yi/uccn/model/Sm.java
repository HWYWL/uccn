package com.yi.uccn.model;

/**
 * 图床
 * @author YI
 * @date 2019-1-11 09:26:29
 */
public class Sm {

    private String code;
    private Data data;
    private String msg;
    public void setCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }

    public void setData(Data data) {
        this.data = data;
    }
    public Data getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}