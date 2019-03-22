package com.acat.vo;

public class JIfenleixingAndRiqiVo {

    private static final long serialVersionUID = 1L;

    private Integer jifenleixing;
    private String riqi;
    private Integer fenzu;

    public Integer getFenzu() {
        return fenzu;
    }

    public void setFenzu(Integer fenzu) {
        this.fenzu = fenzu;
    }

    public Integer getJifenleixing() {
        return jifenleixing;
    }

    public void setJifenleixing(Integer jifenleixing) {
        this.jifenleixing = jifenleixing;
    }

    public String getRiqi() {
        return riqi;
    }

    public void setRiqi(String riqi) {
        this.riqi = riqi;
    }

    @Override
    public String toString() {
        return "JIfenleixingAndRiqiVo{" +
                "jifenleixing=" + jifenleixing +
                ", riqi='" + riqi + '\'' +
                ", fenzu=" + fenzu +
                '}';
    }
}
