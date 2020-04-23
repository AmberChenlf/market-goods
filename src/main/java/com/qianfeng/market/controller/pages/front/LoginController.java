package com.qianfeng.market.controller.pages.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这个类事一个登录的控制器，完成登录检验等功能
 * @author bingqiong.cbb
 * @date 2020-04-22 22:57
 **/
@Controller
@RequestMapping("/pages/front")
public class LoginController {
    @RequestMapping("loginPage")
    String loginPage(){
        return "pages/front/login/loginPage.html";
    }
}
