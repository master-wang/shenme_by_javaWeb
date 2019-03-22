package com.acat.model;

import java.io.Serializable;

public class Jifen implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String riqi;

    private Integer jifen;
    private Integer jifenleixing;
    private String xingming;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRiqi() {
        return riqi;
    }

    public void setRiqi(String riqi) {
        this.riqi = riqi;
    }



    public Integer getJifen() {
        return jifen;
    }

    public void setJifen(Integer jifen) {
        this.jifen = jifen;
    }

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
        return "Jifen{" +
                "id=" + id +
                ", riqi='" + riqi + '\'' +

                ", jifen=" + jifen +
                ", jifenleixing=" + jifenleixing +
                ", xingming='" + xingming + '\'' +
                '}';
    }
}

