package com.zing.trace.entities;

import com.alibaba.fastjson.JSON;

public class ProductAttr {
    private long arrId;// '属性ID',
    private long tId;//'溯源ID',
    private String aCode;//'属性编号',
    private String aValue;//'属性值'

    public long getArrId() {
        return arrId;
    }

    public void setArrId(long arrId) {
        this.arrId = arrId;
    }

    public long gettId() {
        return tId;
    }

    public void settId(long tId) {
        this.tId = tId;
    }

    public String getaCode() {
        return aCode;
    }

    public void setaCode(String aCode) {
        this.aCode = aCode;
    }

    public String getaValue() {
        return aValue;
    }

    public void setaValue(String aValue) {
        this.aValue = aValue;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
