package com.acat.controller;

import com.acat.model.Tmp_6s;
import com.acat.service.Tmp_6sService;
import com.acat.vo.FenzuAndZhonglei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tpm")
public class Tmp_6sController {
    @Autowired
    private Tmp_6sService tmp_6sService;

    //添加
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addTmp_6s(@RequestBody Tmp_6s tmp_6s) {
        System.out.println(tmp_6s);
        tmp_6sService.addTmp_6s(tmp_6s);
    }
    //删除

    //在postman中的测试写法 http://localhost:8080/shenmu_war_exploded/tpm/delete/3  text中不需要写json数据
    @RequestMapping(value = "/delete/{id}")
    public void deleteTmp_6s(@PathVariable("id") Integer id) {
        System.out.println("-----输出要删除的ID是------" + id);
        tmp_6sService.deleteTmp_6sById(id);
    }

    //修改
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public String updateTmp_6s(@RequestBody Tmp_6s tmp_6s) {
        tmp_6sService.updateTmp_6sById(tmp_6s);
        System.out.println("---执行完update----");
        return "信息修改成功";
    }

    //查询所有
    //@ResponseBody是作用在方法上的，@ResponseBody 表示该方法的返回结果直接写入 HTTP response body 中，一般在异步获取数据时使用
    @RequestMapping(value = "/selectAll/{fenzu}", method = RequestMethod.GET)
    @ResponseBody
    public List<Tmp_6s> listAll(@PathVariable("fenzu") Integer fenzu) {
        List<Tmp_6s> list = tmp_6sService.findTmp_6s(fenzu);
        return list;
    }

    //通过ID查询数据
    @RequestMapping(value = "/selectById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Tmp_6s getTmp_6sById(@PathVariable("id") Integer id) {
        Tmp_6s tt = tmp_6sService.findTmp_6sById(id);
        System.out.println(tt);
        return tt;
    }

    @PostMapping("/get")
    public List<Tmp_6s> get(@RequestBody FenzuAndZhonglei fenzuAndZhonglei) {
       return tmp_6sService.getAllByFenzuAndZhonglei(fenzuAndZhonglei);
    }


//    @Test
//    public void test1(){
//        Tmp_6s tmp_6s=new Tmp_6s();
//        tmp_6s.setBumen("123");
//        tmp_6s.setChuliqingkuang("123");
//        tmp_6s.setFenzu(3);
//        tmp_6s.setJianchadidian("123");
//        tmp_6s.setJiancharenzhiwu("123");
//        tmp_6s.setJianchashijian("12-45-89");
//        tmp_6s.setLeixing("444");
//        tmp_6s.setJiancharenxingming("zhansan");
//        tmp_6s.setZerenren("xiaoyang");
//        tmp_6s.setGaikuang("666");
//        tmp_6s.setZhenggaishijian("12-88-99");
//        tmp_6s.setZhonglei("56");
//        tmp_6sService.updateTmp_6sById(tmp_6s);
//    }
}
