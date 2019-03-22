package com.acat.vo;

import java.io.Serializable;

public class ZhiAndIdVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer zhiwei;
    private Integer id;
    private Integer fenzu;

    @Override
    public String toString() {
        return
                zhiwei +
                "," + id +
                "," + fenzu;
    }

    public Integer getZhiwei() {
        return zhiwei;
    }

    public void setZhiwei(Integer zhiwei) {
        this.zhiwei = zhiwei;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFenzu() {
        return fenzu;
    }

    public void setFenzu(Integer fenzu) {
        this.fenzu = fenzu;
    }
}
