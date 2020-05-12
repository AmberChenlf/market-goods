package com.qianfeng.market.pojo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * order_info
 * @author 
 */
@Data
public class OrderInfo implements Serializable {
    private Integer orderInfoId;

    private String orderId;

    /**
     * 原来的商品链接
     */
    private Integer orginGoodsId;

    /**
     * 当时商品价格

     */
    private Double price;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 商品下单时的图片
     */
    private String img;

    /**
     * 下单时的原价

     */

}