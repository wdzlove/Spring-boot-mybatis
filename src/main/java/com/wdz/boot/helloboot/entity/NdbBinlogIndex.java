package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "ndb_binlog_index")
public class NdbBinlogIndex {
    @Column(name = "Position")
    private Long position;

    @Column(name = "File")
    private String file;

    private Long epoch;

    private Integer inserts;

    private Integer updates;

    private Integer deletes;

    private Integer schemaops;

    @Column(name = "orig_server_id")
    private Integer origServerId;

    @Column(name = "orig_epoch")
    private Long origEpoch;

    private Integer gci;

    @Column(name = "next_position")
    private Long nextPosition;

    @Column(name = "next_file")
    private String nextFile;

    /**
     * @return Position
     */
    public Long getPosition() {
        return position;
    }

    /**
     * @param position
     */
    public void setPosition(Long position) {
        this.position = position;
    }

    /**
     * @return File
     */
    public String getFile() {
        return file;
    }

    /**
     * @param file
     */
    public void setFile(String file) {
        this.file = file;
    }

    /**
     * @return epoch
     */
    public Long getEpoch() {
        return epoch;
    }

    /**
     * @param epoch
     */
    public void setEpoch(Long epoch) {
        this.epoch = epoch;
    }

    /**
     * @return inserts
     */
    public Integer getInserts() {
        return inserts;
    }

    /**
     * @param inserts
     */
    public void setInserts(Integer inserts) {
        this.inserts = inserts;
    }

    /**
     * @return updates
     */
    public Integer getUpdates() {
        return updates;
    }

    /**
     * @param updates
     */
    public void setUpdates(Integer updates) {
        this.updates = updates;
    }

    /**
     * @return deletes
     */
    public Integer getDeletes() {
        return deletes;
    }

    /**
     * @param deletes
     */
    public void setDeletes(Integer deletes) {
        this.deletes = deletes;
    }

    /**
     * @return schemaops
     */
    public Integer getSchemaops() {
        return schemaops;
    }

    /**
     * @param schemaops
     */
    public void setSchemaops(Integer schemaops) {
        this.schemaops = schemaops;
    }

    /**
     * @return orig_server_id
     */
    public Integer getOrigServerId() {
        return origServerId;
    }

    /**
     * @param origServerId
     */
    public void setOrigServerId(Integer origServerId) {
        this.origServerId = origServerId;
    }

    /**
     * @return orig_epoch
     */
    public Long getOrigEpoch() {
        return origEpoch;
    }

    /**
     * @param origEpoch
     */
    public void setOrigEpoch(Long origEpoch) {
        this.origEpoch = origEpoch;
    }

    /**
     * @return gci
     */
    public Integer getGci() {
        return gci;
    }

    /**
     * @param gci
     */
    public void setGci(Integer gci) {
        this.gci = gci;
    }

    /**
     * @return next_position
     */
    public Long getNextPosition() {
        return nextPosition;
    }

    /**
     * @param nextPosition
     */
    public void setNextPosition(Long nextPosition) {
        this.nextPosition = nextPosition;
    }

    /**
     * @return next_file
     */
    public String getNextFile() {
        return nextFile;
    }

    /**
     * @param nextFile
     */
    public void setNextFile(String nextFile) {
        this.nextFile = nextFile;
    }
}