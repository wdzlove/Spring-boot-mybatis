package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "setup_instruments")
public class SetupInstruments {
    @Column(name = "NAME")
    private String name;

    @Column(name = "ENABLED")
    private String enabled;

    @Column(name = "TIMED")
    private String timed;

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
     * @return ENABLED
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * @param enabled
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    /**
     * @return TIMED
     */
    public String getTimed() {
        return timed;
    }

    /**
     * @param timed
     */
    public void setTimed(String timed) {
        this.timed = timed;
    }
}