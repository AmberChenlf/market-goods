package com.qianfeng.market.pojo.entity;

import java.io.Serializable;

/**
 * order_info
 * @author 
 */
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
    private Integer img;

    /**
     * 下单时的原价

     */
    private Double oldPrice;

    private static final long serialVersionUID = 1L;

    public Integer getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(Integer orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getOrginGoodsId() {
        return orginGoodsId;
    }

    public void setOrginGoodsId(Integer orginGoodsId) {
        this.orginGoodsId = orginGoodsId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public Double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
    }
}