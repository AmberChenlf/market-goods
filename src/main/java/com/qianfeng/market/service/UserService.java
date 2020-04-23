package com.qianfeng.market.service;

import com.qianfeng.market.pojo.entity.User;

/**
 * 关于用户的一些业务操作
 * @author bingqiong.cbb
 * @date 2020-04-24 01:37
 **/
public interface UserService {

    /**
     * 登录操作
     * @param user
     * @return
     */

    boolean login(User user);

}
