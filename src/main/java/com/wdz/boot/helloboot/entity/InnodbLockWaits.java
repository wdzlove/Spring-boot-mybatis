package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "innodb_lock_waits")
public class InnodbLockWaits {
    @Column(name = "wait_started")
    private Date waitStarted;

    @Column(name = "wait_age")
    private Date waitAge;

    @Column(name = "wait_age_secs")
    private Long waitAgeSecs;

    @Column(name = "locked_table")
    private String lockedTable;

    @Column(name = "locked_index")
    private String lockedIndex;

    @Column(name = "locked_type")
    private String lockedType;

    @Column(name = "waiting_trx_id")
    private String waitingTrxId;

    @Column(name = "waiting_trx_started")
    private Date waitingTrxStarted;

    @Column(name = "waiting_trx_age")
    private Date waitingTrxAge;

    @Column(name = "waiting_trx_rows_locked")
    private Long waitingTrxRowsLocked;

    @Column(name = "waiting_trx_rows_modified")
    private Long waitingTrxRowsModified;

    @Column(name = "waiting_pid")
    private Long waitingPid;

    @Column(name = "waiting_lock_id")
    private String waitingLockId;

    @Column(name = "waiting_lock_mode")
    private String waitingLockMode;

    @Column(name = "blocking_trx_id")
    private String blockingTrxId;

    @Column(name = "blocking_pid")
    private Long blockingPid;

    @Column(name = "blocking_lock_id")
    private String blockingLockId;

    @Column(name = "blocking_lock_mode")
    private String blockingLockMode;

    @Column(name = "blocking_trx_started")
    private Date blockingTrxStarted;

    @Column(name = "blocking_trx_age")
    private Date blockingTrxAge;

    @Column(name = "blocking_trx_rows_locked")
    private Long blockingTrxRowsLocked;

    @Column(name = "blocking_trx_rows_modified")
    private Long blockingTrxRowsModified;

    @Column(name = "sql_kill_blocking_query")
    private String sqlKillBlockingQuery;

    @Column(name = "sql_kill_blocking_connection")
    private String sqlKillBlockingConnection;

    @Column(name = "waiting_query")
    private String waitingQuery;

    @Column(name = "blocking_query")
    private String blockingQuery;

    /**
     * @return wait_started
     */
    public Date getWaitStarted() {
        return waitStarted;
    }

    /**
     * @param waitStarted
     */
    public void setWaitStarted(Date waitStarted) {
        this.waitStarted = waitStarted;
    }

    /**
     * @return wait_age
     */
    public Date getWaitAge() {
        return waitAge;
    }

    /**
     * @param waitAge
     */
    public void setWaitAge(Date waitAge) {
        this.waitAge = waitAge;
    }

    /**
     * @return wait_age_secs
     */
    public Long getWaitAgeSecs() {
        return waitAgeSecs;
    }

    /**
     * @param waitAgeSecs
     */
    public void setWaitAgeSecs(Long waitAgeSecs) {
        this.waitAgeSecs = waitAgeSecs;
    }

    /**
     * @return locked_table
     */
    public String getLockedTable() {
        return lockedTable;
    }

    /**
     * @param lockedTable
     */
    public void setLockedTable(String lockedTable) {
        this.lockedTable = lockedTable;
    }

    /**
     * @return locked_index
     */
    public String getLockedIndex() {
        return lockedIndex;
    }

    /**
     * @param lockedIndex
     */
    public void setLockedIndex(String lockedIndex) {
        this.lockedIndex = lockedIndex;
    }

    /**
     * @return locked_type
     */
    public String getLockedType() {
        return lockedType;
    }

    /**
     * @param lockedType
     */
    public void setLockedType(String lockedType) {
        this.lockedType = lockedType;
    }

    /**
     * @return waiting_trx_id
     */
    public String getWaitingTrxId() {
        return waitingTrxId;
    }

    /**
     * @param waitingTrxId
     */
    public void setWaitingTrxId(String waitingTrxId) {
        this.waitingTrxId = waitingTrxId;
    }

    /**
     * @return waiting_trx_started
     */
    public Date getWaitingTrxStarted() {
        return waitingTrxStarted;
    }

    /**
     * @param waitingTrxStarted
     */
    public void setWaitingTrxStarted(Date waitingTrxStarted) {
        this.waitingTrxStarted = waitingTrxStarted;
    }

    /**
     * @return waiting_trx_age
     */
    public Date getWaitingTrxAge() {
        return waitingTrxAge;
    }

    /**
     * @param waitingTrxAge
     */
    public void setWaitingTrxAge(Date waitingTrxAge) {
        this.waitingTrxAge = waitingTrxAge;
    }

    /**
     * @return waiting_trx_rows_locked
     */
    public Long getWaitingTrxRowsLocked() {
        return waitingTrxRowsLocked;
    }

    /**
     * @param waitingTrxRowsLocked
     */
    public void setWaitingTrxRowsLocked(Long waitingTrxRowsLocked) {
        this.waitingTrxRowsLocked = waitingTrxRowsLocked;
    }

