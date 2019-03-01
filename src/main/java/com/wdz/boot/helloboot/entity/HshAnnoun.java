package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_announ")
public class HshAnnoun {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 兑换人姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 商品名称
     */
    @Column(name = "item_name")
    private String itemName;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "cus_num_1")
    private String cusNum1;

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
     * 获取兑换人姓名
     *
     * @return user_name - 兑换人姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置兑换人姓名
     *
     * @param userName 兑换人姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
    public Long getCusNum2() {
        return cusNum2;
    }

    /**
     * @param cusNum2
     */
    public void setCusNum2(Long cusNum2) {
        this.cusNum2 = cusNum2;
    }
}