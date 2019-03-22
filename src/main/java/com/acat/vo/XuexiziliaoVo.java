package com.acat.vo;

import java.io.Serializable;

public class XuexiziliaoVo implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String fabushijian;
    private String faburen;
    private Integer fenzu;
    private String leibie;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getLeibie() {
        return leibie;
    }

    public void setLeibie(String leibie) {
        this.leibie = leibie;
    }

    @Override
    public String toString() {
        return "XuexiziliaoVo{" +
                "id=" + id +
                ", fabushijian='" + fabushijian + '\'' +
                ", faburen='" + faburen + '\'' +
                ", fenzu=" + fenzu +
                ", leibie='" + leibie + '\'' +
                '}';
    }
}
