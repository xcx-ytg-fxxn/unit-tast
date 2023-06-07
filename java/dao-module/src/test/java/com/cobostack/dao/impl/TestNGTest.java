package com.cobostack.dao.impl;

import com.cobostack.dao.DemoDao;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;


/**
 * @author Xu_Ming
 * @version 1.0, 2023/3/14
 */

public class TestNGTest {

    @Test
    public void test_select() {
        DemoDao demoDao = new DemoDaoImpl();
        demoDao.select();
        System.out.println("testng ----");
    }

    @Test
    public void test_select1() {
        DemoDao demoDao = new DemoDaoImpl();
        Assert.assertEquals(demoDao.select(1),2,"断言失败");
    }
}