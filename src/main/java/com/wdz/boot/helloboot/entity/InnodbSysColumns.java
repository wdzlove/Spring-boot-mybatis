package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "INNODB_SYS_COLUMNS")
public class InnodbSysColumns {
    @Column(name = "TABLE_ID")
    private Long tableId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "POS")
    private Long pos;

    @Column(name = "MTYPE")
    private Integer mtype;

    @Column(name = "PRTYPE")
    private Integer prtype;

    @Column(name = "LEN")
    private Integer len;

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
     * @return POS
     */
    public Long getPos() {
        return pos;
    }

    /**
     * @param pos
     */
    public void setPos(Long pos) {
        this.pos = pos;
    }

    /**
     * @return MTYPE
     */
    public Integer getMtype() {
        return mtype;
    }

    /**
     * @param mtype
     */
    public void setMtype(Integer mtype) {
        this.mtype = mtype;
    }

    /**
     * @return PRTYPE
     */
    public Integer getPrtype() {
        return prtype;
    }

    /**
     * @param prtype
     */
    public void setPrtype(Integer prtype) {
        this.prtype = prtype;
    }

    /**
     * @return LEN
     */
    public Integer getLen() {
        return len;
    }

    /**
     * @param len
     */
    public void setLen(Integer len) {
        this.len = len;
    }
}