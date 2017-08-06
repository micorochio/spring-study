package com.zing.trace.entities;

import com.alibaba.fastjson.JSON;

import java.util.Date;
import java.util.List;

public class TracedProduct {
    private long tId;    // '溯源ID',
    private String qrcode;//'二维码',
    private String brhId;// '机构号',
    private Date traceTime;// '扫码时间',
    private int nodeType; // '节点类型，1生产，2仓储，3运输，4分销，5零售'

    private List<ProductAttr> attrs;//属性

    public long gettId() {
        return tId;
    }

    public void settId(long tId) {
        this.tId = tId;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getBrhId() {
        return brhId;
    }

    public void setBrhId(String brhId) {
        this.brhId = brhId;
    }

    public Date getTraceTime() {
        return traceTime;
    }

    public void setTraceTime(Date traceTime) {
        this.traceTime = traceTime;
    }

    public int getNodeType() {
        return nodeType;
    }

    public void setNodeType(int nodeType) {
        this.nodeType = nodeType;
    }

    public List<ProductAttr> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<ProductAttr> attrs) {
        this.attrs = attrs;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
