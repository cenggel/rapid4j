package com.v5ent.rapid4j.test.service;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;

import com.v5ent.rapid4j.core.feature.test.TestSupport;
import com.v5ent.rapid4j.core.util.ApplicationUtils;
import com.v5ent.rapid4j.web.model.User;
import com.v5ent.rapid4j.web.service.UserService;

public class UserServiceTest extends TestSupport {

    @Resource
    private UserService userService;

    @Test
    public void test_10insert() {
        for (int i = 0; i < 10; i++) {
            User model = new User();
            model.setUsername("kermit" + i);
            model.setPassword(ApplicationUtils.sha256Hex("123456"));
            model.setCreateTime(new Date());
            userService.insert(model);
        }
    }

}
