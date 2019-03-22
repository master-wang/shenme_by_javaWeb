package com.acat.vo;

public class LogoAndJigou {
    private String banzulogo;
    private String zuzhijigou;

    public String getBanzulogo() {
        return banzulogo;
    }

    public void setBanzulogo(String banzulogo) {
        this.banzulogo = banzulogo;
    }

    public String getZuzhijigou() {
        return zuzhijigou;
    }

    @Override
    public String toString() {
        return "LogoAndJigou{" +
                "banzulogo='" + banzulogo + '\'' +
                ", zuzhijigou='" + zuzhijigou + '\'' +
                '}';
    }

    public void setZuzhijigou(String zuzhijigou) {
        this.zuzhijigou = zuzhijigou;
    }
}
