package com.yi.uccn.utils;

/**
 * 命令指令
 * @author YI
 * @date 2018-4-29 19:15:37
 */
public enum Status {
    GREEN("正常使用", (byte)0), RED("已被删除", (byte)-1);

    /**
     * 成员变量
     */
    private String name;
    private Byte value;

    Status(String name, Byte value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getValue() {
        return value;
    }

    public void setValue(Byte value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Status{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
