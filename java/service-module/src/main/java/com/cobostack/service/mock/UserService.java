/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.cobostack.service.mock;

/**
 * @author leran.xm
 * @version : UserService.java, v 0.1 2023年03月15日 2:59 下午 leran.xm Exp $
 */
public class UserService {

    public int calcAge() {
        int age = getAge();
        age = addAge(age);
        System.out.println("calc age: " + age);
        return age;
    }

    /** mock static */
    public static int getAge() {
        throw new RuntimeException("get agent exception!");
    }

    /** mock private */
    private int addAge(int age) {
        return age + 10;
    }
}