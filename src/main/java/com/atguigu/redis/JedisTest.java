package com.atguigu.redis;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

/**
 * @author darren
 * @create 2021-03-22 20:12
 */
public class JedisTest {

    @Test
    public void Test01(){
        Jedis jedis = new Jedis("192.168.6.4", 6379, 20000);
        String ping = jedis.ping();
        System.out.println("ping:"+ping);

        //关闭
        jedis.close();
    }




}
