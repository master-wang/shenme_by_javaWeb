package com.acat.vo;

import java.io.Serializable;

public class AnquanzuoyeVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String guanjianxiangmu;
    private String name;
    private String jiandanmiaoshu;
    private String wenjianleixing;
    private Integer fenzu;


    public String getGuanjianxiangmu() {
        return guanjianxiangmu;
    }

    public void setGuanjianxiangmu(String guanjianxiangmu) {
        this.guanjianxiangmu = guanjianxiangmu;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJiandanmiaoshu() {
        return jiandanmiaoshu;
    }

    public void setJiandanmiaoshu(String jiandanmiaoshu) {
        this.jiandanmiaoshu = jiandanmiaoshu;
    }

    public String getWenjianleixing() {
        return wenjianleixing;
    }

    public void setWenjianleixing(String wenjianleixing) {
        this.wenjianleixing = wenjianleixing;
    }

    public Integer getFenzu() {
        return fenzu;
    }

    public void setFenzu(Integer fenzu) {
        this.fenzu = fenzu;
    }

    @Override
    public String toString() {
        return "AnquanzuoyeVo{" +
                "id=" + id +
                ", guanjianxiangmu='" + guanjianxiangmu + '\'' +
                ", name='" + name + '\'' +
                ", jiandanmiaoshu='" + jiandanmiaoshu + '\'' +
                ", wenjianleixing='" + wenjianleixing + '\'' +
                ", fenzu=" + fenzu +
                '}';
    }
}
