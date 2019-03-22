package com.acat.vo;

import java.io.Serializable;

public class XingmingAndLeixingVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer jifenleixing;
    private String xingming;

    public Integer getJifenleixing() {
        return jifenleixing;
    }

    public void setJifenleixing(Integer jifenleixing) {
        this.jifenleixing = jifenleixing;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    @Override
    public String toString() {
        return "XingmingAndLeixingVo{" +
                "jifenleixing=" + jifenleixing +
                ", xingming='" + xingming + '\'' +
                '}';
    }
}
