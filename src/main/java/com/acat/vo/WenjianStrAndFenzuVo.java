package com.acat.vo;

import java.io.Serializable;

public class WenjianStrAndFenzuVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String str;
    private Integer fenzu;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Integer getFenzu() {
        return fenzu;
    }

    public void setFenzu(Integer fenzu) {
        this.fenzu = fenzu;
    }

    @Override
    public String toString() {
        return "WenjianStrAndFenzuVo{" +
                "str='" + str + '\'' +
                ", fenzu=" + fenzu +
                '}';
    }
}
