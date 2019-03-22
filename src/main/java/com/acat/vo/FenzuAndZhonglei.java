package com.acat.vo;

import java.io.Serializable;

public class FenzuAndZhonglei implements Serializable {

    private Integer fenzu;
    private String zhonglei;

    public Integer getFenzu() {
        return fenzu;
    }

    public void setFenzu(Integer fenzu) {
        this.fenzu = fenzu;
    }

    public String getZhonglei() {
        return zhonglei;
    }

    public void setZhonglei(String zhonglei) {
        this.zhonglei = zhonglei;
    }
}
