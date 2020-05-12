package com.qianfeng.market.controller;


import com.qianfeng.market.dao.UserDao;
import com.qianfeng.market.pojo.entity.Goods;
import com.qianfeng.market.pojo.entity.User;
import com.qianfeng.market.service.GoodsServices;
import com.qianfeng.market.service.GoodsTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author bingqiong.cbb
 * @date 2020-04-20 21:42
 **/
@Controller
public class IndexController {
    @Resource
    UserDao userDao;

    @Resource
    GoodsTypeService goodsTypeService;

    @Resource
    GoodsServices goodsServices;

    @RequestMapping("/")
    @ResponseBody   //表示返回json字符串给前端
    String index(){
        Goods g = goodsServices.getGoodsById(1);

        Goods s = goodsServices.getGoodsById(1);
        //model.addAttribute("types",goodsTypeService.selectTypesByParentId(-1));

        return "c1";
    }


}
