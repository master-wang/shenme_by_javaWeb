package com.acat.model;

import java.io.Serializable;

public class Yuangongfengcai implements Serializable {
    private Integer id;
    private String banzujianjie;
    private Integer fenzu;

    @Override
    public String toString() {
        return "Yuangongfengcai{" +
                "id=" + id +
                ", banzujianjie='" + banzujianjie + '\'' +
                ", fenzu=" + fenzu +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
