package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_total_supplier_order")
public class HshTotalSupplierOrder {
    /**
     * 主键
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单金额
     */
    @Column(name = "order_money")
    private Double orderMoney;

    /**
     * 订单积分
     */
    private Double integral;

    /**
     * 议价
     */
    private Double haggle;

    /**
     * 实际付款
     */
    @Column(name = "act_payment")
    private Double actPayment;

    /**
     * 余额
     */
    private Double balance;

    /**
     * 购买人编号
     */
    @Column(name = "buy_user_id")
    private Long buyUserId;

    /**
     * 第三方流水
     */
    @Column(name = "trade_no")
    private String tradeNo;

    /**
     * 订单号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 订单状态1：未接单 2：已接单 3：已发货 4：已完成 5：已取消 6 已驳回
     */
    @Column(name = "order_status")
    private Integer orderStatus;

    /**
     * 支付状态 1：未支付 2：已支付
     */
    @Column(name = "pay_status")
    private Integer payStatus;

    /**
     * 配送方式 1：配送 2：自提（不存在驿站和地址）
     */
    private Integer delivery;

    /**
     * 购买人姓名
     */
    @Column(name = "buy_user_name")
    private String buyUserName;

    /**
     * 选择的驿站
     */
    @Column(name = "select_station")
    private String selectStation;

    /**
     * 购买人地址
     */
    @Column(name = "buy_user_address")
    private String buyUserAddress;

    /**
     * 购买人电话
     */
    @Column(name = "buy_user_phone")
    private String buyUserPhone;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 完成时间
     */
    @Column(name = "finish_time")
    private Date finishTime;

    /**
     * 备用
     */
    @Column(name = "column_1")
    private String column1;

    /**
     * 备用
     */
    @Column(name = "column_2")
    private String column2;

    /**
     * 备用
     */
    @Column(name = "column_3")
    private Integer column3;

    /**
     * 备用
     */
    @Column(name = "column_4")
    private Integer column4;

    /**
     * 备用
     */
    @Column(name = "column_5")
    private Long column5;

    /**
     * 备用
     */
    @Column(name = "column_6")
    private Long column6;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取订单金额
     *
     * @return order_money - 订单金额
     */
    public Double getOrderMoney() {
        return orderMoney;
    }

    /**
     * 设置订单金额
     *
     * @param orderMoney 订单金额
     */
    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    /**
     * 获取订单积分
     *
     * @return integral - 订单积分
     */
    public Double getIntegral() {
        return integral;
    }

    /**
     * 设置订单积分
     *
     * @param integral 订单积分
     */
    public void setIntegral(Double integral) {
        this.integral = integral;
    }

    /**
     * 获取议价
     *
     * @return haggle - 议价
     */
    public Double getHaggle() {
        return haggle;
    }

    /**
     * 设置议价
     *
     * @param haggle 议价
     */
    public void setHaggle(Double haggle) {
        this.haggle = haggle;
    }

    /**
     * 获取实际付款
     *
     * @return act_payment - 实际付款
     */
    public Double getActPayment() {
        return actPayment;
    }

    /**
     * 设置实际付款
     *
     * @param actPayment 实际付款
     */
    public void setActPayment(Double actPayment) {
        this.actPayment = actPayment;
    }

    /**
     * 获取余额
     *
     * @return balance - 余额
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * 设置余额
     *
     * @param balance 余额
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * 获取购买人编号
     *
     * @return buy_user_id - 购买人编号
     */
    public Long getBuyUserId() {
        return buyUserId;
    }

    /**
     * 设置购买人编号
     *
     * @param buyUserId 购买人编号
     */
    public void setBuyUserId(Long buyUserId) {
        this.buyUserId = buyUserId;
    }

