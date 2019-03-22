package com.acat.controller;

import com.acat.model.Wenjian;
import com.acat.service.IWenjianService;
import com.acat.util.StringUtil;
import com.acat.util.WordToHtml;
import com.acat.vo.WenjianStrAndFenzuVo;
import com.acat.vo.WenjianSuoshuAndFenzuVo;
import com.acat.vo.WenjianVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/wenjian")
public class WenjianController {

    /**
     *     private Integer id;
     *     private String suoshufenlei;
     *     private String fabushjjian;
     *     private String faburen;
     *     private Integer fenzu;
     */

    @Autowired
    private IWenjianService WenjianService;
    private Wenjian wenjian = new Wenjian();

    @PostMapping(value ="/addPutongziduan")
    public void addPutongziduan(@RequestBody WenjianVo wenjianVo){
        System.out.println(wenjianVo);
        wenjian.setSuoshufenlei(wenjianVo.getSuoshufenlei());
        wenjian.setFabushijian(wenjianVo.getFabushijian());
        wenjian.setFaburen(wenjianVo.getFaburen());
        wenjian.setFenzu(wenjianVo.getFenzu());
        //wenjian.setId(wenjianVo.getId());
    }

    @PostMapping(value ="/updatePutongziduan")
    public void updatePutongziduan(@RequestBody WenjianVo wenjianVo){
        System.out.println(wenjianVo);
        wenjian.setSuoshufenlei(wenjianVo.getSuoshufenlei());
        wenjian.setFabushijian(wenjianVo.getFabushijian());
        wenjian.setFaburen(wenjianVo.getFaburen());
        wenjian.setFenzu(wenjianVo.getFenzu());
        wenjian.setId(wenjianVo.getId());
    }

    @PostMapping(value="/updateWenjian")
    public void updateWenjian(MultipartFile file, HttpSession session){
        String path = session.getServletContext().getRealPath("/wenjian");
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

        wenjian.setWenjianmingcheng(fileName);
        System.out.println(wenjian);
        System.out.println("------------");
        WenjianService.updateWenjian(wenjian);
    }

    @PostMapping(value = "/addWenjian")
    public void addWenjian(MultipartFile file, HttpSession session){
        String path = session.getServletContext().getRealPath("/wenjian");
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

        wenjian.setWenjianmingcheng(fileName);
        System.out.println(wenjian);
        System.out.println("------------");
        WenjianService.addWenjian(wenjian);
    }


    @GetMapping(value="/delete{id}")
    public void deleteWenjian(@PathVariable("id") Integer id){
        System.out.println("-----输出要删除的ID是------" + id);
        WenjianService.deleteWenjian(id);
    }
//
//    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
//    public String updateTmp_6s(@RequestBody Tmp_6s tmp_6s) {
//        tmp_6sService.updateTmp_6sById(tmp_6s);
//        System.out.println("---执行完update----");
//        return "信息修改成功";
//    }

    @GetMapping(value="/query/{id}")
    @ResponseBody
    public Wenjian query(@PathVariable("id") Integer id){
        Wenjian wenjian = WenjianService.getWenjianById(id);
        return wenjian;
    }

    @PostMapping(value="/getListBySuoshuFenlei")
    @ResponseBody
    public List<Wenjian> getListBySuoshuFenlei(@RequestBody WenjianSuoshuAndFenzuVo vo){

        System.out.println(vo.getFenzu());
        System.out.println(vo.getSuoshufenlei());

        List<Wenjian> list = WenjianService.getListWenjianBySuoshufenlei(vo);
        System.out.println(list);
        return list;
    }


    @PostMapping(value="/getListWenjianByWenjianmingMohuchaxun")
    @ResponseBody
    public List<Wenjian> getListWenjianByWenjianmingMohuchaxun(@RequestBody WenjianStrAndFenzuVo vo){

        System.out.println(vo.getFenzu());
        System.out.println(vo.getStr());

        List<Wenjian> list = WenjianService.getListWenjianByWenjianmingMohuchaxun(vo);
        System.out.println(list);
        return list;
    }

    @GetMapping(value="/getListWenjianByFenzu/{fenzu}")
    @ResponseBody
    public List<Wenjian> getListWenjianByFenzu(@PathVariable("fenzu") Integer fenzu){
        List<Wenjian> list = WenjianService.getListWenjianByFenzu(fenzu);
        return list;
    }


    @PostMapping(value="/getListWenjianBySuoshuAndFenzu")
    public List<Wenjian> getListWenjianBySuoshuAndFenzu(@RequestBody WenjianSuoshuAndFenzuVo vo){
        System.out.println(vo.getSuoshufenlei());
        System.out.println(vo.getFenzu());

        List<Wenjian> list = WenjianService.getListWenjianBySuoshufenlei(vo);
        return list;
    }

    @GetMapping(value="/getWenjianToHtmlById/{id}")
    public List<String> getWenjianToHtmlById(@PathVariable("id") Integer id,HttpSession session) throws Exception{



        String path = session.getServletContext().getRealPath("/wenjian/");

        List<String> list = new ArrayList<>();

        Wenjian wenjian = WenjianService.getWenjianById(id);
        System.out.println(wenjian.getWenjianmingcheng());
        String wenjianName = StringUtil.qiegeqianmian(wenjian.getWenjianmingcheng());

        WordToHtml.Word2003ToHtml(path,path,wenjian.getWenjianmingcheng(),wenjianName+".html");

        list.add(wenjian.getFaburen());
        list.add(wenjian.getFabushijian());
        list.add("wenjian/"+wenjian.getWenjianmingcheng());
        list.add("wenjian/"+wenjianName+".html");

        return list;
    }

    /**
     * 文件下载
     */
//    @RequestMapping("/download")
//    public String download(HttpServletRequest request,HttpServletResponse response) throws IOException{
//
//        response.setContentType("text/html;charset=UTF-8");
//        OutputStream out = response.getOutputStream();
//
//        String filename = request.getParameter("filename");//get请求方式
//
//        int id = as.findIdByFilename(filename);
//
//        System.out.println(id+"----");
//
//        filename = new String(filename.getBytes("ISO-8859-1"),"UTF-8");//中文编码
//
//        //截取老文件名
//        String oldFileName = filename.split("_")[1];
//        //得到存储路径
//        String storePath = request.getSession().getServletContext().getRealPath("/files");
//        //得到文件的全部路径
//        String filePath = makeStorePath(storePath, filename)+"\\"+filename;
//
//        //判断文件是否存在
//        java.io.File file = new java.io.File(filePath);
//
//        InputStream in = new FileInputStream(file);
//        //通知客户端以下载的方式打开
//        response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode(oldFileName, "UTF-8"));
//
//        byte[] b = new byte[1024];
//        int len = -1;
//        while((len=in.read(b))!=-1){
//            out.write(b, 0, len);
//        }
//        in.close();
//
//        System.out.println("^^^^^^^^^^'");
//
//        Count count = new Count();
//        int cou = cs.findCountById(id);
//
//        System.out.println(cou);
//
//        count.setCount(cou+1);
//
//        System.out.println("!!!!!!!!!!!!!1");
//
//        cs.updateCount(count);
//
//        System.out.println("@@@@@@@@@@");
//
//        out.write("下载成功".getBytes("UTF-8"));
//        return "";
//    }
}
