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
}