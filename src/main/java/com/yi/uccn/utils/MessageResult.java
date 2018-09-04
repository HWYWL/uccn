package com.yi.uccn.utils;

/**
 * 统一返回数据格式
 * @author YI
 * @date 2018-8-22 11:25:56
 */
public class MessageResult<T> {
    private int code = 0;
    private String msg = "数据读取成功!";
    private int count;
    private T data;

    public MessageResult() {
        super();
    }

    public MessageResult(int code, String msg, int count, T data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public static MessageResult ok() {
        return new MessageResult();
    }

    public static MessageResult ok(Object data) {
        MessageResult result = new MessageResult();
        result.setData(data);

        return result;
    }

    public static MessageResult errorMsg(String msg) {
        return new MessageResult(-1, msg, 0, null);
    }

    public static MessageResult errorMap(Object data) {
        return new MessageResult(-1, "ERROR:出错啦，么么哒！！！", 0, data);
    }

    public static MessageResult errorTokenMsg(String msg) {
        return new MessageResult(-1, msg, 0, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MessageResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
