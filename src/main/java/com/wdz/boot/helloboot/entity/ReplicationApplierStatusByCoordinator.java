package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "replication_applier_status_by_coordinator")
public class ReplicationApplierStatusByCoordinator {
    @Column(name = "CHANNEL_NAME")
    private String channelName;

    @Column(name = "THREAD_ID")
    private Long threadId;

    @Column(name = "SERVICE_STATE")
    private String serviceState;

    @Column(name = "LAST_ERROR_NUMBER")
    private Integer lastErrorNumber;

    @Column(name = "LAST_ERROR_MESSAGE")
    private String lastErrorMessage;

    @Column(name = "LAST_ERROR_TIMESTAMP")
    private Date lastErrorTimestamp;

    /**
     * @return CHANNEL_NAME
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * @param channelName
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * @return THREAD_ID
     */
    public Long getThreadId() {
        return threadId;
    }

    /**
     * @param threadId
     */
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    /**
     * @return SERVICE_STATE
     */
    public String getServiceState() {
        return serviceState;
    }

    /**
     * @param serviceState
     */
    public void setServiceState(String serviceState) {
        this.serviceState = serviceState;
    }

    /**
     * @return LAST_ERROR_NUMBER
     */
    public Integer getLastErrorNumber() {
        return lastErrorNumber;
    }

    /**
     * @param lastErrorNumber
     */
    public void setLastErrorNumber(Integer lastErrorNumber) {
        this.lastErrorNumber = lastErrorNumber;
    }

    /**
     * @return LAST_ERROR_MESSAGE
     */
    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    /**
     * @param lastErrorMessage
     */
    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage;
    }

    /**
     * @return LAST_ERROR_TIMESTAMP
     */
    public Date getLastErrorTimestamp() {
        return lastErrorTimestamp;
    }

    /**
     * @param lastErrorTimestamp
     */
    public void setLastErrorTimestamp(Date lastErrorTimestamp) {
        this.lastErrorTimestamp = lastErrorTimestamp;
    }
}