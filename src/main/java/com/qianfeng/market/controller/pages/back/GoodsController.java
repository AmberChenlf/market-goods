package com.qianfeng.market.controller.pages.back;

import com.qianfeng.market.consts.GoodsConsts;
import com.qianfeng.market.controller.pages.BaseController;
import com.qianfeng.market.pojo.entity.Goods;
import com.qianfeng.market.service.GoodsServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/**
 * @author bingqiong.cbb
 * @date 2020-04-24 23:22
 **/
@Controller
@RequestMapping("/pages/back/goods")
public class GoodsController extends BaseController {
    @Resource
    GoodsServices goodsServices;
    @RequestMapping("addPre")
    String addPre(){
        return "pages/back/goods/goods-addPre";
    }

    @RequestMapping("add")
    @ResponseBody
    Map<String, Object> add(Goods goods, MultipartFile pic){
        System.out.println(goods);
        if ("on".equals(goods.getOnSale())){
            goods.setOnSale("YES");
        }else{
            goods.setOnSale("NO");
        }
        String imgUrl = uploadFile("upload/goods/",pic);
        goods.setImg(imgUrl);

        return goodsServices.add(goods);
    }


}
