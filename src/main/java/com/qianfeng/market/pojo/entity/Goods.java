package com.qianfeng.market.pojo.entity;

import java.io.Serializable;

/**
 * goods
 * @author 
 */
public class Goods implements Serializable {
    /**
     * 商品主键id
     */
    private Integer goodsId;

    /**
     * 商品名称
     */
    private String title;

    /**
     * 商品图片

     */
    private String img;

    /**
     * 商品类型id

     */
    private Integer goodsTypeId;

    /**
     * 原价
     */
    private Double oldPrice;

    /**
     * 现价
     */
    private Double price;

    /**
     * 是否在售：YES or NO
     */
    private String onSale;

    /**
     * 详情
     */
    private Integer detail;

    /**
     * 库存

     */
    private Integer count;

    /**
     * 商家名称
     */
    private String merchantName;

    /**
     * 评价
     */
    private Integer evaluationCount;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public Double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getOnSale() {
        return onSale;
    }

    public void setOnSale(String onSale) {
        this.onSale = onSale;
    }

    public Integer getDetail() {
        return detail;
    }

    public void setDetail(Integer detail) {
        this.detail = detail;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Integer getEvaluationCount() {
        return evaluationCount;
    }

    public void setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
    }
}