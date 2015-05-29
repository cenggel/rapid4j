package com.v5ent.rapid4j.test.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.v5ent.rapid4j.core.feature.orm.mybatis.Page;
import com.v5ent.rapid4j.core.feature.test.TestSupport;
import com.v5ent.rapid4j.web.dao.UserMapper;
import com.v5ent.rapid4j.web.model.User;
import com.v5ent.rapid4j.web.model.UserExample;

public class UserMapperTest extends TestSupport {
    @Resource
    private UserMapper userMapper;

    @Test
    public void test_selectByExampleAndPage() {
        start();
        Page<User> page = new Page<User>(1, 3);
        UserExample example = new UserExample();
        example.createCriteria().andIdGreaterThan(0L);
        final List<User> users = userMapper.selectByExampleAndPage(page, example);
        for (User user : users) {
            System.err.println(user);
        }
        end();
    }
}
