package com.acat.model;

import java.io.Serializable;

public class Wenjian implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String wenjianmingcheng;
    private String suoshufenlei;
    private String fabushijian;
    private String faburen;
    private Integer fenzu;


    public String getWenjianmingcheng() {
        return wenjianmingcheng;
    }

    public void setWenjianmingcheng(String wenjianmingcheng) {
        this.wenjianmingcheng = wenjianmingcheng;
    }

    public String getSuoshufenlei() {
        return suoshufenlei;
    }

    public void setSuoshufenlei(String suoshufenlei) {
        this.suoshufenlei = suoshufenlei;
    }

    public String getFabushijian() {
        return fabushijian;
    }

    public void setFabushijian(String fabushijian) {
        this.fabushijian = fabushijian;
    }

    public String getFaburen() {
        return faburen;
    }

    public void setFaburen(String faburen) {
        this.faburen = faburen;
    }

    public Integer getFenzu() {
        return fenzu;
    }

    public void setFenzu(Integer fenzu) {
        this.fenzu = fenzu;
    }

    @Override
    public String toString() {
        return "Wenjian{" +
                "id=" + id +
                ", wenjianmingcheng='" + wenjianmingcheng + '\'' +
                ", suoshufenlei='" + suoshufenlei + '\'' +
                ", fabushjjian='" + fabushijian + '\'' +
                ", faburen='" + faburen + '\'' +
                ", fenzu=" + fenzu +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
