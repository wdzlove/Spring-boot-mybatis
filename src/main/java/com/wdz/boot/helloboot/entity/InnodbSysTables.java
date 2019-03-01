package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "INNODB_SYS_TABLES")
public class InnodbSysTables {
    @Column(name = "TABLE_ID")
    private Long tableId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "FLAG")
    private Integer flag;

    @Column(name = "N_COLS")
    private Integer nCols;

    @Column(name = "SPACE")
    private Integer space;

    @Column(name = "FILE_FORMAT")
    private String fileFormat;

    @Column(name = "ROW_FORMAT")
    private String rowFormat;

    @Column(name = "ZIP_PAGE_SIZE")
    private Integer zipPageSize;

    @Column(name = "SPACE_TYPE")
    private String spaceType;

    /**
     * @return TABLE_ID
     */
    public Long getTableId() {
        return tableId;
    }

    /**
     * @param tableId
     */
    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    /**
     * @return NAME
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
     * @return FLAG
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * @return N_COLS
     */
    public Integer getnCols() {
        return nCols;
    }

    /**
     * @param nCols
     */
    public void setnCols(Integer nCols) {
        this.nCols = nCols;
    }

    /**
     * @return SPACE
     */
    public Integer getSpace() {
        return space;
    }

    /**
     * @param space
     */
    public void setSpace(Integer space) {
        this.space = space;
    }

    /**
     * @return FILE_FORMAT
     */
    public String getFileFormat() {
        return fileFormat;
    }

    /**
     * @param fileFormat
     */
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
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
     * @return ZIP_PAGE_SIZE
     */
    public Integer getZipPageSize() {
        return zipPageSize;
    }

    /**
     * @param zipPageSize
     */
    public void setZipPageSize(Integer zipPageSize) {
        this.zipPageSize = zipPageSize;
    }

    /**
     * @return SPACE_TYPE
     */
    public String getSpaceType() {
        return spaceType;
    }

    /**
     * @param spaceType
     */
    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType;
    }
}