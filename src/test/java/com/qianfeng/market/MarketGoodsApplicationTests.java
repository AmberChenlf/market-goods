package com.qianfeng.market;

import com.qianfeng.market.controller.pages.back.miaosha.MiaoShaController;
import com.qianfeng.market.dao.GoodsDao;
import com.qianfeng.market.pojo.entity.Goods;
import com.qianfeng.market.service.GoodsServices;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MarketGoodsApplicationTests {
    @Resource
    GoodsServices goodsServices;
    @Resource
    MiaoShaController m;

    @Resource
    GoodsDao goodsDao;


    @Test
    void contextLoads() {
        Goods goods = goodsDao.selectByPrimaryKey(1);
        System.out.println(goods.getTitle());
    }

    @Test
    void testInit(){
        //System.out.println("do");
        try {
            m.miaosha(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
