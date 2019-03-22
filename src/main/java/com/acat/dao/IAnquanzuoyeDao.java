package com.acat.dao;

import com.acat.model.Anquanzuoye;

import java.util.List;

public interface IAnquanzuoyeDao {

    /**
     *
     * @param anquanzuoye
     */
    void addAnquanzuoye(Anquanzuoye anquanzuoye);

    /**
     *
     * @param id
     */
    void deleteAnquanzuoye(Integer id);

    /**
     *
     * @param anquanzuoye
     */
    void updateAnquanzuoye(Anquanzuoye anquanzuoye);

    /**
     *
     * @param id
     * @return
     */
    Anquanzuoye getAnquanzuoyeById(Integer id);

    /**
     *
     * @return
     */
    List<Anquanzuoye> listAll();

    /**
     *
     * @param fenzu
     * @return
     */
    List<Anquanzuoye> getAnquanzuoyeByFenzu(Integer fenzu);
}
