package com.acat.controller;

import com.acat.model.Denglu;
import com.acat.model.Renyuan;
import com.acat.service.IDengluService;
import com.acat.service.IRenyuanService;
import com.acat.vo.DengluVo;
import com.acat.vo.UpdateMimaVo;
import com.acat.vo.ZhiAndIdVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/login")
public class DengluController {
    @Autowired
    private IDengluService iDengluService;

    @Autowired
    private IRenyuanService iRenyuanService;

    @PostMapping(value = "/login")
    public String login(@RequestBody DengluVo dengluVo){

        String yonghuming = dengluVo.getYonghuming();
        int flag = iDengluService.getFlagByYonghuming(yonghuming);

        if(flag==0){
            return "false";
        }

//        System.out.println(dengluVo);
//
//        if (dengluVo.getMima().equals("123456")) {
//
//            return "false";
//        }


        Denglu denglu = new Denglu();
        denglu.setYonghuming(dengluVo.getYonghuming());
        denglu.setMima(dengluVo.getMima());
        Denglu newDenglu = iDengluService.login(denglu);

        if(newDenglu == null){
            return "true";
        }else{
            int zhiwei = iDengluService.getRenyuanZhiwei(newDenglu.getYonghuming());
            int fenzu = iDengluService.getRenyuanFenzu(newDenglu.getYonghuming());
            Renyuan renyuan = iDengluService.getZuzhangInfo(newDenglu.getYonghuming());
            int id = renyuan.getID();

            ZhiAndIdVo vo = new ZhiAndIdVo();
            vo.setZhiwei(zhiwei);
            vo.setId(id);
            vo.setFenzu(fenzu);
            System.out.println("------------------"+vo);
            return vo.toString();
        }

//            if (zhiwei == 0) {
//                return "0";
//            } else if (zhiwei == 1) {
//                Renyuan renyuan = iDengluService.getZuzhangInfo(newDenglu.getYonghuming());
//                return renyuan.getID().toString();
//
//            } else if (zhiwei == 2) {
//                return "2";
//            } else if (zhiwei == 3) {
//                return "3";
//            }

    }

    @GetMapping(value="/getRenyuanVoByfenzu/{fenzu}")
    public List<Renyuan> getRenyuanVoByfenzu(@PathVariable("fenzu") Integer fenzu){
        System.out.println("fenzu是"+fenzu);
        List<Renyuan> list = iDengluService.getFenzuRenyuan(fenzu);
        return list;
    }

    @GetMapping(value="/getRenyuanById/{id}")
    public Renyuan getRenyuanById(@PathVariable("id") Integer id){

        System.out.println("id是*************"+id);

        Renyuan renyuan = iRenyuanService.getRenyuanById(id);
        return renyuan;
    }


    @PostMapping(value="/getMima")
    public String getMima(@RequestBody UpdateMimaVo updateMimaVo){

        System.out.println(updateMimaVo);

        String mima = iDengluService.getMimaByYonghuming(updateMimaVo.getYonghuming());

        if(!updateMimaVo.getMima().equals("123456")){
            return "0";
        }

        if(mima.equals(updateMimaVo.getNewMima())){
            return "1";
        }

        Denglu denglu = new Denglu();
        denglu.setMima(updateMimaVo.getNewMima());
        denglu.setYonghuming(updateMimaVo.getYonghuming());

        Denglu denglu2 = new Denglu();
        denglu2.setMima(updateMimaVo.getNewMima());
        denglu2.setYonghuming(updateMimaVo.getYonghuming());
        denglu2.setFlag(1);

        iDengluService.update(denglu);
        iDengluService.updateFlag(denglu2);
        return "2";
    }

}

/*
0是职工
1是组长，丁
2是段长
3是局长
 */
