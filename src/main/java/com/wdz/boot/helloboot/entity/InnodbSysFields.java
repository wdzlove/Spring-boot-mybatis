package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "INNODB_SYS_FIELDS")
public class InnodbSysFields {
    @Column(name = "INDEX_ID")
    private Long indexId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "POS")
    private Integer pos;

    /**
     * @return INDEX_ID
     */
    public Long getIndexId() {
        return indexId;
    }

    /**
     * @param indexId
     */
    public void setIndexId(Long indexId) {
        this.indexId = indexId;
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
    public Integer getPos() {
        return pos;
    }

    /**
     * @param pos
     */
    public void setPos(Integer pos) {
        this.pos = pos;
    }
}