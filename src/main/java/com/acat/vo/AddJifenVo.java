package com.acat.vo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;


public class AddJifenVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private int jifenleixing;
    private String riqi;
    private List<String> list;


    public int getJifenleixing() {
        return jifenleixing;
    }

    public void setJifenleixing(int jifenleixing) {
        this.jifenleixing = jifenleixing;
    }

    public String getRiqi() {
        return riqi;
    }

    public void setRiqi(String riqi) {
        this.riqi = riqi;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "AddJifenVo{" +
                "jifenleixing=" + jifenleixing +
                ", riqi='" + riqi + '\'' +
                ", list=" + list +
                '}';
    }
}
