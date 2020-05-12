package com.qianfeng.market.service.impl;

import com.qianfeng.market.dao.OrderInfoDao;
import com.qianfeng.market.dao.UserOrderDao;
import com.qianfeng.market.pojo.dto.ResponseDTO;
import com.qianfeng.market.pojo.entity.UserOrder;
import com.qianfeng.market.pojo.vo.ShopCarVO;
import com.qianfeng.market.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author bingqiong.cbb
 * @date 2020-05-05 13:04
 **/
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    UserOrderDao userOrderDao;

    @Resource
    OrderInfoDao orderInfoDao;
    @Override
    public ResponseDTO addOrder(UserOrder userOrder, List<ShopCarVO> carVOList) {

        return ResponseDTO.ok("成功");
    }
}
