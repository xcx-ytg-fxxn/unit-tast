/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.cobostack.service.mock;

/**
 * @author leran.xm
 * @version : UserServiceTest.java, v 0.1 2023年03月15日 3:04 下午 leran.xm Exp $
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({UserService.class})
public class UserServiceTest {

    @Test
    public void test_calcAge() {
        UserService userService = new UserService();
        mockStatic(UserService.class);
        when(UserService.getAge()).thenReturn(10);
        userService.calcAge();
        // spy(userService);
        // doReturn(30).when(userService, "addAge", any());
        // userService.calcAge();
    }

}