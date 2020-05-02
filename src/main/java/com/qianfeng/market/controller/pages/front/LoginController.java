package com.qianfeng.market.controller.pages.front;

import com.qianfeng.market.pojo.entity.ShopCar;
import com.qianfeng.market.pojo.entity.User;
import com.qianfeng.market.service.ShopCarService;
import com.qianfeng.market.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * 这个类事一个登录的控制器，完成登录检验等功能
 * @author bingqiong.cbb
 * @date 2020-04-22 22:57
 **/
@Controller
@RequestMapping("/pages/front")
public class LoginController {
    @Resource
    UserService userService;

    @Resource
    ShopCarService shopCarService;

    @RequestMapping("loginPage")
    String loginPage(){

        return "pages/front/login/loginPage.html";
    }

    /**
     * 验证用户名，执行登录操作
     * @return
     */
    @RequestMapping("login")
    String login(User user, Model model, HttpSession session){
        if ("".equals(user.getPhone()) || user.getPhone()==null){//电话都不传，登录失败，继续返回鞥路界面
            model.addAttribute("errorMsg","请输入手机号登录");
            return "pages/front/login/loginPage.html";

        }
        boolean loginResult=userService.login(user);


        if(loginResult){//登录成功
            User dbUser = userService.getUserByPhone(user.getPhone());
            //把userId设置到session中
            session.setAttribute("userId", dbUser.getUserId());

            //把购物车数量放在session中
            session.setAttribute("carCount",shopCarService.getCarCountByUserId( dbUser.getUserId()));

            //return "pages/back/index.html";
            return "pages/back/index";
        }
        model.addAttribute("errorMsg","登录失败，手机号或者密码错误");

        return "pages/front/login/loginPage.html";
    }
}
