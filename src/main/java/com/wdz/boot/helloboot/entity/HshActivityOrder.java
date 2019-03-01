package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_activity_order")
public class HshActivityOrder {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 活动订单ID
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 交易流水号
     */
    @Column(name = "trade_no")
    private String tradeNo;

    /**
     * 活动ID
     */
    @Column(name = "activity_id")
    private Long activityId;

    /**
     * 下单人ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 1余额 2微信 3积分
     */
    @Column(name = "pay_mode")
    private Integer payMode;

    /**
     * 收货人手机号
     */
    @Column(name = "receiver_mobile")
    private String receiverMobile;

    /**
     * 收货人姓名
     */
    @Column(name = "receiver_name")
    private String receiverName;

    /**
     * 订单创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     *  订单更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 开始领取时间
     */
    @Column(name = "get_start_time")
    private Date getStartTime;

    /**
     * 结束领取时间
     */
    @Column(name = "get_end_time")
    private Date getEndTime;

    /**
     * 订单过期时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 领取次数 最多12次
     */
    @Column(name = "get_num")
    private Long getNum;

    /**
     * 1待支付 2已支付(领取中)3:已完成
     */
    @Column(name = "order_status")
    private Byte orderStatus;

    /**
     * 客服修改次数的人
     */
    @Column(name = "customer_id")
    private Long customerId;

    /**
     * 最后修改客服
     */
    @Column(name = "last_name")
    private String lastName;

    /**
     * 预留字段
     */
    @Column(name = "cus_num_1")
    private String cusNum1;

    /**
     *  活动福利卡
     */
    @Column(name = "cus_num_2")
    private Long cusNum2;

    /**
     * 预留字段|上级分享ID
     */
    @Column(name = "cus_num_3")
    private String cusNum3;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取活动订单ID
     *
     * @return order_id - 活动订单ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置活动订单ID
     *
     * @param orderId 活动订单ID
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取交易流水号
     *
     * @return trade_no - 交易流水号
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * 设置交易流水号
     *
     * @param tradeNo 交易流水号
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * 获取活动ID
     *
     * @return activity_id - 活动ID
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * 设置活动ID
     *
     * @param activityId 活动ID
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取下单人ID
     *
     * @return user_id - 下单人ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置下单人ID
     *
     * @param userId 下单人ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取1余额 2微信 3积分
     *
     * @return pay_mode - 1余额 2微信 3积分
     */
    public Integer getPayMode() {
        return payMode;
    }

    /**
     * 设置1余额 2微信 3积分
     *
     * @param payMode 1余额 2微信 3积分
     */
    public void setPayMode(Integer payMode) {
        this.payMode = payMode;
    }

    /**
     * 获取收货人手机号
     *
     * @return receiver_mobile - 收货人手机号
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * 设置收货人手机号
     *
     * @param receiverMobile 收货人手机号
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    /**
     * 获取收货人姓名
     *
     * @return receiver_name - 收货人姓名
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置收货人姓名
     *
     * @param receiverName 收货人姓名
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * 获取订单创建时间
     *
     * @return create_time - 订单创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置订单创建时间
     *
     * @param createTime 订单创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取支付时间
     *
     * @return pay_time - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取 订单更新时间
     *
     * @return update_time -  订单更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 订单更新时间
     *
     * @param updateTime  订单更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取开始领取时间
     *
     * @return get_start_time - 开始领取时间
     */
    public Date getGetStartTime() {
        return getStartTime;
    }

    /**
     * 设置开始领取时间
     *
     * @param getStartTime 开始领取时间
     */
    public void setGetStartTime(Date getStartTime) {
        this.getStartTime = getStartTime;
    }

    /**
     * 获取结束领取时间
     *
     * @return get_end_time - 结束领取时间
     */
    public Date getGetEndTime() {
        return getEndTime;
    }

    /**
     * 设置结束领取时间
     *
     * @param getEndTime 结束领取时间
     */
    public void setGetEndTime(Date getEndTime) {
        this.getEndTime = getEndTime;
    }

    /**
     * 获取订单过期时间
     *
     * @return end_time - 订单过期时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置订单过期时间
     *
     * @param endTime 订单过期时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取领取次数 最多12次
     *
     * @return get_num - 领取次数 最多12次
     */
    public Long getGetNum() {
        return getNum;
    }

    /**
     * 设置领取次数 最多12次
     *
     * @param getNum 领取次数 最多12次
     */
    public void setGetNum(Long getNum) {
        this.getNum = getNum;
    }

    /**
     * 获取1待支付 2已支付(领取中)3:已完成
     *
     * @return order_status - 1待支付 2已支付(领取中)3:已完成
     */
    public Byte getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置1待支付 2已支付(领取中)3:已完成
     *
     * @param orderStatus 1待支付 2已支付(领取中)3:已完成
     */
    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取客服修改次数的人
     *
     * @return customer_id - 客服修改次数的人
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * 设置客服修改次数的人
     *
     * @param customerId 客服修改次数的人
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取最后修改客服
     *
     * @return last_name - 最后修改客服
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 设置最后修改客服
     *
     * @param lastName 最后修改客服
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 获取预留字段
     *
     * @return cus_num_1 - 预留字段
     */
    public String getCusNum1() {
        return cusNum1;
    }

    /**
     * 设置预留字段
     *
     * @param cusNum1 预留字段
     */
    public void setCusNum1(String cusNum1) {
        this.cusNum1 = cusNum1;
    }

    /**
     * 获取 活动福利卡
     *
     * @return cus_num_2 -  活动福利卡
     */
    public Long getCusNum2() {
        return cusNum2;
    }

    /**
     * 设置 活动福利卡
     *
     * @param cusNum2  活动福利卡
     */
    public void setCusNum2(Long cusNum2) {
        this.cusNum2 = cusNum2;
    }

    /**
     * 获取预留字段|上级分享ID
     *
     * @return cus_num_3 - 预留字段|上级分享ID
     */
    public String getCusNum3() {
        return cusNum3;
    }

    /**
     * 设置预留字段|上级分享ID
     *
     * @param cusNum3 预留字段|上级分享ID
     */
    public void setCusNum3(String cusNum3) {
        this.cusNum3 = cusNum3;
    }
}