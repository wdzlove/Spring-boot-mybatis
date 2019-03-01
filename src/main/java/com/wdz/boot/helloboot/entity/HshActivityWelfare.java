package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "hsh_activity_welfare")
public class HshActivityWelfare {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名称
     */
    @Column(name = "welfare_title")
    private String welfareTitle;

    /**
     * 图片
     */
    @Column(name = "welfare_img")
    private String welfareImg;

    /**
     * 是否展示 1 展示 2不展示
     */
    @Column(name = "welfare_status")
    private Byte welfareStatus;

    /**
     * 标签名
     */
    @Column(name = "welfare_tag")
    private String welfareTag;

    /**
     * 保留字段
     */
    @Column(name = "cus_num_1")
    private String cusNum1;

    /**
     * 保留字段
     */
    @Column(name = "cus_num_2")
    private Long cusNum2;

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
     * 获取名称
     *
     * @return welfare_title - 名称
     */
    public String getWelfareTitle() {
        return welfareTitle;
    }

    /**
     * 设置名称
     *
     * @param welfareTitle 名称
     */
    public void setWelfareTitle(String welfareTitle) {
        this.welfareTitle = welfareTitle;
    }

    /**
     * 获取图片
     *
     * @return welfare_img - 图片
     */
    public String getWelfareImg() {
        return welfareImg;
    }

    /**
     * 设置图片
     *
     * @param welfareImg 图片
     */
    public void setWelfareImg(String welfareImg) {
        this.welfareImg = welfareImg;
    }

    /**
     * 获取是否展示 1 展示 2不展示
     *
     * @return welfare_status - 是否展示 1 展示 2不展示
     */
    public Byte getWelfareStatus() {
        return welfareStatus;
    }

    /**
     * 设置是否展示 1 展示 2不展示
     *
     * @param welfareStatus 是否展示 1 展示 2不展示
     */
    public void setWelfareStatus(Byte welfareStatus) {
        this.welfareStatus = welfareStatus;
    }

    /**
     * 获取标签名
     *
     * @return welfare_tag - 标签名
     */
    public String getWelfareTag() {
        return welfareTag;
    }

    /**
     * 设置标签名
     *
     * @param welfareTag 标签名
     */
    public void setWelfareTag(String welfareTag) {
        this.welfareTag = welfareTag;
    }

    /**
     * 获取保留字段
     *
     * @return cus_num_1 - 保留字段
     */
    public String getCusNum1() {
        return cusNum1;
    }

    /**
     * 设置保留字段
     *
     * @param cusNum1 保留字段
     */
    public void setCusNum1(String cusNum1) {
        this.cusNum1 = cusNum1;
    }

    /**
     * 获取保留字段
     *
     * @return cus_num_2 - 保留字段
     */
    public Long getCusNum2() {
        return cusNum2;
    }

    /**
     * 设置保留字段
     *
     * @param cusNum2 保留字段
     */
    public void setCusNum2(Long cusNum2) {
        this.cusNum2 = cusNum2;
    }
}