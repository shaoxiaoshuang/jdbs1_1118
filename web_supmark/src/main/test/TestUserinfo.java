import org.aly.sxs.biz.UserinfoBiz;
import org.aly.sxs.biz.UserinfoBizImpl;
import org.aly.sxs.pojo.Userinfo;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName: TestUserinfo
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/12/3 16:41
 * @Version: V1.0
 */
public class TestUserinfo {

    @Test
    public void login() {
        //实例化对象
        UserinfoBiz biz = new UserinfoBizImpl();
        //封装对象
        Userinfo user = new Userinfo("孙主管", "aaa");
        try {
            //调用方法
            Userinfo userinfo = biz.isLogin(user);
            System.out.println(userinfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void all() {
        //实例化对象
        UserinfoBiz biz = new UserinfoBizImpl();
        //参数
        Object[] obj={"经"};
        try {
            //调用方法
//            List<Userinfo> userInfos = biz.all();
            List<Userinfo> userInfos = biz.all(obj);
            //循环遍历
            for(Userinfo userInfo:userInfos) {
                System.out.println(userInfo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

