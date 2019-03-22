package com.acat.controller;

import com.acat.model.Anquanzuoye;
import com.acat.service.IAnquanzuoyeService;
import com.acat.util.StringUtil;
import com.acat.util.WordToHtml;
import com.acat.vo.AnquanzuoyeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/anquanzuoye")
@SuppressWarnings("all")
public class AnquanzuoyeController {

    @Autowired
    private IAnquanzuoyeService anquanzuoyeServic;

    Anquanzuoye anquanzuoye = new Anquanzuoye();

    @PostMapping("/addPutongziduan")
    public void addPutongziduan(@RequestBody AnquanzuoyeVo anquanzuoyeVo){
        anquanzuoye.setGuanjianxiangmu(anquanzuoyeVo.getGuanjianxiangmu());
        anquanzuoye.setName(anquanzuoyeVo.getName());
        anquanzuoye.setJiandanmiaoshu(anquanzuoyeVo.getJiandanmiaoshu());
        anquanzuoye.setWenjianleixing(anquanzuoyeVo.getWenjianleixing());
        anquanzuoye.setFenzu(anquanzuoyeVo.getFenzu());
        System.out.println(anquanzuoyeVo.getFenzu());
    }

    @PostMapping("/updatePutongziduan")
    public void updatePutongziduan(@RequestBody AnquanzuoyeVo anquanzuoyeVo){
        anquanzuoye.setId(anquanzuoyeVo.getId());
        anquanzuoye.setGuanjianxiangmu(anquanzuoyeVo.getGuanjianxiangmu());
        anquanzuoye.setName(anquanzuoyeVo.getName());
        anquanzuoye.setJiandanmiaoshu(anquanzuoyeVo.getJiandanmiaoshu());
        anquanzuoye.setWenjianleixing(anquanzuoyeVo.getWenjianleixing());
        anquanzuoye.setFenzu(anquanzuoyeVo.getFenzu());
    }

    @PostMapping("/updateWenjianshangchuan")
    public void updateWenjianshangchuan(MultipartFile file, HttpSession session){
        String path = session.getServletContext().getRealPath("/anquanzuoye");
        System.out.println(path);

        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
        File targetFile = new File(path, fileName);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }

        try{
            file.transferTo(targetFile);
        }catch (IOException e){
            e.printStackTrace();
        }

        anquanzuoye.setWenjianshangchuan(fileName);
        System.out.println(anquanzuoye);
        System.out.println("------------");
        anquanzuoyeServic.updateAnquanzuoye(anquanzuoye);
    }


    @PostMapping("/addWenjianshangchuan")
    public void addWenjianshangchuan(MultipartFile file, HttpSession session){
        String path = session.getServletContext().getRealPath("/anquanzuoye");
        System.out.println(path);

        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
        File targetFile = new File(path, fileName);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }

        try{
            file.transferTo(targetFile);
        }catch (IOException e){
            e.printStackTrace();
        }

        anquanzuoye.setWenjianshangchuan(fileName);
        System.out.println(anquanzuoye);
        System.out.println("------------");
        anquanzuoyeServic.addAnquanzuoye(anquanzuoye);
    }



    @GetMapping(value="/deleteAnquanzuoye/{id}")
    public void deleteAnquanzuoye(@PathVariable("id") Integer id){
        anquanzuoyeServic.deleteAnquanzuoye(id);
    }

    @GetMapping(value="/getAnquanzuoyeById/{id}")
    public Anquanzuoye getAnquanzuoyeById(@PathVariable("id") Integer id){
        Anquanzuoye anquanzuoye = anquanzuoyeServic.getAnquanzuoyeById(id);
        return anquanzuoye;
    }

    @PostMapping(value="getLIstAll")
    public List<Anquanzuoye> getListAll(){
        List<Anquanzuoye> list = anquanzuoyeServic.listAll();
        return list;
    }

    @GetMapping(value = "/getAnquanzuoyeByFenzu/{fenzu}")
    public List<Anquanzuoye> getAnquanzuoyeByFenzu(@PathVariable("fenzu") Integer fenzu){
        List<Anquanzuoye> list = anquanzuoyeServic.getAnquanzuoyeByFenzu(fenzu);
        return list;
    }


    @GetMapping(value="/getWenjianToHtmlById/{id}")
    public List<String> getWenjianToHtmlById(@PathVariable("id") Integer id,HttpSession session) throws Exception{



        String path = session.getServletContext().getRealPath("/anquanzuoye/");

        List<String> list = new ArrayList<>();


        Anquanzuoye anquanzuoye = anquanzuoyeServic.getAnquanzuoyeById(id);

        String wenjianName = StringUtil.qiegeqianmian(anquanzuoye.getWenjianshangchuan());

        WordToHtml.Word2003ToHtml(path,path,anquanzuoye.getWenjianshangchuan(),wenjianName+".html");

        list.add(anquanzuoye.getName());
        list.add(anquanzuoye.getGuanjianxiangmu());
        list.add("anquanzuoye/"+anquanzuoye.getWenjianshangchuan());
        list.add("anquanzuoye/"+wenjianName+".html");

        return list;
    }
}
