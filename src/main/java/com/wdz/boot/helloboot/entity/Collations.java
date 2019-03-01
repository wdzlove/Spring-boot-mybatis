package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

public class Collations {
    @Column(name = "COLLATION_NAME")
    private String collationName;

    @Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;

    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "IS_DEFAULT")
    private String isDefault;

    @Column(name = "IS_COMPILED")
    private String isCompiled;

    @Column(name = "SORTLEN")
    private Long sortlen;

    /**
     * @return COLLATION_NAME
     */
    public String getCollationName() {
        return collationName;
    }

    /**
     * @param collationName
     */
    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    /**
     * @return CHARACTER_SET_NAME
     */
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * @param characterSetName
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return IS_DEFAULT
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * @param isDefault
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * @return IS_COMPILED
     */
    public String getIsCompiled() {
        return isCompiled;
    }

    /**
     * @param isCompiled
     */
    public void setIsCompiled(String isCompiled) {
        this.isCompiled = isCompiled;
    }

    /**
     * @return SORTLEN
     */
    public Long getSortlen() {
        return sortlen;
    }

    /**
     * @param sortlen
     */
    public void setSortlen(Long sortlen) {
        this.sortlen = sortlen;
    }
}