package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "ha_health_check")
public class HaHealthCheck {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

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
     * @return type
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
}