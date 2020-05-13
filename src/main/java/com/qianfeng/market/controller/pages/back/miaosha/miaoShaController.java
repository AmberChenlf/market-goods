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
    public String miaosha(Integer goodsId){
        String key = "goods_"+goodsId;
        Goods goods = (Goods)redisUtil.get(key);
        System.out.println("秒杀前："+goods.getCount());
        goods.setCount(goods.getCount()-1);
        redisUtil.getAndSet(key, goods);
        Goods goods2 = (Goods)redisUtil.get(key);
        System.out.println("秒杀后："+goods2.getCount());
        return goods.getTitle();
    }

}