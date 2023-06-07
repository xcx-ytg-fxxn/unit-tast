/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.cobostack.dao.impl;

import com.cobostack.dao.DemoDao;

/**
 * @author leran.xm
 * @version : DemoDaoImpl.java, v 0.1 2023年03月14日 6:19 下午 leran.xm Exp $
 */
public class DemoDaoImpl implements DemoDao {

    @Override
    public int select() {
        int a = 1;
        //测试
        a = a + 15;
        return a;
    }

    @Override
    public int select(int a) {
        if (a>0){
            System.out.println("a>0");
            System.out.println("a---0");
            return a+1;
        }else {
            return a-1;
        }

    }
}