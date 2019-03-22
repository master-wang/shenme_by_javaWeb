package com.acat.model;

import java.io.Serializable;

public class Xuexiziliao implements Serializable {

    private static final long serialVersionUID =1L;

    private Integer id;
    private String wenjianmingcheng;
    private String fabushijian;
    private String faburen;
    private Integer fenzu;
    private String leibie;

    public String getLeibie() {
        return leibie;
    }

    public void setLeibie(String leibie) {
        this.leibie = leibie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWenjianmingcheng() {
        return wenjianmingcheng;
    }

    public void setWenjianmingcheng(String wenjianmingcheng) {
        this.wenjianmingcheng = wenjianmingcheng;
    }

    public String getFabushijian() {
        return fabushijian;
    }

    public void setFabushijian(String fabushijian) {
        this.fabushijian = fabushijian;
    }



    public Integer getFenzu() {
        return fenzu;
    }


    public void setFenzu(Integer fenzu) {
        this.fenzu = fenzu;
    }

    public String getFaburen() {
        return faburen;
    }

    public void setFaburen(String faburen) {
        this.faburen = faburen;
    }

    @Override
    public String toString() {
        return "Xuexiziliao{" +
                "id=" + id +
                ", wenjianmingcheng='" + wenjianmingcheng + '\'' +
                ", fabushijian='" + fabushijian + '\'' +
                ", faburen='" + faburen + '\'' +
                ", fenzu=" + fenzu +
                ", leibie='" + leibie + '\'' +
                '}';
    }
}
