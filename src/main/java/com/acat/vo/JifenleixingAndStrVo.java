package com.acat.vo;

public class JifenleixingAndStrVo {

    private static final long serialVersionUID = 1L;

    private Integer jifenleixing;
    private String str;

    public Integer getJifenleixing() {
        return jifenleixing;
    }

    public void setJifenleixing(Integer jifenleixing) {
        this.jifenleixing = jifenleixing;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "JifenleixingAndStrVo{" +
                "jifenleixing=" + jifenleixing +
                ", str='" + str + '\'' +
                '}';
    }
}
