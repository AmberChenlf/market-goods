package com.qianfeng.market.service;

import com.qianfeng.market.pojo.dto.ResponseDTO;
import com.qianfeng.market.pojo.entity.Goods;
import com.qianfeng.market.pojo.entity.GoodsType;

import java.util.List;
import java.util.Map;

/**
 * @author bingqiong.cbb
 * @date 2020-04-28 00:25
 **/
public interface GoodsTypeService {
    /**
     * 增加商品类型
     * @param goodsType
     * @return
     */
    ResponseDTO add(GoodsType goodsType);

    /**
     * 查看所有一级商品类型
     * @return
     */
    List<GoodsType> selectTypesByParentId(int i);
}
