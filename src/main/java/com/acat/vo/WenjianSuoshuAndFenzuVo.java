package com.acat.vo;

import java.io.Serializable;

public class WenjianSuoshuAndFenzuVo implements Serializable {

    private static final long serialVersionUID = 1l;

    private String suoshufenlei;
    private Integer fenzu;

    public String getSuoshufenlei() {
        return suoshufenlei;
    }

    public void setSuoshufenlei(String suoshufenlei) {
        this.suoshufenlei = suoshufenlei;
    }

    public Integer getFenzu() {
        return fenzu;
    }

    public void setFenzu(Integer fenzu) {
        this.fenzu = fenzu;
    }

    @Override
    public String toString() {
        return "WenjianSuoshuAndFenzuVo{" +
                "suoshufenlei='" + suoshufenlei + '\'' +
                ", fenzu=" + fenzu +
                '}';
    }
}
