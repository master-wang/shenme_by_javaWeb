package com.acat.service.impl;

import com.acat.dao.IWenjianDao;
import com.acat.model.Wenjian;
import com.acat.service.IWenjianService;
import com.acat.vo.WenjianStrAndFenzuVo;
import com.acat.vo.WenjianSuoshuAndFenzuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("WenjianService")
public class IWenjianServiceImpl implements IWenjianService {


    @Autowired
    private IWenjianDao wenjianDao;

    /**
     *
     * @param wenjian
     */
    public void addWenjian(Wenjian wenjian){
        wenjianDao.addWenjian(wenjian);
    }

    /**
     *
     */
    public void deleteWenjian(Integer id){
        wenjianDao.deleteWenjian(id);
    }

    /**
     *
     */
    public void updateWenjian(Wenjian wenjian){
        wenjianDao.updateWenjian(wenjian);
    }

    /**
     *
     * @param id
     * @return
     */
    public Wenjian getWenjianById(Integer id){
        return wenjianDao.getWenjianById(id);
    }

    /**
     *
     * @return
     */
    public List<Wenjian> listAll(){
        return wenjianDao.listAll();
    }

    /**
     *
     * @param str
     * @return
     */
    /**
     *
     * @param wenjianSuoshuAndFenzuVo
     * @return
     */
    public List<Wenjian> getListWenjianBySuoshufenlei(WenjianSuoshuAndFenzuVo wenjianSuoshuAndFenzuVo){
        return wenjianDao.getListWenjianBySuoshufenlei(wenjianSuoshuAndFenzuVo);
    }

    /**
     *
     * @param wenjianStrAndFenzuVo
     * @return
     */
    public List<Wenjian> getListWenjianByWenjianmingMohuchaxun(WenjianStrAndFenzuVo wenjianStrAndFenzuVo){
        return wenjianDao.getListWenjianByWenjianmingMohuchaxun(wenjianStrAndFenzuVo);
    }


    /**
     *
     * @param fenzu
     * @return
     */
    public List<Wenjian> getListWenjianByFenzu(Integer fenzu){
        return wenjianDao.getListWenjianByFenzu(fenzu);
    }
}
