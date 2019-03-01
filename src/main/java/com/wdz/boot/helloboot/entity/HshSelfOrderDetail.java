package com.wdz.boot.helloboot.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "hsh_self_order_detail")
public class HshSelfOrderDetail {
    /**
     * 商品id
     */
    @Column(name = "item_id")
    private Long itemId;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 商品购买数量
     */
    private Long num;

    /**
     * 商品名称
     */
    @Column(name = "item_name")
    private String itemName;

    /**
     * 商品单价
     */
    @Column(name = "item_price")
    private BigDecimal itemPrice;

    /**
     * 商品总金额
     */
    @Column(name = "total_count")
    private BigDecimal totalCount;

    /**
     * 积分
     */
    @Column(name = "item_rebate")
    private Long itemRebate;

    /**
     * 总积分
     */
    @Column(name = "total_rebate")
    private Long totalRebate;

    /**
     * 商品图片
     */
    @Column(name = "item_img")
    private String itemImg;

    /**
     * 获取商品id
     *
     * @return item_id - 商品id
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * 设置商品id
     *
     * @param itemId 商品id
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取商品购买数量
     *
     * @return num - 商品购买数量
     */
    public Long getNum() {
        return num;
    }

    /**
     * 设置商品购买数量
     *
     * @param num 商品购买数量
     */
    public void setNum(Long num) {
        this.num = num;
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
     * 获取商品单价
     *
     * @return item_price - 商品单价
     */
    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    /**
     * 设置商品单价
     *
     * @param itemPrice 商品单价
     */
    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * 获取商品总金额
     *
     * @return total_count - 商品总金额
     */
    public BigDecimal getTotalCount() {
        return totalCount;
    }

    /**
     * 设置商品总金额
     *
     * @param totalCount 商品总金额
     */
    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 获取积分
     *
     * @return item_rebate - 积分
     */
    public Long getItemRebate() {
        return itemRebate;
    }

    /**
     * 设置积分
     *
     * @param itemRebate 积分
     */
    public void setItemRebate(Long itemRebate) {
        this.itemRebate = itemRebate;
    }

    /**
     * 获取总积分
     *
     * @return total_rebate - 总积分
     */
    public Long getTotalRebate() {
        return totalRebate;
    }

    /**
     * 设置总积分
     *
     * @param totalRebate 总积分
     */
    public void setTotalRebate(Long totalRebate) {
        this.totalRebate = totalRebate;
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
}