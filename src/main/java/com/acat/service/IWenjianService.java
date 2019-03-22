package com.acat.service;

import com.acat.model.Wenjian;
import com.acat.vo.WenjianStrAndFenzuVo;
import com.acat.vo.WenjianSuoshuAndFenzuVo;

import java.util.List;

public interface IWenjianService {

    /**
     *
     * @param wenjian
     */
    void addWenjian(Wenjian wenjian);

    /**
     *
     */
    void deleteWenjian(Integer id);

    /**
     *
     */
    void updateWenjian(Wenjian wenjian);

    /**
     *
     * @param id
     * @return
     */
    Wenjian getWenjianById(Integer id);

    /**
     *
     * @return
     */
    List<Wenjian> listAll();

    /**
     *
     * @param wenjianSuoshuAndFenzuVo
     * @return
     */
    List<Wenjian> getListWenjianBySuoshufenlei(WenjianSuoshuAndFenzuVo wenjianSuoshuAndFenzuVo);


    /**
     *
     * @param wenjianStrAndFenzuVo
     * @return
     */
    List<Wenjian> getListWenjianByWenjianmingMohuchaxun(WenjianStrAndFenzuVo wenjianStrAndFenzuVo);


    /**
     *
     * @param fenzu
     * @return
     */
    List<Wenjian> getListWenjianByFenzu(Integer fenzu);
}
