package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "events_waits_summary_by_instance")
public class EventsWaitsSummaryByInstance {
    @Column(name = "EVENT_NAME")
    private String eventName;

    @Column(name = "OBJECT_INSTANCE_BEGIN")
    private Long objectInstanceBegin;

    @Column(name = "COUNT_STAR")
    private Long countStar;

    @Column(name = "SUM_TIMER_WAIT")
    private Long sumTimerWait;

    @Column(name = "MIN_TIMER_WAIT")
    private Long minTimerWait;

    @Column(name = "AVG_TIMER_WAIT")
    private Long avgTimerWait;

    @Column(name = "MAX_TIMER_WAIT")
    private Long maxTimerWait;

    /**
     * @return EVENT_NAME
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @param eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
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
     * @return COUNT_STAR
     */
    public Long getCountStar() {
        return countStar;
    }

    /**
     * @param countStar
     */
    public void setCountStar(Long countStar) {
        this.countStar = countStar;
    }

    /**
     * @return SUM_TIMER_WAIT
     */
    public Long getSumTimerWait() {
        return sumTimerWait;
    }

    /**
     * @param sumTimerWait
     */
    public void setSumTimerWait(Long sumTimerWait) {
        this.sumTimerWait = sumTimerWait;
    }

    /**
     * @return MIN_TIMER_WAIT
     */
    public Long getMinTimerWait() {
        return minTimerWait;
    }

    /**
     * @param minTimerWait
     */
    public void setMinTimerWait(Long minTimerWait) {
        this.minTimerWait = minTimerWait;
    }

    /**
     * @return AVG_TIMER_WAIT
     */
    public Long getAvgTimerWait() {
        return avgTimerWait;
    }

    /**
     * @param avgTimerWait
     */
    public void setAvgTimerWait(Long avgTimerWait) {
        this.avgTimerWait = avgTimerWait;
    }

    /**
     * @return MAX_TIMER_WAIT
     */
    public Long getMaxTimerWait() {
        return maxTimerWait;
    }

    /**
     * @param maxTimerWait
     */
    public void setMaxTimerWait(Long maxTimerWait) {
        this.maxTimerWait = maxTimerWait;
    }
}