package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_message")
public class HshMessage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 类型(0平台向用户发送消息，1平台向供应商发送消息)
     */
    private Long type;

    /**
     * 发送方id
     */
    @Column(name = "send_id")
    private Long sendId;

    /**
     * 接收方id
     */
    @Column(name = "receive_id")
    private Long receiveId;

    /**
     * 接收方是否查看(0:否  1:是)
     */
    private Long state;

    /**
     * 图片地址
     */
    @Column(name = "img_path")
    private String imgPath;

    private String column1;

    /**
     * 1订单驳回,2商家已接单,3商家已发货,4到账通知,5审核通过,6待发货,7新订单,8补货通知,9订单取消
     */
    private Long column2;

    private Date column3;

    /**
     * 发送时间
     */
    @Column(name = "send_time")
    private Date sendTime;

    /**
     * 关联数据的ID

     */
    @Column(name = "RELEVANCEID")
    private Long relevanceid;

    /**
     * 展示状态0不展示，1展示
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 内容
     */
    private String content;

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
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取类型(0平台向用户发送消息，1平台向供应商发送消息)
     *
     * @return type - 类型(0平台向用户发送消息，1平台向供应商发送消息)
     */
    public Long getType() {
        return type;
    }

    /**
     * 设置类型(0平台向用户发送消息，1平台向供应商发送消息)
     *
     * @param type 类型(0平台向用户发送消息，1平台向供应商发送消息)
     */
    public void setType(Long type) {
        this.type = type;
    }

    /**
     * 获取发送方id
     *
     * @return send_id - 发送方id
     */
    public Long getSendId() {
        return sendId;
    }

    /**
     * 设置发送方id
     *
     * @param sendId 发送方id
     */
    public void setSendId(Long sendId) {
        this.sendId = sendId;
    }

    /**
     * 获取接收方id
     *
     * @return receive_id - 接收方id
     */
    public Long getReceiveId() {
        return receiveId;
    }

    /**
     * 设置接收方id
     *
     * @param receiveId 接收方id
     */
    public void setReceiveId(Long receiveId) {
        this.receiveId = receiveId;
    }

    /**
     * 获取接收方是否查看(0:否  1:是)
     *
     * @return state - 接收方是否查看(0:否  1:是)
     */
    public Long getState() {
        return state;
    }

    /**
     * 设置接收方是否查看(0:否  1:是)
     *
     * @param state 接收方是否查看(0:否  1:是)
     */
    public void setState(Long state) {
        this.state = state;
    }

    /**
     * 获取图片地址
     *
     * @return img_path - 图片地址
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * 设置图片地址
     *
     * @param imgPath 图片地址
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    /**
     * @return column1
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
     * 获取1订单驳回,2商家已接单,3商家已发货,4到账通知,5审核通过,6待发货,7新订单,8补货通知,9订单取消
     *
     * @return column2 - 1订单驳回,2商家已接单,3商家已发货,4到账通知,5审核通过,6待发货,7新订单,8补货通知,9订单取消
     */
    public Long getColumn2() {
        return column2;
    }

    /**
     * 设置1订单驳回,2商家已接单,3商家已发货,4到账通知,5审核通过,6待发货,7新订单,8补货通知,9订单取消
     *
     * @param column2 1订单驳回,2商家已接单,3商家已发货,4到账通知,5审核通过,6待发货,7新订单,8补货通知,9订单取消
     */
    public void setColumn2(Long column2) {
        this.column2 = column2;
    }

    /**
     * @return column3
     */
    public Date getColumn3() {
        return column3;
    }

    /**
     * @param column3
     */
    public void setColumn3(Date column3) {
        this.column3 = column3;
    }

    /**
     * 获取发送时间
     *
     * @return send_time - 发送时间
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 设置发送时间
     *
     * @param sendTime 发送时间
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 获取关联数据的ID

     *
     * @return RELEVANCEID - 关联数据的ID

     */
    public Long getRelevanceid() {
        return relevanceid;
    }

    /**
     * 设置关联数据的ID

     *
     * @param relevanceid 关联数据的ID

     */
    public void setRelevanceid(Long relevanceid) {
        this.relevanceid = relevanceid;
    }

    /**
     * 获取展示状态0不展示，1展示
     *
     * @return STATUS - 展示状态0不展示，1展示
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置展示状态0不展示，1展示
     *
     * @param status 展示状态0不展示，1展示
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}