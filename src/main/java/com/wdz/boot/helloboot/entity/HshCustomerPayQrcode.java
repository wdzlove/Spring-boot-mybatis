package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "hsh_customer_pay_qrcode")
public class HshCustomerPayQrcode {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 地址
     */
    @Column(name = "PATH")
    private String path;

    /**
     * 用户ID
     */
    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    /**
     * 二维码图片位置
     */
    @Column(name = "QR_IMG")
    private String qrImg;

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
     * 获取地址
     *
     * @return PATH - 地址
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置地址
     *
     * @param path 地址
     */
    public void setPath(String path) {
        this.path = path;
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
     * 获取二维码图片位置
     *
     * @return QR_IMG - 二维码图片位置
     */
    public String getQrImg() {
        return qrImg;
    }

    /**
     * 设置二维码图片位置
     *
     * @param qrImg 二维码图片位置
     */
    public void setQrImg(String qrImg) {
        this.qrImg = qrImg;
    }
}