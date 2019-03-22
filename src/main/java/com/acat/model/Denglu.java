package com.acat.model;

import java.io.Serializable;

public class Denglu implements Serializable {
    private static final long serialVersionUID = 2L;

    private Integer id;
    private Integer flag;

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String mima;
    private String yonghuming;

    public String getYonghuming() {
        return yonghuming;
    }

    public void setYonghuming(String yonghuming) {
        this.yonghuming = yonghuming;
    }


    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    @Override
    public String toString() {
        return "Denglu{" +
                "id=" + id +
                ", flag=" + flag +
                ", mima='" + mima + '\'' +
                ", yonghuming='" + yonghuming + '\'' +
                '}';
    }
}
