package com.wdz.boot.helloboot.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_self_item")
public class HshSelfItem {
    /**
     * 商品ID
     */
    @Column(name = "item_id")
    private Long itemId;

    /**
     * 商品名称
     */
    @Column(name = "item_name")
    private String itemName;

    /**
     * 商品图片
     */
    @Column(name = "item_img")
    private String itemImg;

    /**
     * 商品简介
     */
    @Column(name = "sell_point")
    private String sellPoint;

    /**
     * 商品价格
     */
    @Column(name = "item_price")
    private BigDecimal itemPrice;

    /**
     * 商品积分
     */
    @Column(name = "item_integral")
    private Long itemIntegral;

    /**
     * 商品单位
     */
    @Column(name = "item_unit")
    private String itemUnit;

    /**
     * 邮费 0 就包邮， 大于0 不包邮
     */
    @Column(name = "post_fee")
    private Long postFee;

    /**
     * 商品数量
     */
    @Column(name = "item_num")
    private Long itemNum;

    /**
     * 商品状态  1-正常，2-下架，3-删除'
     */
    private Byte status;

    /**
     * 分享次数
     */
    @Column(name = "share_num")
    private Long shareNum;

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
     * 商品评价
     */
    @Column(name = "item_eval")
    private String itemEval;

    /**
     * 购买返的积分
     */
    @Column(name = "item_rebate")
    private Long itemRebate;

    /**
     * 预留字段  设置成是否推荐
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
     * 获取商品ID
     *
     * @return item_id - 商品ID
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * 设置商品ID
     *
     * @param itemId 商品ID
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取商品名称
     *
     * @return item_name - 商品名称
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置商品名称
     *
     * @param itemName 商品名称
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获取商品图片
     *
     * @return item_img - 商品图片
     */
    public String getItemImg() {
        return itemImg;
    }

    /**
     * 设置商品图片
     *
     * @param itemImg 商品图片
     */
    public void setItemImg(String itemImg) {
        this.itemImg = itemImg;
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
     * 获取商品价格
     *
     * @return item_price - 商品价格
     */
    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    /**
     * 设置商品价格
     *
     * @param itemPrice 商品价格
     */
    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * 获取商品积分
     *
     * @return item_integral - 商品积分
     */
    public Long getItemIntegral() {
        return itemIntegral;
    }

    /**
     * 设置商品积分
     *
     * @param itemIntegral 商品积分
     */
    public void setItemIntegral(Long itemIntegral) {
        this.itemIntegral = itemIntegral;
    }

    /**
     * 获取商品单位
     *
     * @return item_unit - 商品单位
     */
    public String getItemUnit() {
        return itemUnit;
    }

    /**
     * 设置商品单位
     *
     * @param itemUnit 商品单位
     */
    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    /**
     * 获取邮费 0 就包邮， 大于0 不包邮
     *
     * @return post_fee - 邮费 0 就包邮， 大于0 不包邮
     */
    public Long getPostFee() {
        return postFee;
    }

    /**
     * 设置邮费 0 就包邮， 大于0 不包邮
     *
     * @param postFee 邮费 0 就包邮， 大于0 不包邮
     */
    public void setPostFee(Long postFee) {
        this.postFee = postFee;
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
     * 获取商品状态  1-正常，2-下架，3-删除'
     *
     * @return status - 商品状态  1-正常，2-下架，3-删除'
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置商品状态  1-正常，2-下架，3-删除'
     *
     * @param status 商品状态  1-正常，2-下架，3-删除'
     */
    public void setStatus(Byte status) {
        this.status = status;
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
     * 获取购买返的积分
     *
     * @return item_rebate - 购买返的积分
     */
    public Long getItemRebate() {
        return itemRebate;
    }

    /**
     * 设置购买返的积分
     *
     * @param itemRebate 购买返的积分
     */
    public void setItemRebate(Long itemRebate) {
        this.itemRebate = itemRebate;
    }

    /**
     * 获取预留字段  设置成是否推荐
     *
     * @return cus_num_1 - 预留字段  设置成是否推荐
     */
    public String getCusNum1() {
        return cusNum1;
    }

    /**
     * 设置预留字段  设置成是否推荐
     *
     * @param cusNum1 预留字段  设置成是否推荐
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