    /**
     * @return waiting_trx_rows_modified
     */
    public Long getWaitingTrxRowsModified() {
        return waitingTrxRowsModified;
    }

    /**
     * @param waitingTrxRowsModified
     */
    public void setWaitingTrxRowsModified(Long waitingTrxRowsModified) {
        this.waitingTrxRowsModified = waitingTrxRowsModified;
    }

    /**
     * @return waiting_pid
     */
    public Long getWaitingPid() {
        return waitingPid;
    }

    /**
     * @param waitingPid
     */
    public void setWaitingPid(Long waitingPid) {
        this.waitingPid = waitingPid;
    }

    /**
     * @return waiting_lock_id
     */
    public String getWaitingLockId() {
        return waitingLockId;
    }

    /**
     * @param waitingLockId
     */
    public void setWaitingLockId(String waitingLockId) {
        this.waitingLockId = waitingLockId;
    }

    /**
     * @return waiting_lock_mode
     */
    public String getWaitingLockMode() {
        return waitingLockMode;
    }

    /**
     * @param waitingLockMode
     */
    public void setWaitingLockMode(String waitingLockMode) {
        this.waitingLockMode = waitingLockMode;
    }

    /**
     * @return blocking_trx_id
     */
    public String getBlockingTrxId() {
        return blockingTrxId;
    }

    /**
     * @param blockingTrxId
     */
    public void setBlockingTrxId(String blockingTrxId) {
        this.blockingTrxId = blockingTrxId;
    }

    /**
     * @return blocking_pid
     */
    public Long getBlockingPid() {
        return blockingPid;
    }

    /**
     * @param blockingPid
     */
    public void setBlockingPid(Long blockingPid) {
        this.blockingPid = blockingPid;
    }

    /**
     * @return blocking_lock_id
     */
    public String getBlockingLockId() {
        return blockingLockId;
    }

    /**
     * @param blockingLockId
     */
    public void setBlockingLockId(String blockingLockId) {
        this.blockingLockId = blockingLockId;
    }

    /**
     * @return blocking_lock_mode
     */
    public String getBlockingLockMode() {
        return blockingLockMode;
    }

    /**
     * @param blockingLockMode
     */
    public void setBlockingLockMode(String blockingLockMode) {
        this.blockingLockMode = blockingLockMode;
    }

    /**
     * @return blocking_trx_started
     */
    public Date getBlockingTrxStarted() {
        return blockingTrxStarted;
    }

    /**
     * @param blockingTrxStarted
     */
    public void setBlockingTrxStarted(Date blockingTrxStarted) {
        this.blockingTrxStarted = blockingTrxStarted;
    }

    /**
     * @return blocking_trx_age
     */
    public Date getBlockingTrxAge() {
        return blockingTrxAge;
    }

    /**
     * @param blockingTrxAge
     */
    public void setBlockingTrxAge(Date blockingTrxAge) {
        this.blockingTrxAge = blockingTrxAge;
    }

    /**
     * @return blocking_trx_rows_locked
     */
    public Long getBlockingTrxRowsLocked() {
        return blockingTrxRowsLocked;
    }

    /**
     * @param blockingTrxRowsLocked
     */
    public void setBlockingTrxRowsLocked(Long blockingTrxRowsLocked) {
        this.blockingTrxRowsLocked = blockingTrxRowsLocked;
    }

    /**
     * @return blocking_trx_rows_modified
     */
    public Long getBlockingTrxRowsModified() {
        return blockingTrxRowsModified;
    }

    /**
     * @param blockingTrxRowsModified
     */
    public void setBlockingTrxRowsModified(Long blockingTrxRowsModified) {
        this.blockingTrxRowsModified = blockingTrxRowsModified;
    }

    /**
     * @return sql_kill_blocking_query
     */
    public String getSqlKillBlockingQuery() {
        return sqlKillBlockingQuery;
    }

    /**
     * @param sqlKillBlockingQuery
     */
    public void setSqlKillBlockingQuery(String sqlKillBlockingQuery) {
        this.sqlKillBlockingQuery = sqlKillBlockingQuery;
    }

    /**
     * @return sql_kill_blocking_connection
     */
    public String getSqlKillBlockingConnection() {
        return sqlKillBlockingConnection;
    }

    /**
     * @param sqlKillBlockingConnection
     */
    public void setSqlKillBlockingConnection(String sqlKillBlockingConnection) {
        this.sqlKillBlockingConnection = sqlKillBlockingConnection;
    }

    /**
     * @return waiting_query
     */
    public String getWaitingQuery() {
        return waitingQuery;
    }

    /**
     * @param waitingQuery
     */
    public void setWaitingQuery(String waitingQuery) {
        this.waitingQuery = waitingQuery;
    }

    /**
     * @return blocking_query
     */
    public String getBlockingQuery() {
        return blockingQuery;
    }

    /**
     * @param blockingQuery
     */
    public void setBlockingQuery(String blockingQuery) {
        this.blockingQuery = blockingQuery;
    }
}