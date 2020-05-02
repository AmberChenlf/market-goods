package com.qianfeng.market.dao;

import com.qianfeng.market.pojo.entity.ShopCar;
import com.qianfeng.market.pojo.vo.ShopCarVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopCarDao {
    int deleteByPrimaryKey(Integer shopCarId);

    int insert(ShopCar record);

    int insertSelective(ShopCar record);

    ShopCar selectByPrimaryKey(Integer shopCarId);

    int updateByPrimaryKeySelective(ShopCar record);

    int updateByPrimaryKey(ShopCar record);

    ShopCar findCarByUserIdAndGoodsId(ShopCar shopCar);

    Integer selectCarCountByUserId(Integer userId);

    /**
     * 根据用户id查找购物车
     * @param userId
     * @return
     */
    List<ShopCarVO> findUserCars(Integer userId);
}