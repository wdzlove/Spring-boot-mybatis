package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_activity_order_get_log")
public class HshActivityOrderGetLog {
    @Column(name = "log_id")
    private Long logId;

    /**
     * 订单ID
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 领取状态 （0、确定领取1、已领取，2：待领取）
     */
    private Byte status;

    /**
     * 截止时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * @return log_id
     */
    public Long getLogId() {
        return logId;
    }

    /**
     * @param logId
     */
    public void setLogId(Long logId) {
        this.logId = logId;
    }

    /**
     * 获取订单ID
     *
     * @return order_id - 订单ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID
     *
     * @param orderId 订单ID
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取领取状态 （0、确定领取1、已领取，2：待领取）
     *
     * @return status - 领取状态 （0、确定领取1、已领取，2：待领取）
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置领取状态 （0、确定领取1、已领取，2：待领取）
     *
     * @param status 领取状态 （0、确定领取1、已领取，2：待领取）
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取截止时间
     *
     * @return end_time - 截止时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置截止时间
     *
     * @param endTime 截止时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}