package com.qianfeng.market.pojo.vo;

import com.qianfeng.market.pojo.entity.Goods;
import com.qianfeng.market.pojo.entity.ShopCar;
import lombok.Data;

/**
 * @author bingqiong.cbb
 * @date 2020-05-02 21:48
 **/
@Data
public class ShopCarVO extends ShopCar {
    /**
     * 购物车的商品
     *
     */
    private Goods goods;
}
