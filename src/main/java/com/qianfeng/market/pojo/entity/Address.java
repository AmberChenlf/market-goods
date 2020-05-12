package com.qianfeng.market.pojo.entity;


import lombok.Data;

import java.io.Serializable;

/**
 * address
 * @author 
 */
@Data
public class Address implements Serializable {
    private Integer addressId;

    private Integer userId;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 地区
     */
    private String area;

    /**
     * 详细地址
     */
    private String detailAddress;

    /**
     * 电话
     */
    private String phone;

    /**
     * 收货人
     */
    private String receiver;

    private String moren;

    private String tag;
}