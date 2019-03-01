package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_restaurant")
public class HshRestaurant {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 餐厅名称
     */
    private String name;

    /**
     * 规则id
     */
    @Column(name = "rule_id")
    private Integer ruleId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 预留字段1
     */
    private String column1;

    private Long column2;

    private String column3;

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
     * 获取餐厅名称
     *
     * @return name - 餐厅名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置餐厅名称
     *
     * @param name 餐厅名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取规则id
     *
     * @return rule_id - 规则id
     */
    public Integer getRuleId() {
        return ruleId;
    }

    /**
     * 设置规则id
     *
     * @param ruleId 规则id
     */
    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
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
     * 获取预留字段1
     *
     * @return column1 - 预留字段1
     */
    public String getColumn1() {
        return column1;
    }

    /**
     * 设置预留字段1
     *
     * @param column1 预留字段1
     */
    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    /**
     * @return column2
     */
    public Long getColumn2() {
        return column2;
    }

    /**
     * @param column2
     */
    public void setColumn2(Long column2) {
        this.column2 = column2;
    }

    /**
     * @return column3
     */
    public String getColumn3() {
        return column3;
    }

    /**
     * @param column3
     */
    public void setColumn3(String column3) {
        this.column3 = column3;
    }
}