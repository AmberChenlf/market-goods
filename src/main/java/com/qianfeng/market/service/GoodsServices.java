package com.qianfeng.market.service;

import com.qianfeng.market.pojo.entity.Goods;

import java.util.Map;

/**
 * @author bingqiong.cbb
 * @date 2020-04-27 01:38
 **/

public interface GoodsServices {
    /**
     * 增加商品
     */
    Map<String, Object> add(Goods goods);

}
