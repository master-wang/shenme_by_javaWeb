package com.acat.vo;

import java.io.Serializable;

public class DengluVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String yonghuming;
    private String mima;

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
        return "DengluVo{" +
                "yonghuming='" + yonghuming + '\'' +
                ", mima='" + mima + '\'' +
                '}';
    }
}
