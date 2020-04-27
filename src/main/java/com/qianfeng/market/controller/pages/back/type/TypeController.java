package com.qianfeng.market.controller.pages.back.type;

import com.qianfeng.market.controller.pages.BaseController;
import com.qianfeng.market.pojo.entity.GoodsType;
import com.qianfeng.market.service.GoodsTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author bingqiong.cbb
 * @date 2020-04-27 23:49
 **/
@Controller
@RequestMapping("/pages/back/type")
public class TypeController extends BaseController {
    @Resource
    GoodsTypeService goodsTypeService;
    @RequestMapping("addPre")
    String addPre(){
        return "pages/back/type/type-addPre";
    }
    @RequestMapping("add")
    @ResponseBody
    Map<String,Object> add(GoodsType goodsType){
        return goodsTypeService.add(goodsType);

    }
}
