package com.acat.model;

import java.io.Serializable;

public class Banzu implements Serializable {

    private static final long serialVersionUID = 2L;

    private Integer id;
    private String biaoti;
    private String banzulogo;
    private String logoshiyi;
    private String banzujianjie;
    private String zuzhijigou;
    private Integer fenzu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBiaoti() {
        return biaoti;
    }

    public void setBiaoti(String biaoti) {
        this.biaoti = biaoti;
    }

    public String getBanzulogo() {
        return banzulogo;
    }

    public void setBanzulogo(String banzulogo) {
        this.banzulogo = banzulogo;
    }

    public String getLogoshiyi() {
        return logoshiyi;
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

    public String getZuzhijigou() {
        return zuzhijigou;
    }

    public void setZuzhijigou(String zuzhijigou) {
        this.zuzhijigou = zuzhijigou;
    }


    public Integer getFenzu() {
        return fenzu;
    }

    public void setFenzu(Integer fenzu) {
        this.fenzu = fenzu;
    }

    @Override
    public String toString() {
        return "Banzu{" +
                "id=" + id +
                ", biaoti='" + biaoti + '\'' +
                ", banzulogo='" + banzulogo + '\'' +
                ", logoshiyi='" + logoshiyi + '\'' +
                ", banzujianjie='" + banzujianjie + '\'' +
                ", zuzhijigou='" + zuzhijigou + '\'' +

                ", fenzu=" + fenzu +
                '}';
    }
}
