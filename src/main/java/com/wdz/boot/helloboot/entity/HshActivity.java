package com.wdz.boot.helloboot.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_activity")
public class HshActivity {
    /**
     * 活动ID
     */
    @Column(name = "activity_id")
    private Long activityId;

    /**
     * 活动名称
     */
    @Column(name = "activity_name")
    private String activityName;

    /**
     * 活动商品价格
     */
    @Column(name = "activity_price")
    private BigDecimal activityPrice;

    /**
     * 活动图像
     */
    @Column(name = "activity_img")
    private String activityImg;

    /**
     * 商品图片
     */
    @Column(name = "activity_item_img")
    private String activityItemImg;

    /**
     * 商品简介
     */
    @Column(name = "sell_point")
    private String sellPoint;

    /**
     * 商品数量
     */
    @Column(name = "item_num")
    private Long itemNum;

    /**
     * 活动状态 1 上线  2 下架
     */
    private Byte status;

    /**
     * 创建人
     */
    @Column(name = "create_user")
    private String createUser;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 下架时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 分享次数
     */
    @Column(name = "share_num")
    private Long shareNum;

    /**
     * 预留字段
     */
    @Column(name = "cus_num_5")
    private String cusNum5;

    /**
     * 预留字段|玩法介绍
     */
    @Column(name = "cus_num_4")
    private String cusNum4;

    /**
     * 商品评价
     */
    @Column(name = "item_eval")
    private String itemEval;

    /**
     * 购买返还的积分
     */
    @Column(name = "item_rebate")
    private Long itemRebate;

    /**
     * 预留字段|商品描述
     */
    @Column(name = "cus_num_1")
    private String cusNum1;

    /**
     * 预留字段
     */
    @Column(name = "cus_num_3")
    private Long cusNum3;

    /**
     * 获取活动ID
     *
     * @return activity_id - 活动ID
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * 设置活动ID
     *
     * @param activityId 活动ID
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取活动名称
     *
     * @return activity_name - 活动名称
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * 设置活动名称
     *
     * @param activityName 活动名称
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    /**
     * 获取活动商品价格
     *
     * @return activity_price - 活动商品价格
     */
    public BigDecimal getActivityPrice() {
        return activityPrice;
    }

    /**
     * 设置活动商品价格
     *
     * @param activityPrice 活动商品价格
     */
    public void setActivityPrice(BigDecimal activityPrice) {
        this.activityPrice = activityPrice;
    }

    /**
     * 获取活动图像
     *
     * @return activity_img - 活动图像
     */
    public String getActivityImg() {
        return activityImg;
    }

    /**
     * 设置活动图像
     *
     * @param activityImg 活动图像
     */
    public void setActivityImg(String activityImg) {
        this.activityImg = activityImg;
    }

    /**
     * 获取商品图片
     *
     * @return activity_item_img - 商品图片
     */
    public String getActivityItemImg() {
        return activityItemImg;
    }

    /**
     * 设置商品图片
     *
     * @param activityItemImg 商品图片
     */
    public void setActivityItemImg(String activityItemImg) {
        this.activityItemImg = activityItemImg;
    }

    /**
     * 获取商品简介
     *
     * @return sell_point - 商品简介
     */
    public String getSellPoint() {
        return sellPoint;
    }

    /**
     * 设置商品简介
     *
     * @param sellPoint 商品简介
     */
    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    /**
     * 获取商品数量
     *
     * @return item_num - 商品数量
     */
    public Long getItemNum() {
        return itemNum;
    }

    /**
     * 设置商品数量
     *
     * @param itemNum 商品数量
     */
    public void setItemNum(Long itemNum) {
        this.itemNum = itemNum;
    }

    /**
     * 获取活动状态 1 上线  2 下架
     *
     * @return status - 活动状态 1 上线  2 下架
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置活动状态 1 上线  2 下架
     *
     * @param status 活动状态 1 上线  2 下架
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取创建人
     *
     * @return create_user - 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人
     *
     * @param createUser 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
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
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取下架时间
     *
     * @return end_time - 下架时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置下架时间
     *
     * @param endTime 下架时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取分享次数
     *
     * @return share_num - 分享次数
     */
    public Long getShareNum() {
        return shareNum;
    }

    /**
     * 设置分享次数
     *
     * @param shareNum 分享次数
     */
    public void setShareNum(Long shareNum) {
        this.shareNum = shareNum;
    }

    /**
     * 获取预留字段
     *
     * @return cus_num_5 - 预留字段
     */
    public String getCusNum5() {
        return cusNum5;
    }

    /**
     * 设置预留字段
     *
     * @param cusNum5 预留字段
     */
    public void setCusNum5(String cusNum5) {
        this.cusNum5 = cusNum5;
    }

    /**
     * 获取预留字段|玩法介绍
     *
     * @return cus_num_4 - 预留字段|玩法介绍
     */
    public String getCusNum4() {
        return cusNum4;
    }

    /**
     * 设置预留字段|玩法介绍
     *
     * @param cusNum4 预留字段|玩法介绍
     */
    public void setCusNum4(String cusNum4) {
        this.cusNum4 = cusNum4;
    }

    /**
     * 获取商品评价
     *
     * @return item_eval - 商品评价
     */
    public String getItemEval() {
        return itemEval;
    }

    /**
     * 设置商品评价
     *
     * @param itemEval 商品评价
     */
    public void setItemEval(String itemEval) {
        this.itemEval = itemEval;
    }

    /**
     * 获取购买返还的积分
     *
     * @return item_rebate - 购买返还的积分
     */
    public Long getItemRebate() {
        return itemRebate;
    }

    /**
     * 设置购买返还的积分
     *
     * @param itemRebate 购买返还的积分
     */
    public void setItemRebate(Long itemRebate) {
        this.itemRebate = itemRebate;
    }

    /**
     * 获取预留字段|商品描述
     *
     * @return cus_num_1 - 预留字段|商品描述
     */
    public String getCusNum1() {
        return cusNum1;
    }

    /**
     * 设置预留字段|商品描述
     *
     * @param cusNum1 预留字段|商品描述
     */
    public void setCusNum1(String cusNum1) {
        this.cusNum1 = cusNum1;
    }

    /**
     * 获取预留字段
     *
     * @return cus_num_3 - 预留字段
     */
    public Long getCusNum3() {
        return cusNum3;
    }

    /**
     * 设置预留字段
     *
     * @param cusNum3 预留字段
     */
    public void setCusNum3(Long cusNum3) {
        this.cusNum3 = cusNum3;
    }
}