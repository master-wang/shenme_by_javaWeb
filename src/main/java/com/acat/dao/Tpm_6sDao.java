package com.acat.dao;
import com.acat.model.Tmp_6s;
import com.acat.vo.FenzuAndZhonglei;
import com.acat.vo.Tmp_6sVo;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface Tpm_6sDao {
    //添加Tmp—6s
    void addTmp_6s(Tmp_6s tmp_6s);
    //删除Tmp—6s
    void deleteTmp_6sById(int ID);
    //修改Tmp-6s
    void updateTmp_6sById(Tmp_6s tmp_6s);
    //查询、遍历Tmp-6s
    List<Tmp_6s> findTmp_6s(Integer fenzu);
    //根据ID查询
    Tmp_6s  findTmp_6sById(Integer id);

    /**
     * 通过分组或者种类查询所有数据
     * @param fenzuAndZhonglei
     */
    List<Tmp_6s> getAllByFenzuAndZhonglei(FenzuAndZhonglei fenzuAndZhonglei);

}
