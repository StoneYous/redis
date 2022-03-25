package cn.ccsu.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @Description:
 * @Author: szq
 * @Date:Created in 2022/3/25 16:22
 * @Modified By:
 */
public class TestRedis {

    @Test
    public void testJedis(){
        Jedis jedis = new Jedis("172.17.37.55",6379);
        String set = jedis.set("name", "stone");
        jedis.close();
    }
}
