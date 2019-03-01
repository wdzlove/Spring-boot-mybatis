package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_order_pay_info")
public class HshOrderPayInfo {
    /**
     * 主键
     */
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 微信交易号
     */
    @Column(name = "WX_ORDER_NO")
    private String wxOrderNo;

    /**
     * 本地订单号
     */
    @Column(name = "ORDER_NO")
    private String orderNo;

    /**
     * 总金额
     */
    @Column(name = "TOTAL_MONEY")
    private Double totalMoney;

    /**
     * 1未支付2支付成功
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 支付人账号微信openId
     */
    @Column(name = "PAY_ACCOUNT")
    private String payAccount;

    /**
     * 收款平台号
     */
    @Column(name = "REVENUE_ACCOUNT")
    private String revenueAccount;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "COLUMN_1")
    private String column1;

    @Column(name = "COLUMN_2")
    private String column2;

    @Column(name = "COLUMN_3")
    private Integer column3;

    @Column(name = "COLUMN_4")
    private Integer column4;

    @Column(name = "COLUMN_5")
    private Long column5;

    @Column(name = "COLUMN_6")
    private Long column6;

    /**
     * 获取主键
     *
     * @return ID - 主键
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
     * 获取微信交易号
     *
     * @return WX_ORDER_NO - 微信交易号
     */
    public String getWxOrderNo() {
        return wxOrderNo;
    }

    /**
     * 设置微信交易号
     *
     * @param wxOrderNo 微信交易号
     */
    public void setWxOrderNo(String wxOrderNo) {
        this.wxOrderNo = wxOrderNo;
    }

    /**
     * 获取本地订单号
     *
     * @return ORDER_NO - 本地订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置本地订单号
     *
     * @param orderNo 本地订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取总金额
     *
     * @return TOTAL_MONEY - 总金额
     */
    public Double getTotalMoney() {
        return totalMoney;
    }

    /**
     * 设置总金额
     *
     * @param totalMoney 总金额
     */
    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    /**
     * 获取1未支付2支付成功
     *
     * @return STATUS - 1未支付2支付成功
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置1未支付2支付成功
     *
     * @param status 1未支付2支付成功
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取支付人账号微信openId
     *
     * @return PAY_ACCOUNT - 支付人账号微信openId
     */
    public String getPayAccount() {
        return payAccount;
    }

    /**
     * 设置支付人账号微信openId
     *
     * @param payAccount 支付人账号微信openId
     */
    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    /**
     * 获取收款平台号
     *
     * @return REVENUE_ACCOUNT - 收款平台号
     */
    public String getRevenueAccount() {
        return revenueAccount;
    }

    /**
     * 设置收款平台号
     *
     * @param revenueAccount 收款平台号
     */
    public void setRevenueAccount(String revenueAccount) {
        this.revenueAccount = revenueAccount;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
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
     * @return COLUMN_1
     */
    public String getColumn1() {
        return column1;
    }

    /**
     * @param column1
     */
    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    /**
     * @return COLUMN_2
     */
    public String getColumn2() {
        return column2;
    }

    /**
     * @param column2
     */
    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    /**
     * @return COLUMN_3
     */
    public Integer getColumn3() {
        return column3;
    }

    /**
     * @param column3
     */
    public void setColumn3(Integer column3) {
        this.column3 = column3;
    }

    /**
     * @return COLUMN_4
     */
    public Integer getColumn4() {
        return column4;
    }

    /**
     * @param column4
     */
    public void setColumn4(Integer column4) {
        this.column4 = column4;
    }

    /**
     * @return COLUMN_5
     */
    public Long getColumn5() {
        return column5;
    }

    /**
     * @param column5
     */
    public void setColumn5(Long column5) {
        this.column5 = column5;
    }

    /**
     * @return COLUMN_6
     */
    public Long getColumn6() {
        return column6;
    }

    /**
     * @param column6
     */
    public void setColumn6(Long column6) {
        this.column6 = column6;
    }
}