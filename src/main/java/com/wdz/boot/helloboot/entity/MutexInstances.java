package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "mutex_instances")
public class MutexInstances {
    @Column(name = "NAME")
    private String name;

    @Column(name = "OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Column(name = "LOCKED_BY_THREAD_ID")
    private Long lockedByThreadId;

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
     * @return LOCKED_BY_THREAD_ID
     */
    public Long getLockedByThreadId() {
        return lockedByThreadId;
    }

    /**
     * @param lockedByThreadId
     */
    public void setLockedByThreadId(Long lockedByThreadId) {
        this.lockedByThreadId = lockedByThreadId;
    }
}