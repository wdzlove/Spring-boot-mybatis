package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "replication_connection_status")
public class ReplicationConnectionStatus {
    @Column(name = "CHANNEL_NAME")
    private String channelName;

    @Column(name = "GROUP_NAME")
    private String groupName;

    @Column(name = "SOURCE_UUID")
    private String sourceUuid;

    @Column(name = "THREAD_ID")
    private Long threadId;

    @Column(name = "SERVICE_STATE")
    private String serviceState;

    @Column(name = "COUNT_RECEIVED_HEARTBEATS")
    private Long countReceivedHeartbeats;

    /**
     * Shows when the most recent heartbeat signal was received.
     */
    @Column(name = "LAST_HEARTBEAT_TIMESTAMP")
    private Date lastHeartbeatTimestamp;

    @Column(name = "LAST_ERROR_NUMBER")
    private Integer lastErrorNumber;

    @Column(name = "LAST_ERROR_MESSAGE")
    private String lastErrorMessage;

    @Column(name = "LAST_ERROR_TIMESTAMP")
    private Date lastErrorTimestamp;

    @Column(name = "RECEIVED_TRANSACTION_SET")
    private String receivedTransactionSet;

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
     * @return GROUP_NAME
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * @return SOURCE_UUID
     */
    public String getSourceUuid() {
        return sourceUuid;
    }

    /**
     * @param sourceUuid
     */
    public void setSourceUuid(String sourceUuid) {
        this.sourceUuid = sourceUuid;
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
     * @return COUNT_RECEIVED_HEARTBEATS
     */
    public Long getCountReceivedHeartbeats() {
        return countReceivedHeartbeats;
    }

    /**
     * @param countReceivedHeartbeats
     */
    public void setCountReceivedHeartbeats(Long countReceivedHeartbeats) {
        this.countReceivedHeartbeats = countReceivedHeartbeats;
    }

    /**
     * 获取Shows when the most recent heartbeat signal was received.
     *
     * @return LAST_HEARTBEAT_TIMESTAMP - Shows when the most recent heartbeat signal was received.
     */
    public Date getLastHeartbeatTimestamp() {
        return lastHeartbeatTimestamp;
    }

    /**
     * 设置Shows when the most recent heartbeat signal was received.
     *
     * @param lastHeartbeatTimestamp Shows when the most recent heartbeat signal was received.
     */
    public void setLastHeartbeatTimestamp(Date lastHeartbeatTimestamp) {
        this.lastHeartbeatTimestamp = lastHeartbeatTimestamp;
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

    /**
     * @return RECEIVED_TRANSACTION_SET
     */
    public String getReceivedTransactionSet() {
        return receivedTransactionSet;
    }

    /**
     * @param receivedTransactionSet
     */
    public void setReceivedTransactionSet(String receivedTransactionSet) {
        this.receivedTransactionSet = receivedTransactionSet;
    }
}