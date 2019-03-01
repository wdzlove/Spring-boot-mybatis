package com.wdz.boot.helloboot.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_self_order")
public class HshSelfOrder {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单ID
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 物流号
     */
    @Column(name = "shipping_code")
    private String shippingCode;

    /**
     * 物流名称
     */
    @Column(name = "shipping_name")
    private String shippingName;

    /**
     * 订单金额
     */
    private BigDecimal payment;

    /**
     * 支付类型 1、积分、2、余额、3、微信 、4积分余额混合支付、5积分微信混合支付
     */
    @Column(name = "payment_type")
    private Byte paymentType;

    /**
     * 邮费  邮费是0包邮，大于0 不包费
     */
    @Column(name = "post_fee")
    private String postFee;

    /**
     * 订单创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 支付时间
     */
    @Column(name = "payment_time")
    private Date paymentTime;

    /**
     * 交易关闭时间
     */
    @Column(name = "close_time")
    private Date closeTime;

    /**
     * 交易完成时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 发货时间
     */
    @Column(name = "consign_time")
    private Date consignTime;

    /**
     * 状态 1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭',
     */
    private Byte status;

    /**
     * 买家留言 改为订单总积分
     */
    @Column(name = "buyer_message")
    private String buyerMessage;

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
     * 获取订单ID
     *
     * @return order_id - 订单ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID
     *
     * @param orderId 订单ID
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取物流号
     *
     * @return shipping_code - 物流号
     */
    public String getShippingCode() {
        return shippingCode;
    }

    /**
     * 设置物流号
     *
     * @param shippingCode 物流号
     */
    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    /**
     * 获取物流名称
     *
     * @return shipping_name - 物流名称
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * 设置物流名称
     *
     * @param shippingName 物流名称
     */
    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    /**
     * 获取订单金额
     *
     * @return payment - 订单金额
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     * 设置订单金额
     *
     * @param payment 订单金额
     */
    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    /**
     * 获取支付类型 1、积分、2、余额、3、微信 、4积分余额混合支付、5积分微信混合支付
     *
     * @return payment_type - 支付类型 1、积分、2、余额、3、微信 、4积分余额混合支付、5积分微信混合支付
     */
    public Byte getPaymentType() {
        return paymentType;
    }

    /**
     * 设置支付类型 1、积分、2、余额、3、微信 、4积分余额混合支付、5积分微信混合支付
     *
     * @param paymentType 支付类型 1、积分、2、余额、3、微信 、4积分余额混合支付、5积分微信混合支付
     */
    public void setPaymentType(Byte paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 获取邮费  邮费是0包邮，大于0 不包费
     *
     * @return post_fee - 邮费  邮费是0包邮，大于0 不包费
     */
    public String getPostFee() {
        return postFee;
    }

    /**
     * 设置邮费  邮费是0包邮，大于0 不包费
     *
     * @param postFee 邮费  邮费是0包邮，大于0 不包费
     */
    public void setPostFee(String postFee) {
        this.postFee = postFee;
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
     * @return payment_time - 支付时间
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * 设置支付时间
     *
     * @param paymentTime 支付时间
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * 获取交易关闭时间
     *
     * @return close_time - 交易关闭时间
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * 设置交易关闭时间
     *
     * @param closeTime 交易关闭时间
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * 获取交易完成时间
     *
     * @return end_time - 交易完成时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置交易完成时间
     *
     * @param endTime 交易完成时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取发货时间
     *
     * @return consign_time - 发货时间
     */
    public Date getConsignTime() {
        return consignTime;
    }

    /**
     * 设置发货时间
     *
     * @param consignTime 发货时间
     */
    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    /**
     * 获取状态 1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭',
     *
     * @return status - 状态 1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭',
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态 1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭',
     *
     * @param status 状态 1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭',
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取买家留言 改为订单总积分
     *
     * @return buyer_message - 买家留言 改为订单总积分
     */
    public String getBuyerMessage() {
        return buyerMessage;
    }

    /**
     * 设置买家留言 改为订单总积分
     *
     * @param buyerMessage 买家留言 改为订单总积分
     */
    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }
}