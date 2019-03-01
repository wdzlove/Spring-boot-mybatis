package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "server_cost")
public class ServerCost {
    @Column(name = "cost_name")
    private String costName;

    @Column(name = "cost_value")
    private Float costValue;

    @Column(name = "last_update")
    private Date lastUpdate;

    private String comment;

    /**
     * @return cost_name
     */
    public String getCostName() {
        return costName;
    }

    /**
     * @param costName
     */
    public void setCostName(String costName) {
        this.costName = costName;
    }

    /**
     * @return cost_value
     */
    public Float getCostValue() {
        return costValue;
    }

    /**
     * @param costValue
     */
    public void setCostValue(Float costValue) {
        this.costValue = costValue;
    }

    /**
     * @return last_update
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * @param lastUpdate
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
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
}