package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "integral_rules")
public class IntegralRules {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单类型
     */
    private String code;

    /**
     * 规则名称
     */
    @Column(name = "integral_name")
    private String integralName;

    /**
     * 积分规则
     */
    private Double integral;

    /**
     * 简介
     */
    @Column(name = "Introduction")
    private String introduction;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "cus_num_1")
    private String cusNum1;

    @Column(name = "cus_num_2")
    private String cusNum2;

    @Column(name = "cus_num_3")
    private String cusNum3;

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
     * 获取订单类型
     *
     * @return code - 订单类型
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置订单类型
     *
     * @param code 订单类型
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取规则名称
     *
     * @return integral_name - 规则名称
     */
    public String getIntegralName() {
        return integralName;
    }

    /**
     * 设置规则名称
     *
     * @param integralName 规则名称
     */
    public void setIntegralName(String integralName) {
        this.integralName = integralName;
    }

    /**
     * 获取积分规则
     *
     * @return integral - 积分规则
     */
    public Double getIntegral() {
        return integral;
    }

    /**
     * 设置积分规则
     *
     * @param integral 积分规则
     */
    public void setIntegral(Double integral) {
        this.integral = integral;
    }

    /**
     * 获取简介
     *
     * @return Introduction - 简介
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置简介
     *
     * @param introduction 简介
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
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
    public String getCusNum2() {
        return cusNum2;
    }

    /**
     * @param cusNum2
     */
    public void setCusNum2(String cusNum2) {
        this.cusNum2 = cusNum2;
    }

    /**
     * @return cus_num_3
     */
    public String getCusNum3() {
        return cusNum3;
    }

    /**
     * @param cusNum3
     */
    public void setCusNum3(String cusNum3) {
        this.cusNum3 = cusNum3;
    }
}