package com.acat.service.impl;

import com.acat.dao.IAnquanzuoyeDao;
import com.acat.model.Anquanzuoye;
import com.acat.service.IAnquanzuoyeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("anquanzuoyeServic")
public class IAnquanzuoyeServiceImpl implements IAnquanzuoyeService {

    @Autowired
    private IAnquanzuoyeDao anquanzuoyeDao;

    /**
     *
     * @param anquanzuoye
     */
    public void addAnquanzuoye(Anquanzuoye anquanzuoye){
        anquanzuoyeDao.addAnquanzuoye(anquanzuoye);
    }

    /**
     *
     * @param id
     */
    public void deleteAnquanzuoye(Integer id){
        anquanzuoyeDao.deleteAnquanzuoye(id);
    }

    /**
     *
     * @param anquanzuoye
     */
    public void updateAnquanzuoye(Anquanzuoye anquanzuoye){
        anquanzuoyeDao.updateAnquanzuoye(anquanzuoye);
    }

    /**
     *
     * @param id
     * @return
     */
    public Anquanzuoye getAnquanzuoyeById(Integer id){
        return anquanzuoyeDao.getAnquanzuoyeById(id);
    }

    /**
     *
     * @return
     */
    public List<Anquanzuoye> listAll(){
        return anquanzuoyeDao.listAll();
    }

    /**
     *
     * @param fenzu
     * @return
     */
    public List<Anquanzuoye> getAnquanzuoyeByFenzu(Integer fenzu){
        return anquanzuoyeDao.getAnquanzuoyeByFenzu(fenzu);
    }
}
