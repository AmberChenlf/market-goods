package com.qianfeng.market.service;

import com.qianfeng.market.pojo.dto.ResponseDTO;
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
    /**
     * 根据商品类型寻找这个类型的所有商品
     */
    ResponseDTO getGoodsByTypeId(Integer id);

    /**
     * 根据idc查看商品
     * @param id
     * @return
     */
    Goods getgoodsDetail(Integer id);

    /**
     * 通过id获取商品（redis测试）
     * @param id
     * @return
     */
    Goods getGoodsById(Integer id);

}
