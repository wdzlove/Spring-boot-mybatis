package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "CHARACTER_SETS")
public class CharacterSets {
    @Column(name = "CHARACTER_SET_NAME")
    private String characterSetName;

    @Column(name = "DEFAULT_COLLATE_NAME")
    private String defaultCollateName;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "MAXLEN")
    private Long maxlen;

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
     * @return DEFAULT_COLLATE_NAME
     */
    public String getDefaultCollateName() {
        return defaultCollateName;
    }

    /**
     * @param defaultCollateName
     */
    public void setDefaultCollateName(String defaultCollateName) {
        this.defaultCollateName = defaultCollateName;
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return MAXLEN
     */
    public Long getMaxlen() {
        return maxlen;
    }

    /**
     * @param maxlen
     */
    public void setMaxlen(Long maxlen) {
        this.maxlen = maxlen;
    }
}