package com.acat.controller;

import com.acat.model.Renyuan;
import com.acat.service.IRenyuanService;
import com.acat.vo.RenyuanVo;
import com.acat.vo.RenyuanVo1;
import com.acat.vo.XingmingVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 人员管理Controller
 */
@RestController
@RequestMapping("/renyuan")
public class RenyuanController {
    @Autowired
    private IRenyuanService iRenyuanService;

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public void addRenyuan(@RequestBody Renyuan renyuan) {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(renyuan);
        System.out.println(renyuan.getID());

        HttpServletRequest request = null;
        request.getSession().setAttribute("renyuan",renyuan);
        iRenyuanService.addRenyuan(renyuan);
    }

    @RequestMapping(value = "/listAll")
    @ResponseBody
    public List<RenyuanVo> listAll() {
        List<RenyuanVo> list = iRenyuanService.findRenyuanVo();
        return list;
    }
    @RequestMapping(value = "/listInfo/{fenzu}")
    @ResponseBody
    public List<RenyuanVo1> listInfo(@PathVariable("fenzu") Integer fenzu) {

        System.out.println("listinfo"+fenzu);
        List<RenyuanVo1> list = iRenyuanService.findRenyuanInfo(fenzu);
        return list;
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Renyuan getById(@PathVariable("id") Integer id) {
        System.out.println(iRenyuanService.getRenyuanById(id));
        return iRenyuanService.getRenyuanById(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public void delete(@PathVariable("id") Integer id) {
        iRenyuanService.deleteRenyuanById(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public String updateRenyuan(@RequestBody Renyuan renyuan) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("renyuan是" + renyuan);
        System.out.println(renyuan.getID());
        iRenyuanService.updateRenyuanById(renyuan);

        return "修改成功";
    }
    @GetMapping("/name/{fenzu}")
       public List<XingmingVo> getxingming(@PathVariable("fenzu") Integer fenzu){
        System.out.println(fenzu);
        System.out.println(iRenyuanService.getXingmingByFezu(fenzu));
        return iRenyuanService.getXingmingByFezu(fenzu);
       }

    @GetMapping("/logout")
    public void logout(HttpServletRequest request){
        request.getSession().removeAttribute("renyuan");
        request.getSession().invalidate();
    }
}
