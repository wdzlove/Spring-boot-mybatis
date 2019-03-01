package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_order_shipping")
public class HshOrderShipping {
    /**
     * 订单ID
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 收货人全名
     */
    @Column(name = "receiver_name")
    private String receiverName;

    /**
     * 移动电话
     */
    @Column(name = "receiver_mobile")
    private String receiverMobile;

    /**
     * 省份
     */
    @Column(name = "receiver_state")
    private String receiverState;

    /**
     * 城市
     */
    @Column(name = "receiver_city")
    private String receiverCity;

    /**
     * 区/县
     */
    @Column(name = "receiver_district")
    private String receiverDistrict;

    /**
     * 收货地址|店铺详细地址
     */
    @Column(name = "receiver_address")
    private String receiverAddress;

    /**
     * 邮政编码
     */
    @Column(name = "receiver_zip")
    private String receiverZip;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    /**
     *  驿站名称 |店铺联系人
     */
    @Column(name = "cus_num_1")
    private String cusNum1;

    /**
     * 驿站电话号码、店铺联系人电话号
     */
    @Column(name = "cus_num_2")
    private String cusNum2;

    /**
     * 预留字段
     */
    @Column(name = "cus_num_3")
    private String cusNum3;

    /**
     * 获取订单ID
     *
     * @return order_id - 订单ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID
     *
     * @param orderId 订单ID
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取收货人全名
     *
     * @return receiver_name - 收货人全名
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 设置收货人全名
     *
     * @param receiverName 收货人全名
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    /**
     * 获取移动电话
     *
     * @return receiver_mobile - 移动电话
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * 设置移动电话
     *
     * @param receiverMobile 移动电话
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    /**
     * 获取省份
     *
     * @return receiver_state - 省份
     */
    public String getReceiverState() {
        return receiverState;
    }

    /**
     * 设置省份
     *
     * @param receiverState 省份
     */
    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState;
    }

    /**
     * 获取城市
     *
     * @return receiver_city - 城市
     */
    public String getReceiverCity() {
        return receiverCity;
    }

    /**
     * 设置城市
     *
     * @param receiverCity 城市
     */
    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    /**
     * 获取区/县
     *
     * @return receiver_district - 区/县
     */
    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    /**
     * 设置区/县
     *
     * @param receiverDistrict 区/县
     */
    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }

    /**
     * 获取收货地址|店铺详细地址
     *
     * @return receiver_address - 收货地址|店铺详细地址
     */
    public String getReceiverAddress() {
        return receiverAddress;
    }

    /**
     * 设置收货地址|店铺详细地址
     *
     * @param receiverAddress 收货地址|店铺详细地址
     */
    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    /**
     * 获取邮政编码
     *
     * @return receiver_zip - 邮政编码
     */
    public String getReceiverZip() {
        return receiverZip;
    }

    /**
     * 设置邮政编码
     *
     * @param receiverZip 邮政编码
     */
    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip;
    }

    /**
     * 获取创建时间
     *
     * @return created - 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建时间
     *
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取更新时间
     *
     * @return updated - 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置更新时间
     *
     * @param updated 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 获取 驿站名称 |店铺联系人
     *
     * @return cus_num_1 -  驿站名称 |店铺联系人
     */
    public String getCusNum1() {
        return cusNum1;
    }

    /**
     * 设置 驿站名称 |店铺联系人
     *
     * @param cusNum1  驿站名称 |店铺联系人
     */
    public void setCusNum1(String cusNum1) {
        this.cusNum1 = cusNum1;
    }

    /**
     * 获取驿站电话号码、店铺联系人电话号
     *
     * @return cus_num_2 - 驿站电话号码、店铺联系人电话号
     */
    public String getCusNum2() {
        return cusNum2;
    }

    /**
     * 设置驿站电话号码、店铺联系人电话号
     *
     * @param cusNum2 驿站电话号码、店铺联系人电话号
     */
    public void setCusNum2(String cusNum2) {
        this.cusNum2 = cusNum2;
    }

    /**
     * 获取预留字段
     *
     * @return cus_num_3 - 预留字段
     */
    public String getCusNum3() {
        return cusNum3;
    }

    /**
     * 设置预留字段
     *
     * @param cusNum3 预留字段
     */
    public void setCusNum3(String cusNum3) {
        this.cusNum3 = cusNum3;
    }
}