    /**
     * 获取第三方流水
     *
     * @return trade_no - 第三方流水
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * 设置第三方流水
     *
     * @param tradeNo 第三方流水
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * 获取订单号
     *
     * @return order_no - 订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单号
     *
     * @param orderNo 订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取订单状态1：未接单 2：已接单 3：已发货 4：已完成 5：已取消 6 已驳回
     *
     * @return order_status - 订单状态1：未接单 2：已接单 3：已发货 4：已完成 5：已取消 6 已驳回
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态1：未接单 2：已接单 3：已发货 4：已完成 5：已取消 6 已驳回
     *
     * @param orderStatus 订单状态1：未接单 2：已接单 3：已发货 4：已完成 5：已取消 6 已驳回
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取支付状态 1：未支付 2：已支付
     *
     * @return pay_status - 支付状态 1：未支付 2：已支付
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * 设置支付状态 1：未支付 2：已支付
     *
     * @param payStatus 支付状态 1：未支付 2：已支付
     */
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 获取配送方式 1：配送 2：自提（不存在驿站和地址）
     *
     * @return delivery - 配送方式 1：配送 2：自提（不存在驿站和地址）
     */
    public Integer getDelivery() {
        return delivery;
    }

    /**
     * 设置配送方式 1：配送 2：自提（不存在驿站和地址）
     *
     * @param delivery 配送方式 1：配送 2：自提（不存在驿站和地址）
     */
    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    /**
     * 获取购买人姓名
     *
     * @return buy_user_name - 购买人姓名
     */
    public String getBuyUserName() {
        return buyUserName;
    }

    /**
     * 设置购买人姓名
     *
     * @param buyUserName 购买人姓名
     */
    public void setBuyUserName(String buyUserName) {
        this.buyUserName = buyUserName;
    }

    /**
     * 获取选择的驿站
     *
     * @return select_station - 选择的驿站
     */
    public String getSelectStation() {
        return selectStation;
    }

    /**
     * 设置选择的驿站
     *
     * @param selectStation 选择的驿站
     */
    public void setSelectStation(String selectStation) {
        this.selectStation = selectStation;
    }

    /**
     * 获取购买人地址
     *
     * @return buy_user_address - 购买人地址
     */
    public String getBuyUserAddress() {
        return buyUserAddress;
    }

    /**
     * 设置购买人地址
     *
     * @param buyUserAddress 购买人地址
     */
    public void setBuyUserAddress(String buyUserAddress) {
        this.buyUserAddress = buyUserAddress;
    }

    /**
     * 获取购买人电话
     *
     * @return buy_user_phone - 购买人电话
     */
    public String getBuyUserPhone() {
        return buyUserPhone;
    }

    /**
     * 设置购买人电话
     *
     * @param buyUserPhone 购买人电话
     */
    public void setBuyUserPhone(String buyUserPhone) {
        this.buyUserPhone = buyUserPhone;
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
     * 获取完成时间
     *
     * @return finish_time - 完成时间
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 设置完成时间
     *
     * @param finishTime 完成时间
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 获取备用
     *
     * @return column_1 - 备用
     */
    public String getColumn1() {
        return column1;
    }

    /**
     * 设置备用
     *
     * @param column1 备用
     */
    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    /**
     * 获取备用
     *
     * @return column_2 - 备用
     */
    public String getColumn2() {
        return column2;
    }

    /**
     * 设置备用
     *
     * @param column2 备用
     */
    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    /**
     * 获取备用
     *
     * @return column_3 - 备用
     */
    public Integer getColumn3() {
        return column3;
    }

    /**
     * 设置备用
     *
     * @param column3 备用
     */
    public void setColumn3(Integer column3) {
        this.column3 = column3;
    }

    /**
     * 获取备用
     *
     * @return column_4 - 备用
     */
    public Integer getColumn4() {
        return column4;
    }

    /**
     * 设置备用
     *
     * @param column4 备用
     */
    public void setColumn4(Integer column4) {
        this.column4 = column4;
    }

    /**
     * 获取备用
     *
     * @return column_5 - 备用
     */
    public Long getColumn5() {
        return column5;
    }

    /**
     * 设置备用
     *
     * @param column5 备用
     */
    public void setColumn5(Long column5) {
        this.column5 = column5;
    }

    /**
     * 获取备用
     *
     * @return column_6 - 备用
     */
    public Long getColumn6() {
        return column6;
    }

    /**
     * 设置备用
     *
     * @param column6 备用
     */
    public void setColumn6(Long column6) {
        this.column6 = column6;
    }
}