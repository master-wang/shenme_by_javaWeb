package com.acat.vo;

public class JifenVo {

    private static final long serialVersionUID = 1L;

    private String xingming;
    private String riqi;
    private Integer jifen;
    private String jifenleixing;

    @Override
    public String toString() {
        return "JifenVo{" +
                "xingming='" + xingming + '\'' +
                ", riqi='" + riqi + '\'' +
                ", jifen='" + jifen + '\'' +
                ", jifenleixing='" + jifenleixing + '\'' +
                '}';
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

    public String getJifenleixing() {
        return jifenleixing;
    }

    public void setJifenleixing(String jifenleixing) {
        this.jifenleixing = jifenleixing;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

}
