package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_customer_withdrawals")
public class HshCustomerWithdrawals {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "customer_id")
    private Long customerId;

    /**
     * 提现金额
     */
    private Double money;

    /**
     * 0失败,1成功
     */
    private Integer state;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 交易流水号(第三方)
     */
    @Column(name = "trade_no")
    private String tradeNo;

    /**
     * 唯一单号
     */
    private String uuid;

    /**
     * 退款成功时间
     */
    @Column(name = "success_time")
    private Date successTime;

    /**
     * 银行卡号
     */
    @Column(name = "bank_number")
    private String bankNumber;

    /**
     * 开户银行
     */
    @Column(name = "bank_name")
    private String bankName;

    /**
     * 收款人姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String phone;

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
     * 获取用户id
     *
     * @return customer_id - 用户id
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * 设置用户id
     *
     * @param customerId 用户id
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取提现金额
     *
     * @return money - 提现金额
     */
    public Double getMoney() {
        return money;
    }

    /**
     * 设置提现金额
     *
     * @param money 提现金额
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * 获取0失败,1成功
     *
     * @return state - 0失败,1成功
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置0失败,1成功
     *
     * @param state 0失败,1成功
     */
    public void setState(Integer state) {
        this.state = state;
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
     * 获取交易流水号(第三方)
     *
     * @return trade_no - 交易流水号(第三方)
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * 设置交易流水号(第三方)
     *
     * @param tradeNo 交易流水号(第三方)
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * 获取唯一单号
     *
     * @return uuid - 唯一单号
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 设置唯一单号
     *
     * @param uuid 唯一单号
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * 获取退款成功时间
     *
     * @return success_time - 退款成功时间
     */
    public Date getSuccessTime() {
        return successTime;
    }

    /**
     * 设置退款成功时间
     *
     * @param successTime 退款成功时间
     */
    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    /**
     * 获取银行卡号
     *
     * @return bank_number - 银行卡号
     */
    public String getBankNumber() {
        return bankNumber;
    }

    /**
     * 设置银行卡号
     *
     * @param bankNumber 银行卡号
     */
    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    /**
     * 获取开户银行
     *
     * @return bank_name - 开户银行
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置开户银行
     *
     * @param bankName 开户银行
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 获取收款人姓名
     *
     * @return name - 收款人姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置收款人姓名
     *
     * @param name 收款人姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}