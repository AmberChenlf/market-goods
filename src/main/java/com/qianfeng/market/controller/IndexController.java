package com.qianfeng.market.controller;


import com.qianfeng.market.dao.UserDao;
import com.qianfeng.market.pojo.entity.User;
import org.springframework.stereotype.Controller;
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

    @RequestMapping("/")
    //@ResponseBody   //表示返回json字符串给前端
    String index(){
        User user = userDao.selectByPrimaryKey(1);
        String name = user.getNickName();
        System.out.println(name);
        return "index";
    }


}
