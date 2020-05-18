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
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 15; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run()  {
                    try {
                        m.miaosha(1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            threads[i].start();

        }
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
