package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "setup_timers")
public class SetupTimers {
    @Column(name = "NAME")
    private String name;

    @Column(name = "TIMER_NAME")
    private String timerName;

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
     * @return TIMER_NAME
     */
    public String getTimerName() {
        return timerName;
    }

    /**
     * @param timerName
     */
    public void setTimerName(String timerName) {
        this.timerName = timerName;
    }
}