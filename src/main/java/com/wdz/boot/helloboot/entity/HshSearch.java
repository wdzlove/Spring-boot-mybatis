package com.wdz.boot.helloboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hsh_search")
public class HshSearch {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 热搜名称
     */
    private String name;

    /**
     * 排序
     */
    private Integer priority;

    /**
     * 状态(0:显示1:隐藏)
     */
    private Integer state;

    private String column1;

    private Date column2;

    private Integer column3;

    /**
     * @return id
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
     * 获取热搜名称
     *
     * @return name - 热搜名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置热搜名称
     *
     * @param name 热搜名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取排序
     *
     * @return priority - 排序
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * 设置排序
     *
     * @param priority 排序
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * 获取状态(0:显示1:隐藏)
     *
     * @return state - 状态(0:显示1:隐藏)
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置状态(0:显示1:隐藏)
     *
     * @param state 状态(0:显示1:隐藏)
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return column1
     */
    public String getColumn1() {
        return column1;
    }

    /**
     * @param column1
     */
    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    /**
     * @return column2
     */
    public Date getColumn2() {
        return column2;
    }

    /**
     * @param column2
     */
    public void setColumn2(Date column2) {
        this.column2 = column2;
    }

    /**
     * @return column3
     */
    public Integer getColumn3() {
        return column3;
    }

    /**
     * @param column3
     */
    public void setColumn3(Integer column3) {
        this.column3 = column3;
    }
}