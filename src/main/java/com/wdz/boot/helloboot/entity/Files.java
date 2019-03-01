package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

public class Files {
    @Column(name = "FILE_ID")
    private Long fileId;

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "FILE_TYPE")
    private String fileType;

    @Column(name = "TABLESPACE_NAME")
    private String tablespaceName;

    @Column(name = "TABLE_CATALOG")
    private String tableCatalog;

    @Column(name = "TABLE_SCHEMA")
    private String tableSchema;

    @Column(name = "TABLE_NAME")
    private String tableName;

    @Column(name = "LOGFILE_GROUP_NAME")
    private String logfileGroupName;

    @Column(name = "LOGFILE_GROUP_NUMBER")
    private Long logfileGroupNumber;

    @Column(name = "ENGINE")
    private String engine;

    @Column(name = "FULLTEXT_KEYS")
    private String fulltextKeys;

    @Column(name = "DELETED_ROWS")
    private Long deletedRows;

    @Column(name = "UPDATE_COUNT")
    private Long updateCount;

    @Column(name = "FREE_EXTENTS")
    private Long freeExtents;

    @Column(name = "TOTAL_EXTENTS")
    private Long totalExtents;

    @Column(name = "EXTENT_SIZE")
    private Long extentSize;

    @Column(name = "INITIAL_SIZE")
    private Long initialSize;

    @Column(name = "MAXIMUM_SIZE")
    private Long maximumSize;

    @Column(name = "AUTOEXTEND_SIZE")
    private Long autoextendSize;

    @Column(name = "CREATION_TIME")
    private Date creationTime;

    @Column(name = "LAST_UPDATE_TIME")
    private Date lastUpdateTime;

    @Column(name = "LAST_ACCESS_TIME")
    private Date lastAccessTime;

    @Column(name = "RECOVER_TIME")
    private Long recoverTime;

    @Column(name = "TRANSACTION_COUNTER")
    private Long transactionCounter;

    @Column(name = "VERSION")
    private Long version;

    @Column(name = "ROW_FORMAT")
    private String rowFormat;

    @Column(name = "TABLE_ROWS")
    private Long tableRows;

    @Column(name = "AVG_ROW_LENGTH")
    private Long avgRowLength;

    @Column(name = "DATA_LENGTH")
    private Long dataLength;

    @Column(name = "MAX_DATA_LENGTH")
    private Long maxDataLength;

    @Column(name = "INDEX_LENGTH")
    private Long indexLength;

    @Column(name = "DATA_FREE")
    private Long dataFree;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "CHECK_TIME")
    private Date checkTime;

    @Column(name = "CHECKSUM")
    private Long checksum;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "EXTRA")
    private String extra;

    /**
     * @return FILE_ID
     */
    public Long getFileId() {
        return fileId;
    }

    /**
     * @param fileId
     */
    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    /**
     * @return FILE_NAME
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return FILE_TYPE
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * @param fileType
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * @return TABLESPACE_NAME
     */
    public String getTablespaceName() {
        return tablespaceName;
    }

    /**
     * @param tablespaceName
     */
    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    /**
     * @return TABLE_CATALOG
     */
    public String getTableCatalog() {
        return tableCatalog;
    }

    /**
     * @param tableCatalog
     */
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    /**
     * @return TABLE_SCHEMA
     */
    public String getTableSchema() {
        return tableSchema;
    }

    /**
     * @param tableSchema
     */
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    /**
     * @return TABLE_NAME
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return LOGFILE_GROUP_NAME
     */
    public String getLogfileGroupName() {
        return logfileGroupName;
    }

    /**
     * @param logfileGroupName
     */
    public void setLogfileGroupName(String logfileGroupName) {
        this.logfileGroupName = logfileGroupName;
    }

    /**
     * @return LOGFILE_GROUP_NUMBER
     */
    public Long getLogfileGroupNumber() {
        return logfileGroupNumber;
    }

    /**
     * @param logfileGroupNumber
     */
    public void setLogfileGroupNumber(Long logfileGroupNumber) {
        this.logfileGroupNumber = logfileGroupNumber;
    }

    /**
     * @return ENGINE
     */
    public String getEngine() {
        return engine;
    }

    /**
     * @param engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * @return FULLTEXT_KEYS
     */
    public String getFulltextKeys() {
        return fulltextKeys;
    }

    /**
     * @param fulltextKeys
     */
    public void setFulltextKeys(String fulltextKeys) {
        this.fulltextKeys = fulltextKeys;
    }

    /**
     * @return DELETED_ROWS
     */
    public Long getDeletedRows() {
        return deletedRows;
    }

    /**
     * @param deletedRows
     */
    public void setDeletedRows(Long deletedRows) {
        this.deletedRows = deletedRows;
    }

    /**
     * @return UPDATE_COUNT
     */
    public Long getUpdateCount() {
        return updateCount;
    }

    /**
     * @param updateCount
     */
    public void setUpdateCount(Long updateCount) {
        this.updateCount = updateCount;
    }

    /**
     * @return FREE_EXTENTS
     */
    public Long getFreeExtents() {
        return freeExtents;
    }

    /**
     * @param freeExtents
     */
    public void setFreeExtents(Long freeExtents) {
        this.freeExtents = freeExtents;
    }

    /**
     * @return TOTAL_EXTENTS
     */
    public Long getTotalExtents() {
        return totalExtents;
    }

    /**
     * @param totalExtents
     */
    public void setTotalExtents(Long totalExtents) {
        this.totalExtents = totalExtents;
    }

    /**
     * @return EXTENT_SIZE
     */
    public Long getExtentSize() {
        return extentSize;
    }

    /**
     * @param extentSize
     */
    public void setExtentSize(Long extentSize) {
        this.extentSize = extentSize;
    }

    /**
     * @return INITIAL_SIZE
     */
    public Long getInitialSize() {
        return initialSize;
    }

    /**
     * @param initialSize
     */
    public void setInitialSize(Long initialSize) {
        this.initialSize = initialSize;
    }

    /**
     * @return MAXIMUM_SIZE
     */
    public Long getMaximumSize() {
        return maximumSize;
    }

    /**
     * @param maximumSize
     */
    public void setMaximumSize(Long maximumSize) {
        this.maximumSize = maximumSize;
    }

    /**
     * @return AUTOEXTEND_SIZE
     */
    public Long getAutoextendSize() {
        return autoextendSize;
    }

    /**
     * @param autoextendSize
     */
    public void setAutoextendSize(Long autoextendSize) {
        this.autoextendSize = autoextendSize;
    }

    /**
     * @return CREATION_TIME
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * @param creationTime
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * @return LAST_UPDATE_TIME
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * @return LAST_ACCESS_TIME
     */
    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    /**
     * @param lastAccessTime
     */
    public void setLastAccessTime(Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * @return RECOVER_TIME
     */
    public Long getRecoverTime() {
        return recoverTime;
    }

    /**
     * @param recoverTime
     */
    public void setRecoverTime(Long recoverTime) {
        this.recoverTime = recoverTime;
    }

    /**
     * @return TRANSACTION_COUNTER
     */
    public Long getTransactionCounter() {
        return transactionCounter;
    }

    /**
     * @param transactionCounter
     */
    public void setTransactionCounter(Long transactionCounter) {
        this.transactionCounter = transactionCounter;
    }

    /**
     * @return VERSION
     */
    public Long getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * @return ROW_FORMAT
     */
    public String getRowFormat() {
        return rowFormat;
    }

    /**
     * @param rowFormat
     */
    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
    }

    /**
     * @return TABLE_ROWS
     */
    public Long getTableRows() {
        return tableRows;
    }

    /**
     * @param tableRows
     */
    public void setTableRows(Long tableRows) {
        this.tableRows = tableRows;
    }

    /**
     * @return AVG_ROW_LENGTH
     */
    public Long getAvgRowLength() {
        return avgRowLength;
    }

    /**
     * @param avgRowLength
     */
    public void setAvgRowLength(Long avgRowLength) {
        this.avgRowLength = avgRowLength;
    }

    /**
     * @return DATA_LENGTH
     */
    public Long getDataLength() {
        return dataLength;
    }

    /**
     * @param dataLength
     */
    public void setDataLength(Long dataLength) {
        this.dataLength = dataLength;
    }

    /**
     * @return MAX_DATA_LENGTH
     */
    public Long getMaxDataLength() {
        return maxDataLength;
    }

    /**
     * @param maxDataLength
     */
    public void setMaxDataLength(Long maxDataLength) {
        this.maxDataLength = maxDataLength;
    }

    /**
     * @return INDEX_LENGTH
     */
    public Long getIndexLength() {
        return indexLength;
    }

    /**
     * @param indexLength
     */
    public void setIndexLength(Long indexLength) {
        this.indexLength = indexLength;
    }

    /**
     * @return DATA_FREE
     */
    public Long getDataFree() {
        return dataFree;
    }

    /**
     * @param dataFree
     */
    public void setDataFree(Long dataFree) {
        this.dataFree = dataFree;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return CHECK_TIME
     */
    public Date getCheckTime() {
        return checkTime;
    }

    /**
     * @param checkTime
     */
    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    /**
     * @return CHECKSUM
     */
    public Long getChecksum() {
        return checksum;
    }

    /**
     * @param checksum
     */
    public void setChecksum(Long checksum) {
        this.checksum = checksum;
    }

    /**
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return EXTRA
     */
    public String getExtra() {
        return extra;
    }

    /**
     * @param extra
     */
    public void setExtra(String extra) {
        this.extra = extra;
    }
}