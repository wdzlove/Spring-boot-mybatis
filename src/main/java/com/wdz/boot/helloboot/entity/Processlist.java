package com.wdz.boot.helloboot.entity;

import java.math.BigDecimal;
import javax.persistence.*;

public class Processlist {
    @Column(name = "thd_id")
    private Long thdId;

    @Column(name = "conn_id")
    private Long connId;

    private String user;

    private String db;

    private String command;

    private String state;

    private Long time;

    private BigDecimal progress;

    @Column(name = "rows_examined")
    private Long rowsExamined;

    @Column(name = "rows_sent")
    private Long rowsSent;

    @Column(name = "rows_affected")
    private Long rowsAffected;

    @Column(name = "tmp_tables")
    private Long tmpTables;

    @Column(name = "tmp_disk_tables")
    private Long tmpDiskTables;

    @Column(name = "full_scan")
    private String fullScan;

    @Column(name = "last_wait")
    private String lastWait;

    private String source;

    @Column(name = "trx_state")
    private String trxState;

    @Column(name = "trx_autocommit")
    private String trxAutocommit;

    private String pid;

    @Column(name = "program_name")
    private String programName;

    @Column(name = "current_statement")
    private String currentStatement;

    @Column(name = "statement_latency")
    private String statementLatency;

    @Column(name = "lock_latency")
    private String lockLatency;

    @Column(name = "last_statement")
    private String lastStatement;

    @Column(name = "last_statement_latency")
    private String lastStatementLatency;

    @Column(name = "current_memory")
    private String currentMemory;

    @Column(name = "last_wait_latency")
    private String lastWaitLatency;

    @Column(name = "trx_latency")
    private String trxLatency;

    /**
     * @return thd_id
     */
    public Long getThdId() {
        return thdId;
    }

    /**
     * @param thdId
     */
    public void setThdId(Long thdId) {
        this.thdId = thdId;
    }

    /**
     * @return conn_id
     */
    public Long getConnId() {
        return connId;
    }

    /**
     * @param connId
     */
    public void setConnId(Long connId) {
        this.connId = connId;
    }

    /**
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return db
     */
    public String getDb() {
        return db;
    }

    /**
     * @param db
     */
    public void setDb(String db) {
        this.db = db;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return command;
    }

    /**
     * @param command
     */
    public void setCommand(String command) {
        this.command = command;
    }

    /**
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return time
     */
    public Long getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * @return progress
     */
    public BigDecimal getProgress() {
        return progress;
    }

    /**
     * @param progress
     */
    public void setProgress(BigDecimal progress) {
        this.progress = progress;
    }

    /**
     * @return rows_examined
     */
    public Long getRowsExamined() {
        return rowsExamined;
    }

    /**
     * @param rowsExamined
     */
    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    /**
     * @return rows_sent
     */
    public Long getRowsSent() {
        return rowsSent;
    }

    /**
     * @param rowsSent
     */
    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    /**
     * @return rows_affected
     */
    public Long getRowsAffected() {
        return rowsAffected;
    }

    /**
     * @param rowsAffected
     */
    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    /**
     * @return tmp_tables
     */
    public Long getTmpTables() {
        return tmpTables;
    }

    /**
     * @param tmpTables
     */
    public void setTmpTables(Long tmpTables) {
        this.tmpTables = tmpTables;
    }

    /**
     * @return tmp_disk_tables
     */
    public Long getTmpDiskTables() {
        return tmpDiskTables;
    }

    /**
     * @param tmpDiskTables
     */
    public void setTmpDiskTables(Long tmpDiskTables) {
        this.tmpDiskTables = tmpDiskTables;
    }

    /**
     * @return full_scan
     */
    public String getFullScan() {
        return fullScan;
    }

    /**
     * @param fullScan
     */
    public void setFullScan(String fullScan) {
        this.fullScan = fullScan;
    }

    /**
     * @return last_wait
     */
    public String getLastWait() {
        return lastWait;
    }

    /**
     * @param lastWait
     */
    public void setLastWait(String lastWait) {
        this.lastWait = lastWait;
    }

    /**
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return trx_state
     */
    public String getTrxState() {
        return trxState;
    }

    /**
     * @param trxState
     */
    public void setTrxState(String trxState) {
        this.trxState = trxState;
    }

    /**
     * @return trx_autocommit
     */
    public String getTrxAutocommit() {
        return trxAutocommit;
    }

    /**
     * @param trxAutocommit
     */
    public void setTrxAutocommit(String trxAutocommit) {
        this.trxAutocommit = trxAutocommit;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return program_name
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * @param programName
     */
    public void setProgramName(String programName) {
        this.programName = programName;
    }

    /**
     * @return current_statement
     */
    public String getCurrentStatement() {
        return currentStatement;
    }

    /**
     * @param currentStatement
     */
    public void setCurrentStatement(String currentStatement) {
        this.currentStatement = currentStatement;
    }

    /**
     * @return statement_latency
     */
    public String getStatementLatency() {
        return statementLatency;
    }

    /**
     * @param statementLatency
     */
    public void setStatementLatency(String statementLatency) {
        this.statementLatency = statementLatency;
    }

    /**
     * @return lock_latency
     */
    public String getLockLatency() {
        return lockLatency;
    }

    /**
     * @param lockLatency
     */
    public void setLockLatency(String lockLatency) {
        this.lockLatency = lockLatency;
    }

    /**
     * @return last_statement
     */
    public String getLastStatement() {
        return lastStatement;
    }

    /**
     * @param lastStatement
     */
    public void setLastStatement(String lastStatement) {
        this.lastStatement = lastStatement;
    }

    /**
     * @return last_statement_latency
     */
    public String getLastStatementLatency() {
        return lastStatementLatency;
    }

    /**
     * @param lastStatementLatency
     */
    public void setLastStatementLatency(String lastStatementLatency) {
        this.lastStatementLatency = lastStatementLatency;
    }

    /**
     * @return current_memory
     */
    public String getCurrentMemory() {
        return currentMemory;
    }

    /**
     * @param currentMemory
     */
    public void setCurrentMemory(String currentMemory) {
        this.currentMemory = currentMemory;
    }

    /**
     * @return last_wait_latency
     */
    public String getLastWaitLatency() {
        return lastWaitLatency;
    }

    /**
     * @param lastWaitLatency
     */
    public void setLastWaitLatency(String lastWaitLatency) {
        this.lastWaitLatency = lastWaitLatency;
    }

    /**
     * @return trx_latency
     */
    public String getTrxLatency() {
        return trxLatency;
    }

    /**
     * @param trxLatency
     */
    public void setTrxLatency(String trxLatency) {
        this.trxLatency = trxLatency;
    }
}