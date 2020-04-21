package com.qianfeng.market.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * user_order
 * @author 
 */
public class UserOrder implements Serializable {
    /**
     * 订单id
     */
    private String orderId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 总金额
     */
    private Double allCost;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 付款时间
     */
    private Date payTime;

    /**
     * 收货人电话
     */
    private String receiverPhone;

    /**
     * 收货人名字
     */
    private String receiverName;

    /**
     * 收货人地址
     */
    private String receiverAddress;

    /**
     * 付款方式：支付宝，微信，银行卡
     */
    private String payType;

    /**
     * 订单状态：待付款，待收货，待评价，已取消
     */
    private String status;

    /**
     * 实际付款
     */
    private Double actualPayment;

    /**
     * 总减免
     */
    private Double totalDeduction;

    private static final long serialVersionUID = 1L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getAllCost() {
        return allCost;
    }

    public void setAllCost(Double allCost) {
        this.allCost = allCost;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getActualPayment() {
        return actualPayment;
    }

    public void setActualPayment(Double actualPayment) {
        this.actualPayment = actualPayment;
    }

    public Double getTotalDeduction() {
        return totalDeduction;
    }

    public void setTotalDeduction(Double totalDeduction) {
        this.totalDeduction = totalDeduction;
    }
}