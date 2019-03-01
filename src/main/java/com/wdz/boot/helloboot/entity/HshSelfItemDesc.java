package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_self_item_desc")
public class HshSelfItemDesc {
    /**
     * 商品ID
     */
    @Column(name = "item_id")
    private Long itemId;

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
     * 商品描述
     */
    @Column(name = "item_desc")
    private String itemDesc;

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

    /**
     * 获取商品描述
     *
     * @return item_desc - 商品描述
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * 设置商品描述
     *
     * @param itemDesc 商品描述
     */
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
}