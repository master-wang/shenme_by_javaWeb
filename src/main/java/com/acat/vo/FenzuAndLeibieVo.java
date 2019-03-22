package com.acat.vo;

import java.io.Serializable;

public class FenzuAndLeibieVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer fenzu;
    private String leibie;

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
        return "FenzuAndLeibieVo{" +
                "fenzu=" + fenzu +
                ", leibie='" + leibie + '\'' +
                '}';
    }
}
