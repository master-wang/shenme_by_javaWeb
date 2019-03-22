package com.acat.dao;

import com.acat.model.Jifen;
import com.acat.vo.*;


import java.util.List;

public interface IJifenDao {
    /**
     * @param jifen
     */
    void addJifen(Jifen jifen);
//
//    /**
//     *
//     * @param id
//     * @return
//     */
//    Integer getJifen(Integer id);

    /**
     * @param jifenleixingAndFenzuVo
     * @return
     */
    List<JifenVo> getJifenVo(JifenleixingAndFenzuVo jifenleixingAndFenzuVo);

    /**
     * 职工积分汇总
     *
     * @return
     */
    List<HuizongJifen> huizongJifen(JifenleixingAndFenzuVo jifenleixingAndFenzuVo);


    List<Riqi> getriqi(JifenleixingAndFenzuVo jifenleixingAndFenzuVo);

    /**
     *
     * @param xingmingAndLeixingVo
     * @return
     */
    String getRiqi(XingmingAndLeixingVo xingmingAndLeixingVo);

    /**
     *
     * @param fenzu
     * @return
     */
    String getXingming(Integer fenzu);

    /**
     *
     * @param jIfenleixingAndRiqiVo
     * @return
     */
    List<Jifen> getXinxiByLeixingAndRiqi(JIfenleixingAndRiqiVo jIfenleixingAndRiqiVo);

    /**
     *
     * @param jifenleixingAndStrVo
     * @return
     */
    List<String> getRiqiMohuchaxun(JifenleixingAndStrVo jifenleixingAndStrVo);
}
