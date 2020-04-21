package com.qianfeng.market.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bingqiong.cbb
 * @date 2020-04-20 21:42
 **/
@Controller
public class IndexController {
    @RequestMapping("/")
    //@ResponseBody   //表示返回json字符串给前端
    String index(){
        return "index";
    }
}
