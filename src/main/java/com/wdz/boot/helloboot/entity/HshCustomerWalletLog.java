package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_customer_wallet_log")
public class HshCustomerWalletLog {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 金额
     */
    private Double amount;

    /**
     * 消费方式（1余额，2微信，3积分   4系统 ）
     */
    @Column(name = "pay_mode")
    private Integer payMode;

    /**
     * 类型(1支出;2收入;3提现;4充值)
     */
    private Integer type;

    /**
     * 用户id
     */
    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 状态（0失败，1成功）
     */
    private Integer status;

    /**
     * 账户当前余额
     */
    @Column(name = "current_balance")
    private Double currentBalance;

    /**
     * UUID（订单号唯一）
     */
    private String uuid;

    /**
     * 记录说明
     */
    private String remark;

    /**
     * 后台操作人
     */
    @Column(name = "operation_id")
    private Long operationId;

    /**
     * 第三方交易流水号
     */
    @Column(name = "trade_no")
    private String tradeNo;

    @Column(name = "COLUMN1")
    private String column1;

    @Column(name = "COLUMN2")
    private Integer column2;

    @Column(name = "COLUMN3")
    private Long column3;

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
     * 获取金额
     *
     * @return amount - 金额
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * 获取消费方式（1余额，2微信，3积分   4系统 ）
     *
     * @return pay_mode - 消费方式（1余额，2微信，3积分   4系统 ）
     */
    public Integer getPayMode() {
        return payMode;
    }

    /**
     * 设置消费方式（1余额，2微信，3积分   4系统 ）
     *
     * @param payMode 消费方式（1余额，2微信，3积分   4系统 ）
     */
    public void setPayMode(Integer payMode) {
        this.payMode = payMode;
    }

    /**
     * 获取类型(1支出;2收入;3提现;4充值)
     *
     * @return type - 类型(1支出;2收入;3提现;4充值)
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型(1支出;2收入;3提现;4充值)
     *
     * @param type 类型(1支出;2收入;3提现;4充值)
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取用户id
     *
     * @return CUSTOMER_ID - 用户id
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
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取状态（0失败，1成功）
     *
     * @return status - 状态（0失败，1成功）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（0失败，1成功）
     *
     * @param status 状态（0失败，1成功）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取账户当前余额
     *
     * @return current_balance - 账户当前余额
     */
    public Double getCurrentBalance() {
        return currentBalance;
    }

    /**
     * 设置账户当前余额
     *
     * @param currentBalance 账户当前余额
     */
    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    /**
     * 获取UUID（订单号唯一）
     *
     * @return uuid - UUID（订单号唯一）
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * 设置UUID（订单号唯一）
     *
     * @param uuid UUID（订单号唯一）
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * 获取记录说明
     *
     * @return remark - 记录说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置记录说明
     *
     * @param remark 记录说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取后台操作人
     *
     * @return operation_id - 后台操作人
     */
    public Long getOperationId() {
        return operationId;
    }

    /**
     * 设置后台操作人
     *
     * @param operationId 后台操作人
     */
    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    /**
     * 获取第三方交易流水号
     *
     * @return trade_no - 第三方交易流水号
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * 设置第三方交易流水号
     *
     * @param tradeNo 第三方交易流水号
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * @return COLUMN1
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
     * @return COLUMN2
     */
    public Integer getColumn2() {
        return column2;
    }

    /**
     * @param column2
     */
    public void setColumn2(Integer column2) {
        this.column2 = column2;
    }

    /**
     * @return COLUMN3
     */
    public Long getColumn3() {
        return column3;
    }

    /**
     * @param column3
     */
    public void setColumn3(Long column3) {
        this.column3 = column3;
    }
}