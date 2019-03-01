package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "INNODB_FT_DELETED")
public class InnodbFtDeleted {
    @Column(name = "DOC_ID")
    private Long docId;

    /**
     * @return DOC_ID
     */
    public Long getDocId() {
        return docId;
    }

    /**
     * @param docId
     */
    public void setDocId(Long docId) {
        this.docId = docId;
    }
}