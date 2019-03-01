package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "SQL_FILTER_INFO")
public class SqlFilterInfo {
    @Column(name = "TYPE")
    private String type;

    @Column(name = "ITEM_ID")
    private Long itemId;

    @Column(name = "CUR_CONC")
    private Long curConc;

    @Column(name = "MAX_CONC")
    private Long maxConc;

    @Column(name = "KEY_NUM")
    private Long keyNum;

    @Column(name = "KEY_STR")
    private String keyStr;

    /**
     * @return TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return ITEM_ID
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * @param itemId
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * @return CUR_CONC
     */
    public Long getCurConc() {
        return curConc;
    }

    /**
     * @param curConc
     */
    public void setCurConc(Long curConc) {
        this.curConc = curConc;
    }

    /**
     * @return MAX_CONC
     */
    public Long getMaxConc() {
        return maxConc;
    }

    /**
     * @param maxConc
     */
    public void setMaxConc(Long maxConc) {
        this.maxConc = maxConc;
    }

    /**
     * @return KEY_NUM
     */
    public Long getKeyNum() {
        return keyNum;
    }

    /**
     * @param keyNum
     */
    public void setKeyNum(Long keyNum) {
        this.keyNum = keyNum;
    }

    /**
     * @return KEY_STR
     */
    public String getKeyStr() {
        return keyStr;
    }

    /**
     * @param keyStr
     */
    public void setKeyStr(String keyStr) {
        this.keyStr = keyStr;
    }
}