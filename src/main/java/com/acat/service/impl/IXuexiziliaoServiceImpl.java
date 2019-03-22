package com.acat.service.impl;

import com.acat.dao.IXuexiziliaoDao;
import com.acat.model.Xuexiziliao;
import com.acat.service.IXuexiziliaoService;
import com.acat.vo.FenzuAndLeibieVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("xuexiziliaoService")
public class IXuexiziliaoServiceImpl implements IXuexiziliaoService {

    @Autowired
    private IXuexiziliaoDao xuexiziliaoDao;

    /**
     *
     * @param xuexiziliao
     */
    public void addXuexiziliao(Xuexiziliao xuexiziliao){
        xuexiziliaoDao.addXuexiziliao(xuexiziliao);
    }

    /**
     *
     * @param id
     */
    public void deleteXuexiziliao(Integer id){
        xuexiziliaoDao.deleteXuexiziliao(id);
    }

    /**
     *
     * @param xuexiziliao
     */
    public void updateXuexiziliao(Xuexiziliao xuexiziliao){
        xuexiziliaoDao.updateXuexiziliao(xuexiziliao);
    }

    /**
     *
     * @param id
     * @return
     */
    public Xuexiziliao getXuexiziliaoById(Integer id){
        return xuexiziliaoDao.getXuexiziliaoById(id);
    }

    /**
     *
     * @return
     */
    public List<Xuexiziliao> listAll(){
        return xuexiziliaoDao.listAll();
    }

    /**
     *
     * @param leibie
     * @return
     */
    public List<Xuexiziliao> getXuexizuiliaoByLeibie(String leibie){
        return xuexiziliaoDao.getXuexizuiliaoByLeibie(leibie);
    }

    /**
     *
     * @param fenzu
     * @return
     */
    public List<Xuexiziliao> getXuexizuiliaoByFenzu(Integer fenzu){
        return xuexiziliaoDao.getXuexizuiliaoByFenzu(fenzu);
    }

    /**
     *
     * @param fenzuAndLeibieVo
     * @return
     */
    public List<Xuexiziliao> getXuexiziliaoByVo(FenzuAndLeibieVo fenzuAndLeibieVo){
        return xuexiziliaoDao.getXuexiziliaoByVo(fenzuAndLeibieVo);
    }
}
