package com.acat.service.impl;

import com.acat.dao.Tpm_6sDao;
import com.acat.model.Tmp_6s;
import com.acat.service.Tmp_6sService;
import com.acat.vo.FenzuAndZhonglei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tmp_6sService")
public class Tmp_6sServiceImpl implements Tmp_6sService {
   @Autowired
    private Tpm_6sDao tmp_6sDao;
   //add
    @Override
    public void addTmp_6s(Tmp_6s tmp_6s){

        tmp_6sDao.addTmp_6s(tmp_6s);
    }
    //delete
    @Override
    public void deleteTmp_6sById(int ID){
        tmp_6sDao.deleteTmp_6sById(ID);
    }
    //update
    @Override
    public  void updateTmp_6sById(Tmp_6s tmp_6s){
        tmp_6sDao.updateTmp_6sById(tmp_6s);
    }
    //查询所有信息
    @Override
    public List<Tmp_6s> findTmp_6s(Integer fenzu){
        return tmp_6sDao.findTmp_6s(fenzu);
    }

    @Override
    public List<Tmp_6s> getAllByFenzuAndZhonglei(FenzuAndZhonglei fenzuAndZhonglei) {
        return tmp_6sDao.getAllByFenzuAndZhonglei(fenzuAndZhonglei);
    }

    //查询单条记录‘
    @Override
    public Tmp_6s findTmp_6sById(Integer id){
        return tmp_6sDao.findTmp_6sById(id);
    }
}
