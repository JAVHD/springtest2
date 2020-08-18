package com.bear.springtest2.demo;

import org.springframework.util.DigestUtils;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/8/18 上午11:29
 * Description: spring md5加密
 */

public class SpringMd5Demo {

    public static void main(String[] args) {

        String password = "a12345679";
        String salt = "6y47";

        String encryptPassword1 = DigestUtils.md5DigestAsHex((password + salt).getBytes());
        System.out.println(encryptPassword1);

        String encryptPassword2 = DigestUtils.md5DigestAsHex(encryptPassword1.getBytes());
        System.out.println(encryptPassword2);

        String encryptPassword3 = DigestUtils.md5DigestAsHex((DigestUtils.md5DigestAsHex((password + salt).getBytes())).getBytes());
        System.out.println(encryptPassword3);

    }
}
