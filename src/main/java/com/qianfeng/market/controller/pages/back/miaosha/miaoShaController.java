package com.qianfeng.market.controller.pages.back.miaosha;

import com.qianfeng.market.pojo.entity.Goods;
import com.qianfeng.market.redis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class miaoShaController {
   @Resource
    RedisUtil redisUtil;
    public String miaosha(Integer goodsId) throws Exception {
        String key = "goods_"+goodsId;
        //synchronized (this) {

            redisUtil.watch(key);
            System.out.println(redisUtil.get(key,"count"));
            if(Integer.parseInt(redisUtil.get(key,"count"))<=0){
                throw new Exception("商品已经售完！");
            }else {
                System.out.println("秒杀前：" + redisUtil.get(key,"count"));
                redisUtil.incr(key,"count",-1);
                System.out.println("秒杀后：" + redisUtil.get(key,"count"));
                System.out.println("秒杀成功");


            }
            redisUtil.unwatch();
            return "秒杀成功";
        }
    //}

}
