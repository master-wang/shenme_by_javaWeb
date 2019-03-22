package test;

import com.acat.dao.IDengluDao;
import com.acat.model.Denglu;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestLogin {
    @Autowired
    private IDengluDao iDengluDao;
//
//    @Test
//    public void login() {
//        Denglu denglu = new Denglu();
//        denglu.setYonghuming("丁海峰");
//        denglu.setMima("123456");
//        System.out.println("1111111111111111111111111");
//        System.out.println(iDengluDao.login(denglu));
//        System.out.println("*****************************");
//
//    }
//    @Test
//    public void register () {
//        Denglu denglu = new Denglu();
//        denglu.setYonghuming("董大海");
//        denglu.setMima("123456");
//       iDengluDao.register(denglu);
//    }
}
