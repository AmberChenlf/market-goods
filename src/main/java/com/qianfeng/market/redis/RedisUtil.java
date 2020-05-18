package com.qianfeng.market.redis;

import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.*;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class RedisUtil {


//    @Autowired
//    private RedisTemplate redisTemplate;
//
//    /**
//     * 读取缓存
//     * @param key
//     * @return
//     */
//    public Object get(final String key){
//        return redisTemplate.opsForValue().get(key);
//    }
//
//    /**
//     * 写入缓存
//     * @param key
//     * @param value
//     * @return
//     */
//    public boolean set(final String key,Object value){
//        boolean result = false;
//        try{
//            redisTemplate.opsForValue().set(key,value);
//            result = true;
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        return result;
//    }
//
//    /**
//     * 更新缓存
//     * @param key
//     * @param value
//     * @return
//     */
//    public boolean getAndSet(final String key, Object value){
//        boolean result = false;
//        try{
//            redisTemplate.opsForValue().getAndSet(key, value);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return result;
//    }
//
//    /**
//     * 删除缓存
//     * @param key
//     * @return
//     */
//    public boolean delete(final String key){
//        boolean result = false;
//        try{
//            redisTemplate.delete(key);
//            result = true;
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return result;
//    }
//
//    public  boolean hashKey(final String key){
//        return redisTemplate.hasKey(key);
//    }

    private static Jedis jedis = new Jedis("127.0.0.1",6379);
    public static long set(String key, String field,String value){
        long returnStatus = jedis.hset(key,field,value);
        return returnStatus;
    }
    public static String get(String key,String field){
        String returnStatus = jedis.hget(key, field);
        return returnStatus;
    }
    public static long incr(String key,String field,int value){
        long j = jedis.hincrBy(key,field,value);
        return j;
    }
    public static void watch(String key){
        jedis.watch(key);
    }
    public static void unwatch(){
        jedis.unwatch();
    }

    /**
     * 是否存在
     * @param key
     * @param field
     * @return
     */
    public static boolean exist(String key,String field){
        boolean status = jedis.hexists(key,field);
        return status;
    }



}
