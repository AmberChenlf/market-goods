package com.qianfeng.market.controller.pages.back.miaosha;

import com.qianfeng.market.pojo.dto.ResponseDTO;
import com.qianfeng.market.pojo.entity.Goods;
import com.qianfeng.market.redis.RedisUtil;
import com.qianfeng.market.service.GoodsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class miaoShaController {
   @Resource
    RedisUtil redisUtil;
   @Resource
    GoodsServices goodsServices;
    public String miaosha(Integer goodsId) throws Exception {
        String key = "goods_"+goodsId;


            //redisUtil.watch(key);
        int count = Integer.parseInt(redisUtil.get(key));
            if(count<=0){
                throw new Exception("商品已经售完！");
            }else {
                synchronized (this) {
                    int count3 = Integer.parseInt(redisUtil.get(key));
                    if(count3<=0){
                        throw new Exception("商品已经售完！");
                    }
                    System.out.println("秒杀前：" + count3);
                    redisUtil.incr(key, -1);
                    System.out.println("秒杀后：" + redisUtil.get(key));
                }
            }
            //redisUtil.unwatch();
            System.out.println("秒杀成功");
            //秒杀结束后更新数据库
        int count2 = Integer.parseInt(redisUtil.get(key));
        ResponseDTO re = goodsServices.updateGoodsByCount(goodsId, count2);
        redisUtil.delete(key);
        return null;
        }
    }


