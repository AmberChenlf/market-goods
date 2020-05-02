package com.qianfeng.market.controller.pages.back.shopcar;

import com.qianfeng.market.controller.pages.BaseController;
import com.qianfeng.market.pojo.dto.ResponseDTO;
import com.qianfeng.market.pojo.entity.Goods;
import com.qianfeng.market.pojo.entity.ShopCar;
import com.qianfeng.market.pojo.vo.ShopCarVO;
import com.qianfeng.market.service.GoodsServices;
import com.qianfeng.market.service.GoodsTypeService;
import com.qianfeng.market.service.ShopCarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @author bingqiong.cbb
 * @date 2020-04-24 23:22
 **/
@Controller
@RequestMapping("/pages/back/shopCar")
public class ShopCarController extends BaseController {
    @Resource
    ShopCarService shopCarService;

    /**
     * 添加商品到购物车
     * @param shopCar
     * @return
     */
    @RequestMapping("edit")
    ResponseDTO edit(ShopCar shopCar, HttpSession session){
        //如果userId为空，则返回错误代码401
        if(StringUtils.isEmpty(session.getAttribute("userId"))){

            return ResponseDTO.fail("操作失败，请登录",null,401,401);

        }
        shopCar.setUserId((Integer)session.getAttribute("userId"));
        return shopCarService.edit(shopCar);
    }

    /**
     * 根据用户查询购物车
     * @param
     * @return
     */
    @RequestMapping("showMyCar")
    String showMyCar(Model model){
        if(!StringUtils.isEmpty(getUserId())){
            List<ShopCarVO> cars = shopCarService.findUserCar(getUserId());
            model.addAttribute("cars",cars);
        }else{
            ResponseDTO.fail("请先登录");
            return "pages/front/login/loginPage";
        }

        return "/pages/back/shopcar/car-list";

    }





}
