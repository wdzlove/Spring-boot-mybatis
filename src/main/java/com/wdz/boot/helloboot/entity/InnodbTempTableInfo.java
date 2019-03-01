package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "INNODB_TEMP_TABLE_INFO")
public class InnodbTempTableInfo {
    @Column(name = "TABLE_ID")
    private Long tableId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "N_COLS")
    private Integer nCols;

    @Column(name = "SPACE")
    private Integer space;

    @Column(name = "PER_TABLE_TABLESPACE")
    private String perTableTablespace;

    @Column(name = "IS_COMPRESSED")
    private String isCompressed;

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
     * @return PER_TABLE_TABLESPACE
     */
    public String getPerTableTablespace() {
        return perTableTablespace;
    }

    /**
     * @param perTableTablespace
     */
    public void setPerTableTablespace(String perTableTablespace) {
        this.perTableTablespace = perTableTablespace;
    }

    /**
     * @return IS_COMPRESSED
     */
    public String getIsCompressed() {
        return isCompressed;
    }

    /**
     * @param isCompressed
     */
    public void setIsCompressed(String isCompressed) {
        this.isCompressed = isCompressed;
    }
}