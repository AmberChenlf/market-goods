package com.qianfeng.market.service;

import com.qianfeng.market.pojo.entity.Address;

import java.util.List;

/**
 * @author bingqiong.cbb
 * @date 2020-05-03 13:49
 **/
public interface AddressService {
    /**
     * 根据用户id查找默认地址
     * @param userId
     * @return
     */
    Address getDefaultAddress(Integer userId);


    List<Address> getUserAddressList(Integer userId);
}
