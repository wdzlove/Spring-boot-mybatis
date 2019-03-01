package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_supplier_bank")
public class HshSupplierBank {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 供应商ID
     */
    @Column(name = "SUPPLIER_ID")
    private Long supplierId;

    /**
     * 收款银行
     */
    @Column(name = "RECEIVING_BANK")
    private String receivingBank;

    /**
     * 开户银行
     */
    @Column(name = "OUR_BANK")
    private String ourBank;

    /**
     * 银行卡号
     */
    @Column(name = "CARD_BANK")
    private String cardBank;

    /**
     * 收款人
     */
    @Column(name = "PAYEE")
    private String payee;

    /**
     * 联系方式
     */
    @Column(name = "MOBILE")
    private String mobile;

    /**
     * 添加时间
     */
    @Column(name = "PRODUCT_TIME")
    private Date productTime;

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
     * 获取供应商ID
     *
     * @return SUPPLIER_ID - 供应商ID
     */
    public Long getSupplierId() {
        return supplierId;
    }

    /**
     * 设置供应商ID
     *
     * @param supplierId 供应商ID
     */
    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 获取收款银行
     *
     * @return RECEIVING_BANK - 收款银行
     */
    public String getReceivingBank() {
        return receivingBank;
    }

    /**
     * 设置收款银行
     *
     * @param receivingBank 收款银行
     */
    public void setReceivingBank(String receivingBank) {
        this.receivingBank = receivingBank;
    }

    /**
     * 获取开户银行
     *
     * @return OUR_BANK - 开户银行
     */
    public String getOurBank() {
        return ourBank;
    }

    /**
     * 设置开户银行
     *
     * @param ourBank 开户银行
     */
    public void setOurBank(String ourBank) {
        this.ourBank = ourBank;
    }

    /**
     * 获取银行卡号
     *
     * @return CARD_BANK - 银行卡号
     */
    public String getCardBank() {
        return cardBank;
    }

    /**
     * 设置银行卡号
     *
     * @param cardBank 银行卡号
     */
    public void setCardBank(String cardBank) {
        this.cardBank = cardBank;
    }

    /**
     * 获取收款人
     *
     * @return PAYEE - 收款人
     */
    public String getPayee() {
        return payee;
    }

    /**
     * 设置收款人
     *
     * @param payee 收款人
     */
    public void setPayee(String payee) {
        this.payee = payee;
    }

    /**
     * 获取联系方式
     *
     * @return MOBILE - 联系方式
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置联系方式
     *
     * @param mobile 联系方式
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取添加时间
     *
     * @return PRODUCT_TIME - 添加时间
     */
    public Date getProductTime() {
        return productTime;
    }

    /**
     * 设置添加时间
     *
     * @param productTime 添加时间
     */
    public void setProductTime(Date productTime) {
        this.productTime = productTime;
    }
}