package com.acat.vo;

import java.io.Serializable;

public class JifenleixingAndFenzuVo implements Serializable {
    private Integer jifenleixing;
    private Integer fenzu;

    @Override
    public String toString() {
        return "JifenleixingAndFenzuVo{" +
                "jifenleixing=" + jifenleixing +
                ", fenzu=" + fenzu +
                '}';
    }

    public Integer getJifenleixing() {
        return jifenleixing;
    }

    public void setJifenleixing(Integer jifenleixing) {
        this.jifenleixing = jifenleixing;
    }

    public Integer getFenzu() {
        return fenzu;
    }

    public void setFenzu(Integer fenzu) {
        this.fenzu = fenzu;
    }
}
