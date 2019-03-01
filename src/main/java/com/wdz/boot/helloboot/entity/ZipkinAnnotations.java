package com.wdz.boot.helloboot.entity;

import javax.persistence.*;

@Table(name = "zipkin_annotations")
public class ZipkinAnnotations {
    /**
     * If non zero, this means the trace uses 128 bit traceIds instead of 64 bit
     */
    @Column(name = "trace_id_high")
    private Long traceIdHigh;

    /**
     * coincides with zipkin_spans.trace_id
     */
    @Column(name = "trace_id")
    private Long traceId;

    /**
     * coincides with zipkin_spans.id
     */
    @Column(name = "span_id")
    private Long spanId;

    /**
     * BinaryAnnotation.key or Annotation.value if type == -1
     */
    @Column(name = "a_key")
    private String aKey;

    /**
     * BinaryAnnotation.type() or -1 if Annotation
     */
    @Column(name = "a_type")
    private Integer aType;

    /**
     * Used to implement TTL; Annotation.timestamp or zipkin_spans.timestamp
     */
    @Column(name = "a_timestamp")
    private Long aTimestamp;

    /**
     * Null when Binary/Annotation.endpoint is null
     */
    @Column(name = "endpoint_ipv4")
    private Integer endpointIpv4;

    /**
     * Null when Binary/Annotation.endpoint is null
     */
    @Column(name = "endpoint_port")
    private Short endpointPort;

    /**
     * Null when Binary/Annotation.endpoint is null
     */
    @Column(name = "endpoint_service_name")
    private String endpointServiceName;

    /**
     * BinaryAnnotation.value(), which must be smaller than 64KB
     */
    @Column(name = "a_value")
    private byte[] aValue;

    /**
     * Null when Binary/Annotation.endpoint is null, or no IPv6 address
     */
    @Column(name = "endpoint_ipv6")
    private byte[] endpointIpv6;

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
     * 获取coincides with zipkin_spans.trace_id
     *
     * @return trace_id - coincides with zipkin_spans.trace_id
     */
    public Long getTraceId() {
        return traceId;
    }

    /**
     * 设置coincides with zipkin_spans.trace_id
     *
     * @param traceId coincides with zipkin_spans.trace_id
     */
    public void setTraceId(Long traceId) {
        this.traceId = traceId;
    }

    /**
     * 获取coincides with zipkin_spans.id
     *
     * @return span_id - coincides with zipkin_spans.id
     */
    public Long getSpanId() {
        return spanId;
    }

    /**
     * 设置coincides with zipkin_spans.id
     *
     * @param spanId coincides with zipkin_spans.id
     */
    public void setSpanId(Long spanId) {
        this.spanId = spanId;
    }

    /**
     * 获取BinaryAnnotation.key or Annotation.value if type == -1
     *
     * @return a_key - BinaryAnnotation.key or Annotation.value if type == -1
     */
    public String getaKey() {
        return aKey;
    }

    /**
     * 设置BinaryAnnotation.key or Annotation.value if type == -1
     *
     * @param aKey BinaryAnnotation.key or Annotation.value if type == -1
     */
    public void setaKey(String aKey) {
        this.aKey = aKey;
    }

    /**
     * 获取BinaryAnnotation.type() or -1 if Annotation
     *
     * @return a_type - BinaryAnnotation.type() or -1 if Annotation
     */
    public Integer getaType() {
        return aType;
    }

    /**
     * 设置BinaryAnnotation.type() or -1 if Annotation
     *
     * @param aType BinaryAnnotation.type() or -1 if Annotation
     */
    public void setaType(Integer aType) {
        this.aType = aType;
    }

    /**
     * 获取Used to implement TTL; Annotation.timestamp or zipkin_spans.timestamp
     *
     * @return a_timestamp - Used to implement TTL; Annotation.timestamp or zipkin_spans.timestamp
     */
    public Long getaTimestamp() {
        return aTimestamp;
    }

    /**
     * 设置Used to implement TTL; Annotation.timestamp or zipkin_spans.timestamp
     *
     * @param aTimestamp Used to implement TTL; Annotation.timestamp or zipkin_spans.timestamp
     */
    public void setaTimestamp(Long aTimestamp) {
        this.aTimestamp = aTimestamp;
    }

    /**
     * 获取Null when Binary/Annotation.endpoint is null
     *
     * @return endpoint_ipv4 - Null when Binary/Annotation.endpoint is null
     */
    public Integer getEndpointIpv4() {
        return endpointIpv4;
    }

    /**
     * 设置Null when Binary/Annotation.endpoint is null
     *
     * @param endpointIpv4 Null when Binary/Annotation.endpoint is null
     */
    public void setEndpointIpv4(Integer endpointIpv4) {
        this.endpointIpv4 = endpointIpv4;
    }

    /**
     * 获取Null when Binary/Annotation.endpoint is null
     *
     * @return endpoint_port - Null when Binary/Annotation.endpoint is null
     */
    public Short getEndpointPort() {
        return endpointPort;
    }

    /**
     * 设置Null when Binary/Annotation.endpoint is null
     *
     * @param endpointPort Null when Binary/Annotation.endpoint is null
     */
    public void setEndpointPort(Short endpointPort) {
        this.endpointPort = endpointPort;
    }

    /**
     * 获取Null when Binary/Annotation.endpoint is null
     *
     * @return endpoint_service_name - Null when Binary/Annotation.endpoint is null
     */
    public String getEndpointServiceName() {
        return endpointServiceName;
    }

    /**
     * 设置Null when Binary/Annotation.endpoint is null
     *
     * @param endpointServiceName Null when Binary/Annotation.endpoint is null
     */
    public void setEndpointServiceName(String endpointServiceName) {
        this.endpointServiceName = endpointServiceName;
    }

    /**
     * 获取BinaryAnnotation.value(), which must be smaller than 64KB
     *
     * @return a_value - BinaryAnnotation.value(), which must be smaller than 64KB
     */
    public byte[] getaValue() {
        return aValue;
    }

    /**
     * 设置BinaryAnnotation.value(), which must be smaller than 64KB
     *
     * @param aValue BinaryAnnotation.value(), which must be smaller than 64KB
     */
    public void setaValue(byte[] aValue) {
        this.aValue = aValue;
    }

    /**
     * 获取Null when Binary/Annotation.endpoint is null, or no IPv6 address
     *
     * @return endpoint_ipv6 - Null when Binary/Annotation.endpoint is null, or no IPv6 address
     */
    public byte[] getEndpointIpv6() {
        return endpointIpv6;
    }

    /**
     * 设置Null when Binary/Annotation.endpoint is null, or no IPv6 address
     *
     * @param endpointIpv6 Null when Binary/Annotation.endpoint is null, or no IPv6 address
     */
    public void setEndpointIpv6(byte[] endpointIpv6) {
        this.endpointIpv6 = endpointIpv6;
    }
}