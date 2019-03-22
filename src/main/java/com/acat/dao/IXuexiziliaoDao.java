package com.acat.dao;

import com.acat.model.Xuexiziliao;
import com.acat.vo.FenzuAndLeibieVo;

import java.util.List;

public interface IXuexiziliaoDao {

    /**
     *
     * @param xuexiziliao
     */
    void addXuexiziliao(Xuexiziliao xuexiziliao);

    /**
     *
     * @param id
     */
    void deleteXuexiziliao(Integer id);

    /**
     *
     * @param xuexiziliao
     */
    void updateXuexiziliao(Xuexiziliao xuexiziliao);

    /**
     *
     * @param id
     * @return
     */
    Xuexiziliao getXuexiziliaoById(Integer id);

    /**
     *
     * @return
     */
    List<Xuexiziliao> listAll();

    /**
     *
     * @param leibie
     * @return
     */
    List<Xuexiziliao> getXuexizuiliaoByLeibie(String leibie);

    /**
     *
     * @param fenzu
     * @return
     */
    List<Xuexiziliao> getXuexizuiliaoByFenzu(Integer fenzu);

    /**
     *
     * @param fenzuAndLeibieVo
     * @return
     */
    List<Xuexiziliao> getXuexiziliaoByVo(FenzuAndLeibieVo fenzuAndLeibieVo);
}
