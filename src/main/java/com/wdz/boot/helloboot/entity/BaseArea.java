package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "base_area")
public class BaseArea {
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TREE_PATH")
    private String treePath;

    @Column(name = "PARENT_ID")
    private Long parentId;

    @Column(name = "FULL_NAME")
    private String fullName;

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
     * @return TREE_PATH
     */
    public String getTreePath() {
        return treePath;
    }

    /**
     * @param treePath
     */
    public void setTreePath(String treePath) {
        this.treePath = treePath;
    }

    /**
     * @return PARENT_ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * @return FULL_NAME
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}