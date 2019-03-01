package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "rds_extra")
public class RdsExtra {
    private String name;

    private String type;

    private String comment;

    /**
     * @desc 0:creating, 1:active, 3:deleting
     */
    private Byte status;

    @Column(name = "gmt_created")
    private Date gmtCreated;

    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 获取@desc 0:creating, 1:active, 3:deleting
     *
     * @return status - @desc 0:creating, 1:active, 3:deleting
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置@desc 0:creating, 1:active, 3:deleting
     *
     * @param status @desc 0:creating, 1:active, 3:deleting
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return gmt_created
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * @param gmtCreated
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * @return gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}