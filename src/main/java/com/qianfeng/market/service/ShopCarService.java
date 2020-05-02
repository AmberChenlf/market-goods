package com.qianfeng.market.service;

import com.qianfeng.market.pojo.dto.ResponseDTO;
import com.qianfeng.market.pojo.entity.ShopCar;
import com.qianfeng.market.pojo.vo.ShopCarVO;

import java.util.List;

/**
 * @author bingqiong.cbb
 * @date 2020-05-01 20:09
 **/
public interface ShopCarService {
    /**
     *
     * @param shopCar
     * @return
     */
    ResponseDTO edit(ShopCar shopCar);

    /**
     * 根据userId获得shopcar count
     * @param userId
     * @return
     */
    Integer getCarCountByUserId(Integer userId);

    List<ShopCarVO> findUserCar(Integer id);
}
