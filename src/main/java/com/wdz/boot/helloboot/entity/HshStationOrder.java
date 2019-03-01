package com.wdz.boot.helloboot.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_station_order")
public class HshStationOrder {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 驿站订单ID
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 订单金额
     */
    @Column(name = "order_price")
    private BigDecimal orderPrice;

    /**
     * 店铺ID
     */
    @Column(name = "station_id")
    private Long stationId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 支付类型 1 余额 2 微信 3 支付宝 4 银联
     */
    @Column(name = "payment_type")
    private Byte paymentType;

    /**
     * 订单状态 1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭''
     */
    @Column(name = "order_status")
    private Byte orderStatus;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 付款时间
     */
    @Column(name = "payment_time")
    private Date paymentTime;

    /**
     * 交易流水号
     */
    @Column(name = "trade_no")
    private String tradeNo;

    /**
     * 交易完成时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 交易关闭时间
     */
    @Column(name = "close_time")
    private Date closeTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取驿站订单ID
     *
     * @return order_id - 驿站订单ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置驿站订单ID
     *
     * @param orderId 驿站订单ID
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单金额
     *
     * @return order_price - 订单金额
     */
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    /**
     * 设置订单金额
     *
     * @param orderPrice 订单金额
     */
    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * 获取店铺ID
     *
     * @return station_id - 店铺ID
     */
    public Long getStationId() {
        return stationId;
    }

    /**
     * 设置店铺ID
     *
     * @param stationId 店铺ID
     */
    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取支付类型 1 余额 2 微信 3 支付宝 4 银联
     *
     * @return payment_type - 支付类型 1 余额 2 微信 3 支付宝 4 银联
     */
    public Byte getPaymentType() {
        return paymentType;
    }

    /**
     * 设置支付类型 1 余额 2 微信 3 支付宝 4 银联
     *
     * @param paymentType 支付类型 1 余额 2 微信 3 支付宝 4 银联
     */
    public void setPaymentType(Byte paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 获取订单状态 1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭''
     *
     * @return order_status - 订单状态 1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭''
     */
    public Byte getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态 1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭''
     *
     * @param orderStatus 订单状态 1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭''
     */
    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取付款时间
     *
     * @return payment_time - 付款时间
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * 设置付款时间
     *
     * @param paymentTime 付款时间
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
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
}