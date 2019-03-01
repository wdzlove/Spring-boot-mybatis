package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "time_zone_leap_second")
public class TimeZoneLeapSecond {
    @Column(name = "Transition_time")
    private Long transitionTime;

    @Column(name = "Correction")
    private Integer correction;

    /**
     * @return Transition_time
     */
    public Long getTransitionTime() {
        return transitionTime;
    }

    /**
     * @param transitionTime
     */
    public void setTransitionTime(Long transitionTime) {
        this.transitionTime = transitionTime;
    }

    /**
     * @return Correction
     */
    public Integer getCorrection() {
        return correction;
    }

    /**
     * @param correction
     */
    public void setCorrection(Integer correction) {
        this.correction = correction;
    }
}