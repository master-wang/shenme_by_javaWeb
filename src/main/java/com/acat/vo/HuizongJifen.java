package com.acat.vo;

import java.io.Serializable;

public class HuizongJifen implements Serializable {
    private String xingming;
    private Integer gerenfenzhihuizong;
    private Integer fenzu;

    @Override
    public String toString() {
        return "HuizongJifen{" +
                "xingming='" + xingming + '\'' +
                ", gerenfenzhihuizong=" + gerenfenzhihuizong +
                ", fenzu=" + fenzu +
                '}';
    }

    public Integer getFenzu() {
        return fenzu;
    }

    public void setFenzu(Integer fenzu) {
        this.fenzu = fenzu;
    }

    public Integer getGerenfenzhihuizong() {
        return gerenfenzhihuizong;
    }

    public void setGerenfenzhihuizong(Integer gerenfenzhihuizong) {
        this.gerenfenzhihuizong = gerenfenzhihuizong;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }


}
