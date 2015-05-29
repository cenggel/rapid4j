package com.v5ent.rapid4j.test.library.jedis;

import com.v5ent.rapid4j.core.feature.cache.redis.RedisCache;
import com.v5ent.rapid4j.core.feature.test.TestSupport;

import org.junit.Test;

import javax.annotation.Resource;

/**
 * JedisTest : 测试 jedis 功能
 *
 * @author Mignet
 * @since 2015-03-20 10:32
 */
public class JedisTest extends TestSupport {


    @Resource
    private RedisCache redisCache;


    @Test
    public void testSet() {
        redisCache.cache("anchor", "Mignet", 1 * 60 * 24);
    }

    @Test
    public void testGet() {
        System.out.printf("anchor:%s \n",redisCache.get("anchor"));
    }
}
