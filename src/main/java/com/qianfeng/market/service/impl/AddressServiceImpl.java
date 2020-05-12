package com.qianfeng.market.service.impl;

import com.qianfeng.market.dao.AddressDao;
import com.qianfeng.market.pojo.entity.Address;
import com.qianfeng.market.service.AddressService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author bingqiong.cbb
 * @date 2020-05-03 13:50
 **/
@Service
public class AddressServiceImpl implements AddressService {
    /**
     * 根据用户id查找默认地址
     *
     * @param userId
     * @return
     */
    @Resource
    AddressDao addressDao;
    @Override
    public Address getDefaultAddress(Integer userId) {
        Address ad =  addressDao.selectByUserId(userId, "YES");
        if(ad == null){
            ad =  addressDao.selectByUserId(userId, "NO");
        }
        return ad;
    }

    @Override
    public List<Address> getUserAddressList(Integer userId) {
        return addressDao.getUserAddressList(userId);
    }
}
