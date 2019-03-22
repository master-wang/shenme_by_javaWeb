package com.acat.vo;

import java.io.Serializable;

public class BanZuVo implements Serializable {
    private String biaoti;
    private String logoshiyi;
    private String banzujianjie;
    private Integer fenzu;

    public String getBiaoti() {
        return biaoti;
    }

    public void setBiaoti(String biaoti) {
        this.biaoti = biaoti;
    }

    public String getLogoshiyi() {
        return logoshiyi;
    }

    @Override
    public String toString() {
        return "BanZuVo{" +
                "biaoti='" + biaoti + '\'' +
                ", logoshiyi='" + logoshiyi + '\'' +
                ", banzujianjie='" + banzujianjie + '\'' +
                ", fenzu=" + fenzu +
                '}';
    }

    public void setLogoshiyi(String logoshiyi) {
        this.logoshiyi = logoshiyi;
    }

    public String getBanzujianjie() {
        return banzujianjie;
    }

    public void setBanzujianjie(String banzujianjie) {
        this.banzujianjie = banzujianjie;
    }

    public Integer getFenzu() {
        return fenzu;
    }

    public void setFenzu(Integer fenzu) {
        this.fenzu = fenzu;
    }
}
