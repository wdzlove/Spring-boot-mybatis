package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_collection")
public class HshCollection {
    /**
     * 收藏ID
     */
    @Column(name = "coll_id")
    private Long collId;

    /**
     * 商品ID
     */
    @Column(name = "item_id")
    private Long itemId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 店铺ID
     */
    @Column(name = "store_id")
    private Long storeId;

    /**
     * 收藏时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 收藏类型  1 商品 2 店铺
     */
    @Column(name = "coll_type")
    private Byte collType;

    /**
     * 是否有效  0无效， 1 有效
     */
    @Column(name = "is_del")
    private Byte isDel;

    /**
     * 预留字段
     */
    @Column(name = "cus_num_1")
    private String cusNum1;

    /**
     * 预留字段
     */
    @Column(name = "cus_num_2")
    private Long cusNum2;

    /**
     * 预留字段
     */
    @Column(name = "cus_num_3")
    private String cusNum3;

    /**
     * 获取收藏ID
     *
     * @return coll_id - 收藏ID
     */
    public Long getCollId() {
        return collId;
    }

    /**
     * 设置收藏ID
     *
     * @param collId 收藏ID
     */
    public void setCollId(Long collId) {
        this.collId = collId;
    }

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
     * 获取店铺ID
     *
     * @return store_id - 店铺ID
     */
    public Long getStoreId() {
        return storeId;
    }

    /**
     * 设置店铺ID
     *
     * @param storeId 店铺ID
     */
    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    /**
     * 获取收藏时间
     *
     * @return create_time - 收藏时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置收藏时间
     *
     * @param createTime 收藏时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取收藏类型  1 商品 2 店铺
     *
     * @return coll_type - 收藏类型  1 商品 2 店铺
     */
    public Byte getCollType() {
        return collType;
    }

    /**
     * 设置收藏类型  1 商品 2 店铺
     *
     * @param collType 收藏类型  1 商品 2 店铺
     */
    public void setCollType(Byte collType) {
        this.collType = collType;
    }

    /**
     * 获取是否有效  0无效， 1 有效
     *
     * @return is_del - 是否有效  0无效， 1 有效
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * 设置是否有效  0无效， 1 有效
     *
     * @param isDel 是否有效  0无效， 1 有效
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
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
    public Long getCusNum2() {
        return cusNum2;
    }

    /**
     * 设置预留字段
     *
     * @param cusNum2 预留字段
     */
    public void setCusNum2(Long cusNum2) {
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