package com.acat.vo;

import java.io.Serializable;

public class UpdateMimaVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String yonghuming;
    private String mima;
    private String newMima;


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

    public String getNewMima() {
        return newMima;
    }

    public void setNewMima(String newMima) {
        this.newMima = newMima;
    }

    @Override
    public String toString() {
        return "UpdateMimaVo{" +
                "yonghuming='" + yonghuming + '\'' +
                ", mima='" + mima + '\'' +
                ", newMima='" + newMima + '\'' +
                '}';
    }
}
