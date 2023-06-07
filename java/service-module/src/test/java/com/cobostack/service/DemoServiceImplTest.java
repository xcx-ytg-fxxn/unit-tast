/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.cobostack.service;

import com.cobostack.service.impl.DemoServiceImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author leran.xm
 * @version : DemoServiceImplTest.java, v 0.1 2023年03月14日 8:24 下午 leran.xm Exp $
 */
public class DemoServiceImplTest {

    @Test
    public void test_select() {
        DemoService demoService = new DemoServiceImpl();
        demoService.select();
    }

    @Test
    public void test_select1() {
        DemoService demoService = new DemoServiceImpl();
        Assert.assertTrue(demoService.select(1)==1);
    }
}