package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "INNODB_SYS_DATAFILES")
public class InnodbSysDatafiles {
    @Column(name = "SPACE")
    private Integer space;

    @Column(name = "PATH")
    private String path;

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
     * @return PATH
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }
}