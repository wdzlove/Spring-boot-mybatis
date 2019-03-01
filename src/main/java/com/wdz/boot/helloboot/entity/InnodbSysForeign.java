package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "INNODB_SYS_FOREIGN")
public class InnodbSysForeign {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "FOR_NAME")
    private String forName;

    @Column(name = "REF_NAME")
    private String refName;

    @Column(name = "N_COLS")
    private Integer nCols;

    @Column(name = "TYPE")
    private Integer type;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return FOR_NAME
     */
    public String getForName() {
        return forName;
    }

    /**
     * @param forName
     */
    public void setForName(String forName) {
        this.forName = forName;
    }

    /**
     * @return REF_NAME
     */
    public String getRefName() {
        return refName;
    }

    /**
     * @param refName
     */
    public void setRefName(String refName) {
        this.refName = refName;
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
     * @return TYPE
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }
}