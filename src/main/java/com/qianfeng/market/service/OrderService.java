package com.qianfeng.market.service;

import com.qianfeng.market.pojo.dto.ResponseDTO;
import com.qianfeng.market.pojo.entity.UserOrder;
import com.qianfeng.market.pojo.vo.ShopCarVO;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author bingqiong.cbb
 * @date 2020-05-05 12:54
 **/
public interface OrderService{
    @Transactional(propagation = Propagation.REQUIRED)
    ResponseDTO addOrder(UserOrder userOrder, List<ShopCarVO> carVOList);
}
