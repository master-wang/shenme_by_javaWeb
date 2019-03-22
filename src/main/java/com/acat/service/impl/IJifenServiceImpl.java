package com.acat.service.impl;

import com.acat.dao.IJifenDao;
import com.acat.model.Jifen;
import com.acat.service.IJifenService;
import com.acat.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("jifenService")
public class IJifenServiceImpl implements IJifenService {

    @Autowired
    private IJifenDao iJifenDao;

    public void addJifen(Jifen jifen) {
        iJifenDao.addJifen(jifen);
    }

    @Override
    public List<HuizongJifen> huizongJifen(JifenleixingAndFenzuVo jifenleixingAndFenzuVo) {
        return iJifenDao.huizongJifen( jifenleixingAndFenzuVo);
    }

    /**
     * @param jifenleixingAndFenzuVo
     * @return
     */
    public  List<JifenVo> getJifenVo(JifenleixingAndFenzuVo jifenleixingAndFenzuVo){




       return iJifenDao.getJifenVo(jifenleixingAndFenzuVo);
    }


    public String getRiqi(XingmingAndLeixingVo xingmingAndLeixingVo){
        return iJifenDao.getRiqi(xingmingAndLeixingVo);
    }
    /**
     *
     * @param fenzu
     * @return
     */
    public String getXingming(Integer fenzu){
        return iJifenDao.getXingming(fenzu);
    }

    /**
     *
     * @param jIfenleixingAndRiqiVo
     * @return
     */
    public List<Jifen> getXinxiByLeixingAndRiqi(JIfenleixingAndRiqiVo jIfenleixingAndRiqiVo){
        return iJifenDao.getXinxiByLeixingAndRiqi(jIfenleixingAndRiqiVo);
    }

    /**
     *
     * @param jifenleixingAndStrVo
     * @return
     */
    public List<String> getRiqiMohuchaxun(JifenleixingAndStrVo jifenleixingAndStrVo){
        return iJifenDao.getRiqiMohuchaxun(jifenleixingAndStrVo);
    }
}
