package com.cobostack.dao.impl;

import com.cobostack.dao.DemoDao;
import org.junit.Test;

/**
 * @author Xu_Ming
 * @version 1.0, 2023/3/14
 */

public class DemoDaoImplTest {

    @Test
    public void test_select() {
        DemoDao demoDao = new DemoDaoImpl();
        demoDao.select();
    }

    @Test
    public void test_testfun1(){
        DemoDao demoDao = new DemoDaoImpl();
        demoDao.testfun1();
    }

    @Test
    public void test_testfun2(){
        DemoDao demoDao = new DemoDaoImpl();
        demoDao.testfun2(10);
    }
}