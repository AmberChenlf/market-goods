package com.qianfeng.market;

import com.qianfeng.market.controller.pages.back.miaosha.miaoShaController;
import com.qianfeng.market.service.GoodsServices;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MarketGoodsApplicationTests {
    @Resource
    GoodsServices goodsServices;
    @Resource
    miaoShaController m;
    @Test
    void contextLoads() {
        goodsServices.getGoodsById(1);
        String s = m.miaosha(1);
    }

}
