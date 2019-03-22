package com.acat.service;

import com.acat.model.Denglu;
import com.acat.model.Renyuan;

import java.util.List;

public interface IDengluService {
    /**
     * 登陆接口
     *
     *
     */
    Denglu login(Denglu denglu);

    /**
     * 注册接口
     *
     * @param denglu
     */

    void update(Denglu denglu);

    /**
     *
     * @param yonghuming
     * @return
     */
    Integer getRenyuanZhiwei(String yonghuming);

    /**
     *
     * @param yonghuming
     * @return
     */
    String getMimaByYonghuming(String yonghuming);

    /**
     *
     * @param yonghuming
     * @return
     */
    Integer getRenyuanFenzu(String yonghuming);

    /**
     *
     * @param fenzu
     * @return
     */
    List<Renyuan> getFenzuRenyuan(int fenzu);


    /**
     *
     * @param yonghuming
     * @return
     */
    Renyuan getZuzhangInfo(String yonghuming);

    /**
     *
     * @param denglu
     */
    void updateFlag(Denglu denglu);

    /**
     *
     * @param yonghuming
     * @return
     */
    Integer getFlagByYonghuming(String yonghuming);

}
