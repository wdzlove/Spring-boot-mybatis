package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_coupan")
public class HshCoupan {
    @Column(name = "coupan_id")
    private Long coupanId;

    @Column(name = "coupan_type_id")
    private Long coupanTypeId;

    /**
     * 优惠卷名称
     */
    @Column(name = "coupan_name")
    private String coupanName;

    /**
     * 满多少
     */
    @Column(name = "coupan_min")
    private Long coupanMin;

    /**
     * 减多少
     */
    @Column(name = "coupan_max")
    private Long coupanMax;

    /**
     * 优惠卷图片
     */
    @Column(name = "coupan_img")
    private String coupanImg;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 过期时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 1 可使用，2不可使用
     */
    private Byte status;

    /**
     * 备注
     */
    private String remark;

    @Column(name = "cus_num_1")
    private String cusNum1;

    @Column(name = "cus_num_2")
    private String cusNum2;

    @Column(name = "cus_num_3")
    private String cusNum3;

    @Column(name = "cus_num_4")
    private String cusNum4;

    @Column(name = "cus_num_5")
    private String cusNum5;

    /**
     * @return coupan_id
     */
    public Long getCoupanId() {
        return coupanId;
    }

    /**
     * @param coupanId
     */
    public void setCoupanId(Long coupanId) {
        this.coupanId = coupanId;
    }

    /**
     * @return coupan_type_id
     */
    public Long getCoupanTypeId() {
        return coupanTypeId;
    }

    /**
     * @param coupanTypeId
     */
    public void setCoupanTypeId(Long coupanTypeId) {
        this.coupanTypeId = coupanTypeId;
    }

    /**
     * 获取优惠卷名称
     *
     * @return coupan_name - 优惠卷名称
     */
    public String getCoupanName() {
        return coupanName;
    }

    /**
     * 设置优惠卷名称
     *
     * @param coupanName 优惠卷名称
     */
    public void setCoupanName(String coupanName) {
        this.coupanName = coupanName;
    }

    /**
     * 获取满多少
     *
     * @return coupan_min - 满多少
     */
    public Long getCoupanMin() {
        return coupanMin;
    }

    /**
     * 设置满多少
     *
     * @param coupanMin 满多少
     */
    public void setCoupanMin(Long coupanMin) {
        this.coupanMin = coupanMin;
    }

    /**
     * 获取减多少
     *
     * @return coupan_max - 减多少
     */
    public Long getCoupanMax() {
        return coupanMax;
    }

    /**
     * 设置减多少
     *
     * @param coupanMax 减多少
     */
    public void setCoupanMax(Long coupanMax) {
        this.coupanMax = coupanMax;
    }

    /**
     * 获取优惠卷图片
     *
     * @return coupan_img - 优惠卷图片
     */
    public String getCoupanImg() {
        return coupanImg;
    }

    /**
     * 设置优惠卷图片
     *
     * @param coupanImg 优惠卷图片
     */
    public void setCoupanImg(String coupanImg) {
        this.coupanImg = coupanImg;
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
     * 获取过期时间
     *
     * @return end_time - 过期时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置过期时间
     *
     * @param endTime 过期时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取1 可使用，2不可使用
     *
     * @return status - 1 可使用，2不可使用
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置1 可使用，2不可使用
     *
     * @param status 1 可使用，2不可使用
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
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
     * @return cus_num_1
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
     * @return cus_num_2
     */
    public String getCusNum2() {
        return cusNum2;
    }

    /**
     * @param cusNum2
     */
    public void setCusNum2(String cusNum2) {
        this.cusNum2 = cusNum2;
    }

    /**
     * @return cus_num_3
     */
    public String getCusNum3() {
        return cusNum3;
    }

    /**
     * @param cusNum3
     */
    public void setCusNum3(String cusNum3) {
        this.cusNum3 = cusNum3;
    }

    /**
     * @return cus_num_4
     */
    public String getCusNum4() {
        return cusNum4;
    }

    /**
     * @param cusNum4
     */
    public void setCusNum4(String cusNum4) {
        this.cusNum4 = cusNum4;
    }

    /**
     * @return cus_num_5
     */
    public String getCusNum5() {
        return cusNum5;
    }

    /**
     * @param cusNum5
     */
    public void setCusNum5(String cusNum5) {
        this.cusNum5 = cusNum5;
    }
}