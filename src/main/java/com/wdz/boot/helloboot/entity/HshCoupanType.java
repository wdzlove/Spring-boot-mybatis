package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_coupan_type")
public class HshCoupanType {
    /**
     * 类型ID
     */
    @Column(name = "coupan_type_id")
    private Long coupanTypeId;

    /**
     * 类型名称
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 状态 1可用，2 不可用
     */
    private Byte status;

    /**
     * 获取类型ID
     *
     * @return coupan_type_id - 类型ID
     */
    public Long getCoupanTypeId() {
        return coupanTypeId;
    }

    /**
     * 设置类型ID
     *
     * @param coupanTypeId 类型ID
     */
    public void setCoupanTypeId(Long coupanTypeId) {
        this.coupanTypeId = coupanTypeId;
    }

    /**
     * 获取类型名称
     *
     * @return type_name - 类型名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置类型名称
     *
     * @param typeName 类型名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
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
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取状态 1可用，2 不可用
     *
     * @return status - 状态 1可用，2 不可用
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态 1可用，2 不可用
     *
     * @param status 状态 1可用，2 不可用
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}