package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_pay_qr_code")
public class HshPayQrCode {
    /**
     * ID
     */
    @Column(name = "code_id")
    private Long codeId;

    /**
     * 二维码存储地址
     */
    @Column(name = "code_address")
    private String codeAddress;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 手机号
     */
    @Column(name = "user_mobile")
    private String userMobile;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 预留字段
     */
    @Column(name = "cus_num_1")
    private String cusNum1;

    /**
     * 预留字段
     */
    @Column(name = "cus_num_2")
    private String cusNum2;

    /**
     * 预留字段
     */
    @Column(name = "cus_num_3")
    private String cusNum3;

    /**
     * 获取ID
     *
     * @return code_id - ID
     */
    public Long getCodeId() {
        return codeId;
    }

    /**
     * 设置ID
     *
     * @param codeId ID
     */
    public void setCodeId(Long codeId) {
        this.codeId = codeId;
    }

    /**
     * 获取二维码存储地址
     *
     * @return code_address - 二维码存储地址
     */
    public String getCodeAddress() {
        return codeAddress;
    }

    /**
     * 设置二维码存储地址
     *
     * @param codeAddress 二维码存储地址
     */
    public void setCodeAddress(String codeAddress) {
        this.codeAddress = codeAddress;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取手机号
     *
     * @return user_mobile - 手机号
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * 设置手机号
     *
     * @param userMobile 手机号
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
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
     * 获取预留字段
     *
     * @return cus_num_1 - 预留字段
     */
    public String getCusNum1() {
        return cusNum1;
    }

    /**
     * 设置预留字段
     *
     * @param cusNum1 预留字段
     */
    public void setCusNum1(String cusNum1) {
        this.cusNum1 = cusNum1;
    }

    /**
     * 获取预留字段
     *
     * @return cus_num_2 - 预留字段
     */
    public String getCusNum2() {
        return cusNum2;
    }

    /**
     * 设置预留字段
     *
     * @param cusNum2 预留字段
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