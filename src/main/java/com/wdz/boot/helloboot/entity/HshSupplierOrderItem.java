package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "hsh_supplier_order_item")
public class HshSupplierOrderItem {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单编号
     */
    @Column(name = "ORDER_ID")
    private Long orderId;

    /**
     * 商品编号
     */
    @Column(name = "GOODS_ID")
    private Long goodsId;

    /**
     * 销售数量
     */
    @Column(name = "SALES_NUM")
    private Integer salesNum;

    /**
     * 计划价格
     */
    @Column(name = "PLAN_PRICE")
    private Double planPrice;

    /**
     * 实际价格
     */
    @Column(name = "ACT_PRICE")
    private Double actPrice;

    @Column(name = "COLUMN_1")
    private String column1;

    @Column(name = "COLUMN_2")
    private Integer column2;

    @Column(name = "COLUMN_3")
    private Long column3;

    /**
     * @return ID
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
     * 获取订单编号
     *
     * @return ORDER_ID - 订单编号
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单编号
     *
     * @param orderId 订单编号
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取商品编号
     *
     * @return GOODS_ID - 商品编号
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品编号
     *
     * @param goodsId 商品编号
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取销售数量
     *
     * @return SALES_NUM - 销售数量
     */
    public Integer getSalesNum() {
        return salesNum;
    }

    /**
     * 设置销售数量
     *
     * @param salesNum 销售数量
     */
    public void setSalesNum(Integer salesNum) {
        this.salesNum = salesNum;
    }

    /**
     * 获取计划价格
     *
     * @return PLAN_PRICE - 计划价格
     */
    public Double getPlanPrice() {
        return planPrice;
    }

    /**
     * 设置计划价格
     *
     * @param planPrice 计划价格
     */
    public void setPlanPrice(Double planPrice) {
        this.planPrice = planPrice;
    }

    /**
     * 获取实际价格
     *
     * @return ACT_PRICE - 实际价格
     */
    public Double getActPrice() {
        return actPrice;
    }

    /**
     * 设置实际价格
     *
     * @param actPrice 实际价格
     */
    public void setActPrice(Double actPrice) {
        this.actPrice = actPrice;
    }

    /**
     * @return COLUMN_1
     */
    public String getColumn1() {
        return column1;
    }

    /**
     * @param column1
     */
    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    /**
     * @return COLUMN_2
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
     * @return COLUMN_3
     */
    public Long getColumn3() {
        return column3;
    }

    /**
     * @param column3
     */
    public void setColumn3(Long column3) {
        this.column3 = column3;
    }
}