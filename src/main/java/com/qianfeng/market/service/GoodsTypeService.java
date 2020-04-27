package com.qianfeng.market.service;

import com.qianfeng.market.pojo.entity.Goods;
import com.qianfeng.market.pojo.entity.GoodsType;

import java.util.Map;

/**
 * @author bingqiong.cbb
 * @date 2020-04-28 00:25
 **/
public interface GoodsTypeService {
    Map<String,Object> add(GoodsType goodsType);
}
