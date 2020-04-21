package com.qianfeng.market.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer userId;

    /**
     * 昵称

     */
    private String nickName;

    /**
     * 真名

     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 用户登录密码
     */
    private String password;

    /**
     * 最后登录时间
     */
    private Date lastLoginTime;

    /**
     * 最后登录ip
     */
    private String lastLoginIp;

    private static final long serialVersionUID = 1L;

//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
//
//    public String getNickName() {
//        return nickName;
//    }
//
//    public void setNickName(String nickName) {
//        this.nickName = nickName;
//    }
//
//    public String getRealName() {
//        return realName;
//    }
//
//    public void setRealName(String realName) {
//        this.realName = realName;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Date getLastLoginTime() {
//        return lastLoginTime;
//    }
//
//    public void setLastLoginTime(Date lastLoginTime) {
//        this.lastLoginTime = lastLoginTime;
//    }
//
//    public String getLastLoginIp() {
//        return lastLoginIp;
//    }
//
//    public void setLastLoginIp(String lastLoginIp) {
//        this.lastLoginIp = lastLoginIp;
//    }
}