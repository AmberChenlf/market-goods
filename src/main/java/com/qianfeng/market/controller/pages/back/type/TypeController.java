package com.qianfeng.market.controller.pages.back.type;

import com.qianfeng.market.controller.pages.BaseController;
import com.qianfeng.market.pojo.dto.ResponseDTO;
import com.qianfeng.market.pojo.entity.GoodsType;
import com.qianfeng.market.service.GoodsTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
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
    String addPre( Model model){
        model.addAttribute("types",goodsTypeService.selectTypesByParentId(-1));
        return "pages/back/type/type-addPre";
    }
    @RequestMapping("add")
    @ResponseBody
    ResponseDTO add(GoodsType goodsType){
        return goodsTypeService.add(goodsType);

    }
}
