package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

public class Customer {
    /**
     * 主键ID
     */
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户OPEN_ID
     */
    @Column(name = "OPEN_ID")
    private String openId;

    /**
     * 昵称
     */
    @Column(name = "NICKNAME")
    private String nickname;

    /**
     * 手机号
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * 关注时间
     */
    @Column(name = "ADD_TIME")
    private Date addTime;

    /**
     * 微信头像
     */
    @Column(name = "IMG")
    private String img;

    /**
     * 邀请码
     */
    @Column(name = "INVITE_CODE")
    private String inviteCode;

    /**
     * 收款码
     */
    @Column(name = "RECEIVABLES_CODE")
    private String receivablesCode;

    @Column(name = "COLUMN2")
    private Integer column2;

    /**
     * 上级id
     */
    @Column(name = "SUPERIOR_ID")
    private Long superiorId;

    /**
     * 性别
     */
    @Column(name = "GENDER")
    private String gender;

    /**
     * 地址
     */
    @Column(name = "AREA")
    private String area;

    /**
     * 被邀请时间
     */
    @Column(name = "INVITATION_TIME")
    private Date invitationTime;

    /**
     * 餐厅id
     */
    @Column(name = "RESTAURANT_ID")
    private Long restaurantId;

    /**
     * 规则id
     */
    @Column(name = "RULE_ID")
    private Long ruleId;

    /**
     * 角色(0:个人 1:餐厅)
     */
    @Column(name = "ROLE")
    private Integer role;

    /**
     * 获取主键ID
     *
     * @return ID - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户OPEN_ID
     *
     * @return OPEN_ID - 用户OPEN_ID
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置用户OPEN_ID
     *
     * @param openId 用户OPEN_ID
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 获取昵称
     *
     * @return NICKNAME - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取手机号
     *
     * @return PHONE - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取关注时间
     *
     * @return ADD_TIME - 关注时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置关注时间
     *
     * @param addTime 关注时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取微信头像
     *
     * @return IMG - 微信头像
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置微信头像
     *
     * @param img 微信头像
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取邀请码
     *
     * @return INVITE_CODE - 邀请码
     */
    public String getInviteCode() {
        return inviteCode;
    }

    /**
     * 设置邀请码
     *
     * @param inviteCode 邀请码
     */
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    /**
     * 获取收款码
     *
     * @return RECEIVABLES_CODE - 收款码
     */
    public String getReceivablesCode() {
        return receivablesCode;
    }

    /**
     * 设置收款码
     *
     * @param receivablesCode 收款码
     */
    public void setReceivablesCode(String receivablesCode) {
        this.receivablesCode = receivablesCode;
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
     * 获取上级id
     *
     * @return SUPERIOR_ID - 上级id
     */
    public Long getSuperiorId() {
        return superiorId;
    }

    /**
     * 设置上级id
     *
     * @param superiorId 上级id
     */
    public void setSuperiorId(Long superiorId) {
        this.superiorId = superiorId;
    }

    /**
     * 获取性别
     *
     * @return GENDER - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取地址
     *
     * @return AREA - 地址
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置地址
     *
     * @param area 地址
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取被邀请时间
     *
     * @return INVITATION_TIME - 被邀请时间
     */
    public Date getInvitationTime() {
        return invitationTime;
    }

    /**
     * 设置被邀请时间
     *
     * @param invitationTime 被邀请时间
     */
    public void setInvitationTime(Date invitationTime) {
        this.invitationTime = invitationTime;
    }

    /**
     * 获取餐厅id
     *
     * @return RESTAURANT_ID - 餐厅id
     */
    public Long getRestaurantId() {
        return restaurantId;
    }

    /**
     * 设置餐厅id
     *
     * @param restaurantId 餐厅id
     */
    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    /**
     * 获取规则id
     *
     * @return RULE_ID - 规则id
     */
    public Long getRuleId() {
        return ruleId;
    }

    /**
     * 设置规则id
     *
     * @param ruleId 规则id
     */
    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * 获取角色(0:个人 1:餐厅)
     *
     * @return ROLE - 角色(0:个人 1:餐厅)
     */
    public Integer getRole() {
        return role;
    }

    /**
     * 设置角色(0:个人 1:餐厅)
     *
     * @param role 角色(0:个人 1:餐厅)
     */
    public void setRole(Integer role) {
        this.role = role;
    }
}