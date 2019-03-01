package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "hsh_wallet")
public class HshWallet {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    /**
     * 当前余额
     */
    @Column(name = "BURSE")
    private Double burse;

    /**
     * 当前积分
     */
    @Column(name = "SCORE")
    private Double score;

    /**
     * 累计获得金额
     */
    @Column(name = "AMOUNT_IN_BURSE")
    private Double amountInBurse;

    /**
     * 累计获得积分
     */
    @Column(name = "AMOUNT_IN_SCORE")
    private Double amountInScore;

    /**
     * 累计花费余额
     */
    @Column(name = "AMOUNT_OUT_BURSE")
    private Double amountOutBurse;

    /**
     * 累计花费积分
     */
    @Column(name = "AMOUNT_OUT_SCORE")
    private Integer amountOutScore;

    @Column(name = "COLUMN1")
    private String column1;

    @Column(name = "COLUMN2")
    private Integer column2;

    @Column(name = "COLUMN3")
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
     * @return CUSTOMER_ID
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取当前余额
     *
     * @return BURSE - 当前余额
     */
    public Double getBurse() {
        return burse;
    }

    /**
     * 设置当前余额
     *
     * @param burse 当前余额
     */
    public void setBurse(Double burse) {
        this.burse = burse;
    }

    /**
     * 获取当前积分
     *
     * @return SCORE - 当前积分
     */
    public Double getScore() {
        return score;
    }

    /**
     * 设置当前积分
     *
     * @param score 当前积分
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * 获取累计获得金额
     *
     * @return AMOUNT_IN_BURSE - 累计获得金额
     */
    public Double getAmountInBurse() {
        return amountInBurse;
    }

    /**
     * 设置累计获得金额
     *
     * @param amountInBurse 累计获得金额
     */
    public void setAmountInBurse(Double amountInBurse) {
        this.amountInBurse = amountInBurse;
    }

    /**
     * 获取累计获得积分
     *
     * @return AMOUNT_IN_SCORE - 累计获得积分
     */
    public Double getAmountInScore() {
        return amountInScore;
    }

    /**
     * 设置累计获得积分
     *
     * @param amountInScore 累计获得积分
     */
    public void setAmountInScore(Double amountInScore) {
        this.amountInScore = amountInScore;
    }

    /**
     * 获取累计花费余额
     *
     * @return AMOUNT_OUT_BURSE - 累计花费余额
     */
    public Double getAmountOutBurse() {
        return amountOutBurse;
    }

    /**
     * 设置累计花费余额
     *
     * @param amountOutBurse 累计花费余额
     */
    public void setAmountOutBurse(Double amountOutBurse) {
        this.amountOutBurse = amountOutBurse;
    }

    /**
     * 获取累计花费积分
     *
     * @return AMOUNT_OUT_SCORE - 累计花费积分
     */
    public Integer getAmountOutScore() {
        return amountOutScore;
    }

    /**
     * 设置累计花费积分
     *
     * @param amountOutScore 累计花费积分
     */
    public void setAmountOutScore(Integer amountOutScore) {
        this.amountOutScore = amountOutScore;
    }

    /**
     * @return COLUMN1
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
     * @return COLUMN3
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