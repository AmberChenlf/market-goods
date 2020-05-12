package com.qianfeng.market.dao;

import com.qianfeng.market.pojo.entity.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AddressDao {
    int deleteByPrimaryKey(Integer addressId);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKeyWithBLOBs(Address record);

    int updateByPrimaryKey(Address record);

    /**
     * 根据userId查找address
     * @param userId
     * @return
     */
    Address selectByUserId(@Param("userId") Integer userId,@Param("moren") String yes);

    /**
     * 查找用户的所有地址
     * @param userId
     * @return
     */
    List<Address> getUserAddressList(Integer userId);
}