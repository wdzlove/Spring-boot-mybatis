package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

public class Refund {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单ID
     */
    @Column(name = "ORDER_ID")
    private Long orderId;

    /**
     * 订单编号
     */
    @Column(name = "ORDER_SN")
    private String orderSn;

    /**
     * 用户ID
     */
    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    /**
     * 支付方式
     */
    @Column(name = "PAY_METHOD")
    private Integer payMethod;

    /**
     * 实际支付金额
     */
    @Column(name = "PAY_MONEY")
    private Double payMoney;

    /**
     * 支付时间
     */
    @Column(name = "PAY_DATE")
    private Long payDate;

    /**
     * 提交申请时间
     */
    @Column(name = "CREATE_DATE")
    private Long createDate;

    /**
     * 退款状态，0，申请退款，1，处理中，2已退款,3已驳回
     */
    @Column(name = "REFUND_STATUS")
    private Integer refundStatus;

    /**
     * 退款金额
     */
    @Column(name = "REFUND_MONEY")
    private Double refundMoney;

    /**
     * 退款日期
     */
    @Column(name = "REFUND_DATE")
    private Long refundDate;

    /**
     * 联系人姓名
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 联系人手机
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * 退款说明
     */
    @Column(name = "REFUND_REMARKS")
    private String refundRemarks;

    /**
     * 提交管理员
     */
    @Column(name = "SUBMIT_USER_ID")
    private Long submitUserId;

    /**
     * 操作管理员
     */
    @Column(name = "OPERATION_USER_ID")
    private Long operationUserId;

    /**
     * @return ID
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
     * 获取订单ID
     *
     * @return ORDER_ID - 订单ID
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID
     *
     * @param orderId 订单ID
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单编号
     *
     * @return ORDER_SN - 订单编号
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * 设置订单编号
     *
     * @param orderSn 订单编号
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    /**
     * 获取用户ID
     *
     * @return CUSTOMER_ID - 用户ID
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * 设置用户ID
     *
     * @param customerId 用户ID
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取支付方式
     *
     * @return PAY_METHOD - 支付方式
     */
    public Integer getPayMethod() {
        return payMethod;
    }

    /**
     * 设置支付方式
     *
     * @param payMethod 支付方式
     */
    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * 获取实际支付金额
     *
     * @return PAY_MONEY - 实际支付金额
     */
    public Double getPayMoney() {
        return payMoney;
    }

    /**
     * 设置实际支付金额
     *
     * @param payMoney 实际支付金额
     */
    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    /**
     * 获取支付时间
     *
     * @return PAY_DATE - 支付时间
     */
    public Long getPayDate() {
        return payDate;
    }

    /**
     * 设置支付时间
     *
     * @param payDate 支付时间
     */
    public void setPayDate(Long payDate) {
        this.payDate = payDate;
    }

    /**
     * 获取提交申请时间
     *
     * @return CREATE_DATE - 提交申请时间
     */
    public Long getCreateDate() {
        return createDate;
    }

    /**
     * 设置提交申请时间
     *
     * @param createDate 提交申请时间
     */
    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取退款状态，0，申请退款，1，处理中，2已退款,3已驳回
     *
     * @return REFUND_STATUS - 退款状态，0，申请退款，1，处理中，2已退款,3已驳回
     */
    public Integer getRefundStatus() {
        return refundStatus;
    }

    /**
     * 设置退款状态，0，申请退款，1，处理中，2已退款,3已驳回
     *
     * @param refundStatus 退款状态，0，申请退款，1，处理中，2已退款,3已驳回
     */
    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    /**
     * 获取退款金额
     *
     * @return REFUND_MONEY - 退款金额
     */
    public Double getRefundMoney() {
        return refundMoney;
    }

    /**
     * 设置退款金额
     *
     * @param refundMoney 退款金额
     */
    public void setRefundMoney(Double refundMoney) {
        this.refundMoney = refundMoney;
    }

    /**
     * 获取退款日期
     *
     * @return REFUND_DATE - 退款日期
     */
    public Long getRefundDate() {
        return refundDate;
    }

    /**
     * 设置退款日期
     *
     * @param refundDate 退款日期
     */
    public void setRefundDate(Long refundDate) {
        this.refundDate = refundDate;
    }

    /**
     * 获取联系人姓名
     *
     * @return USER_NAME - 联系人姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置联系人姓名
     *
     * @param userName 联系人姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取联系人手机
     *
     * @return PHONE - 联系人手机
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系人手机
     *
     * @param phone 联系人手机
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取退款说明
     *
     * @return REFUND_REMARKS - 退款说明
     */
    public String getRefundRemarks() {
        return refundRemarks;
    }

    /**
     * 设置退款说明
     *
     * @param refundRemarks 退款说明
     */
    public void setRefundRemarks(String refundRemarks) {
        this.refundRemarks = refundRemarks;
    }

    /**
     * 获取提交管理员
     *
     * @return SUBMIT_USER_ID - 提交管理员
     */
    public Long getSubmitUserId() {
        return submitUserId;
    }

    /**
     * 设置提交管理员
     *
     * @param submitUserId 提交管理员
     */
    public void setSubmitUserId(Long submitUserId) {
        this.submitUserId = submitUserId;
    }

    /**
     * 获取操作管理员
     *
     * @return OPERATION_USER_ID - 操作管理员
     */
    public Long getOperationUserId() {
        return operationUserId;
    }

    /**
     * 设置操作管理员
     *
     * @param operationUserId 操作管理员
     */
    public void setOperationUserId(Long operationUserId) {
        this.operationUserId = operationUserId;
    }
}