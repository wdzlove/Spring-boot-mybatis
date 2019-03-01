package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "zipkin_dependencies")
public class ZipkinDependencies {
    private Date day;

    private String parent;

    private String child;

    @Column(name = "call_count")
    private Long callCount;

    @Column(name = "error_count")
    private Long errorCount;

    /**
     * @return day
     */
    public Date getDay() {
        return day;
    }

    /**
     * @param day
     */
    public void setDay(Date day) {
        this.day = day;
    }

    /**
     * @return parent
     */
    public String getParent() {
        return parent;
    }

    /**
     * @param parent
     */
    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     * @return child
     */
    public String getChild() {
        return child;
    }

    /**
     * @param child
     */
    public void setChild(String child) {
        this.child = child;
    }

    /**
     * @return call_count
     */
    public Long getCallCount() {
        return callCount;
    }

    /**
     * @param callCount
     */
    public void setCallCount(Long callCount) {
        this.callCount = callCount;
    }

    /**
     * @return error_count
     */
    public Long getErrorCount() {
        return errorCount;
    }

    /**
     * @param errorCount
     */
    public void setErrorCount(Long errorCount) {
        this.errorCount = errorCount;
    }
}