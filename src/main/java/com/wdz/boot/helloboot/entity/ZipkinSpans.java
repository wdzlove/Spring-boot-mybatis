package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "zipkin_spans")
public class ZipkinSpans {
    /**
     * If non zero, this means the trace uses 128 bit traceIds instead of 64 bit
     */
    @Column(name = "trace_id_high")
    private Long traceIdHigh;

    @Column(name = "trace_id")
    private Long traceId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "parent_id")
    private Long parentId;

    private Boolean debug;

    /**
     * Span.timestamp(): epoch micros used for endTs query and to implement TTL
     */
    @Column(name = "start_ts")
    private Long startTs;

    /**
     * Span.duration(): micros used for minDuration and maxDuration query
     */
    private Long duration;

    /**
     * 获取If non zero, this means the trace uses 128 bit traceIds instead of 64 bit
     *
     * @return trace_id_high - If non zero, this means the trace uses 128 bit traceIds instead of 64 bit
     */
    public Long getTraceIdHigh() {
        return traceIdHigh;
    }

    /**
     * 设置If non zero, this means the trace uses 128 bit traceIds instead of 64 bit
     *
     * @param traceIdHigh If non zero, this means the trace uses 128 bit traceIds instead of 64 bit
     */
    public void setTraceIdHigh(Long traceIdHigh) {
        this.traceIdHigh = traceIdHigh;
    }

    /**
     * @return trace_id
     */
    public Long getTraceId() {
        return traceId;
    }

    /**
     * @param traceId
     */
    public void setTraceId(Long traceId) {
        this.traceId = traceId;
    }

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
     * @return name
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
     * @return parent_id
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
     * @return debug
     */
    public Boolean getDebug() {
        return debug;
    }

    /**
     * @param debug
     */
    public void setDebug(Boolean debug) {
        this.debug = debug;
    }

    /**
     * 获取Span.timestamp(): epoch micros used for endTs query and to implement TTL
     *
     * @return start_ts - Span.timestamp(): epoch micros used for endTs query and to implement TTL
     */
    public Long getStartTs() {
        return startTs;
    }

    /**
     * 设置Span.timestamp(): epoch micros used for endTs query and to implement TTL
     *
     * @param startTs Span.timestamp(): epoch micros used for endTs query and to implement TTL
     */
    public void setStartTs(Long startTs) {
        this.startTs = startTs;
    }

    /**
     * 获取Span.duration(): micros used for minDuration and maxDuration query
     *
     * @return duration - Span.duration(): micros used for minDuration and maxDuration query
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * 设置Span.duration(): micros used for minDuration and maxDuration query
     *
     * @param duration Span.duration(): micros used for minDuration and maxDuration query
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }
}