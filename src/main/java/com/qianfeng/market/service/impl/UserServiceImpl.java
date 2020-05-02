package com.qianfeng.market.service.impl;

import com.qianfeng.market.dao.UserDao;
import com.qianfeng.market.pojo.entity.User;
import com.qianfeng.market.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author bingqiong.cbb
 * @date 2020-04-24 01:40
 **/
@Service//交给spring ioc容器管理，后边可以自动装配管理
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public boolean login(User user) {
        User dbuser = userDao.selectByPhone(user.getPhone());

        if(dbuser == null){
            return false;
        }else{
            if(user.getPassword() == null){//如果传递的密码为空，则传递失败
                return false;
            }
//            传过来的密码等于数据库查到的密码
            if(dbuser.getPassword().equals(user.getPassword())){

                return true;
            }
        }


        return false;
    }

    /**
     * 根据用户手机号查找用户
     *
     * @param phone
     * @return
     */
    @Override
    public User getUserByPhone(String phone) {
        return userDao.selectByPhone(phone);
    }
}
