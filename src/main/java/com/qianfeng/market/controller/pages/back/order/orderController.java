package com.qianfeng.market.controller.pages.back.order;

import com.alibaba.fastjson.JSON;
import com.qianfeng.market.controller.pages.BaseController;
import com.qianfeng.market.pojo.dto.ResponseDTO;
import com.qianfeng.market.pojo.entity.UserOrder;
import com.qianfeng.market.pojo.vo.ShopCarVO;
import com.qianfeng.market.service.AddressService;
import com.qianfeng.market.service.OrderService;
import com.qianfeng.market.util.MathUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author bingqiong.cbb
 * @date 2020-05-03 04:56
 **/
@Controller
@RequestMapping("/pages/back/order")

public class orderController  extends  BaseController{

        @Resource
        AddressService addressService;

        @Resource
        OrderService orderService;

        @RequestMapping("addPre")
        String addPre( String orderInfoStr, Double allShop,Model model){

            //变成集合
            List<ShopCarVO> carVOList = JSON.parseArray(orderInfoStr, ShopCarVO.class);
            //todo 只能传递过来一个
            //System.out.println(ListUtils.size(carVOList));

            model.addAttribute("cars",carVOList);
            double allRelief = allShop * Math.random();
            double actullyPaid = allShop-allRelief;

            model.addAttribute("actullyPaid",actullyPaid);
            model.addAttribute("allCost",allShop);
            model.addAttribute("allRelief", MathUtil.round(allRelief,2));

            //设置用户的默认地址
            model.addAttribute("morenAddress",addressService.getDefaultAddress(getUserId()));
            //用户所有收货地址
            model.addAttribute("addressList",addressService.getUserAddressList(getUserId()));
            model.addAttribute("orderInfo",orderInfoStr);

            return "pages/back/order/add-pre";

        }

    /**
     * 提交订单
     * @return
     */
    @RequestMapping("add")
    String add(UserOrder userOrder,String orderInfo){
        List<ShopCarVO> carVOList = JSON.parseArray(orderInfo, ShopCarVO.class);
        for(ShopCarVO s:carVOList){

        }
        String orderId = System.currentTimeMillis()+MathUtil.getRandomStr(3);
        userOrder.setOrderId(orderId);

        userOrder.setStatus("待付款");
        userOrder.setCreateTime(new Date());
        userOrder.setUserId(getUserId());
        System.out.println(userOrder);

        ResponseDTO res = orderService.addOrder(userOrder, carVOList);
        return "pages/back/order/add-pre";


    }









}
