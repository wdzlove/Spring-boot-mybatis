package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "hsh_logistics")
public class HshLogistics {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户
     */
    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    /**
     * 收件人姓名
     */
    @Column(name = "REAL_NAME")
    private String realName;

    /**
     * 电话
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * 收件人地址
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 邮政编码
     */
    @Column(name = "POST_CODE")
    private String postCode;

    /**
     * 是否默认 0否 1是 （只能有一个默认地址）
     */
    @Column(name = "IS_DEFAULT")
    private Integer isDefault;

    /**
     * 驿站ID
     */
    @Column(name = "STATION_ID")
    private Long stationId;

    @Column(name = "CUS_NUM_1")
    private String cusNum1;

    /**
     * 驿站头像
     */
    @Column(name = "STATION_IMG")
    private String stationImg;

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
     * 获取用户
     *
     * @return CUSTOMER_ID - 用户
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * 设置用户
     *
     * @param customerId 用户
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取收件人姓名
     *
     * @return REAL_NAME - 收件人姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置收件人姓名
     *
     * @param realName 收件人姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
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
     * 获取收件人地址
     *
     * @return ADDRESS - 收件人地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置收件人地址
     *
     * @param address 收件人地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取邮政编码
     *
     * @return POST_CODE - 邮政编码
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * 设置邮政编码
     *
     * @param postCode 邮政编码
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * 获取是否默认 0否 1是 （只能有一个默认地址）
     *
     * @return IS_DEFAULT - 是否默认 0否 1是 （只能有一个默认地址）
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    /**
     * 设置是否默认 0否 1是 （只能有一个默认地址）
     *
     * @param isDefault 是否默认 0否 1是 （只能有一个默认地址）
     */
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * 获取驿站ID
     *
     * @return STATION_ID - 驿站ID
     */
    public Long getStationId() {
        return stationId;
    }

    /**
     * 设置驿站ID
     *
     * @param stationId 驿站ID
     */
    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    /**
     * @return CUS_NUM_1
     */
    public String getCusNum1() {
        return cusNum1;
    }

    /**
     * @param cusNum1
     */
    public void setCusNum1(String cusNum1) {
        this.cusNum1 = cusNum1;
    }

    /**
     * 获取驿站头像
     *
     * @return STATION_IMG - 驿站头像
     */
    public String getStationImg() {
        return stationImg;
    }

    /**
     * 设置驿站头像
     *
     * @param stationImg 驿站头像
     */
    public void setStationImg(String stationImg) {
        this.stationImg = stationImg;
    }
}