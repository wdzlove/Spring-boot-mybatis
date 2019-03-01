package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "rwlock_instances")
public class RwlockInstances {
    @Column(name = "NAME")
    private String name;

    @Column(name = "OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Column(name = "WRITE_LOCKED_BY_THREAD_ID")
    private Long writeLockedByThreadId;

    @Column(name = "READ_LOCKED_BY_COUNT")
    private Integer readLockedByCount;

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
     * @return OBJECT_INSTANCE_BEGIN
     */
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    /**
     * @param objectInstanceBegin
     */
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    /**
     * @return WRITE_LOCKED_BY_THREAD_ID
     */
    public Long getWriteLockedByThreadId() {
        return writeLockedByThreadId;
    }

    /**
     * @param writeLockedByThreadId
     */
    public void setWriteLockedByThreadId(Long writeLockedByThreadId) {
        this.writeLockedByThreadId = writeLockedByThreadId;
    }

    /**
     * @return READ_LOCKED_BY_COUNT
     */
    public Integer getReadLockedByCount() {
        return readLockedByCount;
    }

    /**
     * @param readLockedByCount
     */
    public void setReadLockedByCount(Integer readLockedByCount) {
        this.readLockedByCount = readLockedByCount;
    }
}