package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "host_summary_by_stages")
public class HostSummaryByStages {
    private String host;

    @Column(name = "event_name")
    private String eventName;

    private Long total;

    @Column(name = "total_latency")
    private String totalLatency;

    @Column(name = "avg_latency")
    private String avgLatency;

    /**
     * @return host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return event_name
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
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    /**
     * @param total
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * @return total_latency
     */
    public String getTotalLatency() {
        return totalLatency;
    }

    /**
     * @param totalLatency
     */
    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    /**
     * @return avg_latency
     */
    public String getAvgLatency() {
        return avgLatency;
    }

    /**
     * @param avgLatency
     */
    public void setAvgLatency(String avgLatency) {
        this.avgLatency = avgLatency;
    }
}