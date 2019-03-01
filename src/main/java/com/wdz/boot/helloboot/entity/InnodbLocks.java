package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "INNODB_LOCKS")
public class InnodbLocks {
    @Column(name = "lock_id")
    private String lockId;

    @Column(name = "lock_trx_id")
    private String lockTrxId;

    @Column(name = "lock_mode")
    private String lockMode;

    @Column(name = "lock_type")
    private String lockType;

    @Column(name = "lock_table")
    private String lockTable;

    @Column(name = "lock_index")
    private String lockIndex;

    @Column(name = "lock_space")
    private Long lockSpace;

    @Column(name = "lock_page")
    private Long lockPage;

    @Column(name = "lock_rec")
    private Long lockRec;

    @Column(name = "lock_data")
    private String lockData;

    /**
     * @return lock_id
     */
    public String getLockId() {
        return lockId;
    }

    /**
     * @param lockId
     */
    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    /**
     * @return lock_trx_id
     */
    public String getLockTrxId() {
        return lockTrxId;
    }

    /**
     * @param lockTrxId
     */
    public void setLockTrxId(String lockTrxId) {
        this.lockTrxId = lockTrxId;
    }

    /**
     * @return lock_mode
     */
    public String getLockMode() {
        return lockMode;
    }

    /**
     * @param lockMode
     */
    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    /**
     * @return lock_type
     */
    public String getLockType() {
        return lockType;
    }

    /**
     * @param lockType
     */
    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    /**
     * @return lock_table
     */
    public String getLockTable() {
        return lockTable;
    }

    /**
     * @param lockTable
     */
    public void setLockTable(String lockTable) {
        this.lockTable = lockTable;
    }

    /**
     * @return lock_index
     */
    public String getLockIndex() {
        return lockIndex;
    }

    /**
     * @param lockIndex
     */
    public void setLockIndex(String lockIndex) {
        this.lockIndex = lockIndex;
    }

    /**
     * @return lock_space
     */
    public Long getLockSpace() {
        return lockSpace;
    }

    /**
     * @param lockSpace
     */
    public void setLockSpace(Long lockSpace) {
        this.lockSpace = lockSpace;
    }

    /**
     * @return lock_page
     */
    public Long getLockPage() {
        return lockPage;
    }

    /**
     * @param lockPage
     */
    public void setLockPage(Long lockPage) {
        this.lockPage = lockPage;
    }

    /**
     * @return lock_rec
     */
    public Long getLockRec() {
        return lockRec;
    }

    /**
     * @param lockRec
     */
    public void setLockRec(Long lockRec) {
        this.lockRec = lockRec;
    }

    /**
     * @return lock_data
     */
    public String getLockData() {
        return lockData;
    }

    /**
     * @param lockData
     */
    public void setLockData(String lockData) {
        this.lockData = lockData;
    }
}