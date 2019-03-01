package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_supplier_wallet_log")
public class HshSupplierWalletLog {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 店铺编号
     */
    @Column(name = "SUPPLIER_ID")
    private Long supplierId;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 变更金额
     */
    @Column(name = "CHANGE_MONEY")
    private Double changeMoney;

    /**
     * 购买用户编号
     */
    @Column(name = "FRONT_USER_ID")
    private Long frontUserId;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 订单编号
     */
    @Column(name = "ORDER_ID")
    private Long orderId;

    /**
     * 1收入2支出
     */
    @Column(name = "IN_OR_OUT")
    private Integer inOrOut;

    @Column(name = "COLUMN_1")
    private String column1;

    /**
     * 1提现，2驳回
     */
    @Column(name = "COLUMN_2")
    private Integer column2;

    @Column(name = "COLUMN_3")
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
     * 获取变更金额
     *
     * @return CHANGE_MONEY - 变更金额
     */
    public Double getChangeMoney() {
        return changeMoney;
    }

    /**
     * 设置变更金额
     *
     * @param changeMoney 变更金额
     */
    public void setChangeMoney(Double changeMoney) {
        this.changeMoney = changeMoney;
    }

    /**
     * 获取购买用户编号
     *
     * @return FRONT_USER_ID - 购买用户编号
     */
    public Long getFrontUserId() {
        return frontUserId;
    }

    /**
     * 设置购买用户编号
     *
     * @param frontUserId 购买用户编号
     */
    public void setFrontUserId(Long frontUserId) {
        this.frontUserId = frontUserId;
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
     * 获取订单编号
     *
     * @return ORDER_ID - 订单编号
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单编号
     *
     * @param orderId 订单编号
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取1收入2支出
     *
     * @return IN_OR_OUT - 1收入2支出
     */
    public Integer getInOrOut() {
        return inOrOut;
    }

    /**
     * 设置1收入2支出
     *
     * @param inOrOut 1收入2支出
     */
    public void setInOrOut(Integer inOrOut) {
        this.inOrOut = inOrOut;
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
     * 获取1提现，2驳回
     *
     * @return COLUMN_2 - 1提现，2驳回
     */
    public Integer getColumn2() {
        return column2;
    }

    /**
     * 设置1提现，2驳回
     *
     * @param column2 1提现，2驳回
     */
    public void setColumn2(Integer column2) {
        this.column2 = column2;
    }

    /**
     * @return COLUMN_3
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