package com.qianfeng.market.controller.pages.front.goods;

import com.qianfeng.market.controller.pages.BaseController;
import com.qianfeng.market.service.GoodsServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author bingqiong.cbb
 * @date 2020-05-01 16:12
 **/
@Controller
@RequestMapping("/pages/front/goods")
public class GoodsControllerFront extends BaseController {
    @Resource
    GoodsServices goodsServices;

    @RequestMapping("goodsDetail/{id}")
    String goodsDetail(@PathVariable Integer id, Model model){
        model.addAttribute("goods",goodsServices.getgoodsDetail(id));
        return "pages/front/goods/goods-detail";
    }
}
