package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_supplier_cash_withdrawal_application")
public class HshSupplierCashWithdrawalApplication {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 店铺编号
     */
    @Column(name = "SUPPLIER_ID")
    private Long supplierId;

    /**
     * 收款人姓名
     */
    @Column(name = "RECEIVE_NAME")
    private String receiveName;

    /**
     * 银行名称
     */
    @Column(name = "BANK_NAME")
    private String bankName;

    /**
     * 银行卡号
     */
    @Column(name = "BANK_CARD")
    private String bankCard;

    /**
     * 电话
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 状态 1：待审2 完成 3驳回
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 提现金额
     */
    @Column(name = "AMOUNT_OF_MONEY")
    private Double amountOfMoney;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 审批人编号
     */
    @Column(name = "OPERATION_USER_ID")
    private Long operationUserId;

    /**
     * 完成时间
     */
    @Column(name = "FINISH_TIME")
    private Date finishTime;

    /**
     * 支行名称
     */
    @Column(name = "BRANCH_BANK_NAME")
    private String branchBankName;

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
     * 获取店铺编号
     *
     * @return SUPPLIER_ID - 店铺编号
     */
    public Long getSupplierId() {
        return supplierId;
    }

    /**
     * 设置店铺编号
     *
     * @param supplierId 店铺编号
     */
    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 获取收款人姓名
     *
     * @return RECEIVE_NAME - 收款人姓名
     */
    public String getReceiveName() {
        return receiveName;
    }

    /**
     * 设置收款人姓名
     *
     * @param receiveName 收款人姓名
     */
    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
    }

    /**
     * 获取银行名称
     *
     * @return BANK_NAME - 银行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置银行名称
     *
     * @param bankName 银行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * 获取银行卡号
     *
     * @return BANK_CARD - 银行卡号
     */
    public String getBankCard() {
        return bankCard;
    }

    /**
     * 设置银行卡号
     *
     * @param bankCard 银行卡号
     */
    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    /**
     * 获取电话
     *
     * @return PHONE - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * 获取状态 1：待审2 完成 3驳回
     *
     * @return STATUS - 状态 1：待审2 完成 3驳回
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 1：待审2 完成 3驳回
     *
     * @param status 状态 1：待审2 完成 3驳回
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取提现金额
     *
     * @return AMOUNT_OF_MONEY - 提现金额
     */
    public Double getAmountOfMoney() {
        return amountOfMoney;
    }

    /**
     * 设置提现金额
     *
     * @param amountOfMoney 提现金额
     */
    public void setAmountOfMoney(Double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
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
     * 获取审批人编号
     *
     * @return OPERATION_USER_ID - 审批人编号
     */
    public Long getOperationUserId() {
        return operationUserId;
    }

    /**
     * 设置审批人编号
     *
     * @param operationUserId 审批人编号
     */
    public void setOperationUserId(Long operationUserId) {
        this.operationUserId = operationUserId;
    }

    /**
     * 获取完成时间
     *
     * @return FINISH_TIME - 完成时间
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
     * 获取支行名称
     *
     * @return BRANCH_BANK_NAME - 支行名称
     */
    public String getBranchBankName() {
        return branchBankName;
    }

    /**
     * 设置支行名称
     *
     * @param branchBankName 支行名称
     */
    public void setBranchBankName(String branchBankName) {
        this.branchBankName = branchBankName;
    }
}