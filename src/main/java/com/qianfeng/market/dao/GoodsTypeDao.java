package com.qianfeng.market.dao;

import com.qianfeng.market.pojo.entity.GoodsType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsTypeDao {
    int deleteByPrimaryKey(Integer goodsTypeId);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer goodsTypeId);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);
}