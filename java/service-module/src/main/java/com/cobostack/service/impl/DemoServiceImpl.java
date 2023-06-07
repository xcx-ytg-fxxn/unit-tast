/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.cobostack.service.impl;

import com.cobostack.service.DemoService;

/**
 * @author leran.xm
 * @version : DemoServiceImpl.java, v 0.1 2023年03月14日 8:21 下午 leran.xm Exp $
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public int select() {
        int a = 0;
        a = a + 5;
        return a;
    }

    @Override
    public int select(int a) {
        return a*a;
    }
}