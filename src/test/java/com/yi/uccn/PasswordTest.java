package com.yi.uccn;

import cn.hutool.crypto.digest.DigestUtil;
import org.junit.Test;

/**
 * 密码生成
 */
public class PasswordTest {

    @Test
    public void test1(){
        String password = "123456";
        String hex = DigestUtil.md5Hex(password);
        System.out.println(hex);
    }
}
