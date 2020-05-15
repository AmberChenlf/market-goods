package com.qianfeng.market.init;


import com.qianfeng.market.service.GoodsServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class InitProject implements ApplicationRunner {
    @Resource
    GoodsServices goodsServices;
    private static final Logger LOG = LoggerFactory.getLogger(InitProject.class);
    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOG.info("=========INIT PROJECT=========");
        //预热，把商品数据放到redis中
        goodsServices.getGoodsById(1);


    }
}
