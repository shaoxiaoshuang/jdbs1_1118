package org.aly.sxs.dao;

import org.aly.sxs.pojo.Userinfo;
import org.aly.sxs.util.BaseDao;

import java.util.List;

/**
 * @ClassName: UserinfoDaoImpl
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/12/3 14:44
 * @Version: V1.0
 */
public class UserinfoDaoImpl extends BaseDao implements UserinfoDao {

    /**
     * 登录
     * @param userInfo
     * @return
     * @throws Exception
     */
    @Override
    public Userinfo isLogin(Userinfo userInfo) throws Exception {

        String sql = "SELECT * from userinfo WHERE userName=? and `passWord`=?";
        //参数
        Object[] obj = { userInfo.getUserName(),userInfo.getPassWord()};
       //调用方法
        return this.excuteOneQuery(sql,Userinfo.class,obj);
    }

    /**
     * 添加
     * @param userInfo
     * @return
     * @throws Exception
     */
    @Override
    public int add(Userinfo userInfo) throws Exception {

        String sql = "SELECT * from userinfo WHERE userName=? and `passWord`=?";
        //参数
        Object[] obj = { userInfo.getUserName(),userInfo.getPassWord()};
        //调用方法
        return this.excuteUpdate(sql,Userinfo.class,obj);
    }

    /**
     * 删除
     * @param userId
     * @return
     * @throws Exception
     */
    @Override
    public Object del(String userId) throws Exception {
        String sql = "DELETE FROM userinfo WHERE userId = ?";
        //参数
        Object[] obj = new Object[Integer.parseInt(userId)];
        //调用方法
        return this.excuteOneQuery(sql,userId.getClass(),obj);
    }

    /**
     * 修改
     * @param userInfo
     * @return
     * @throws Exception
     */
    @Override
    public Userinfo update(Userinfo userInfo) throws Exception {
        String sql = "UPDATE goods set goodsName = ? WHERE goodId = ?";
        //参数
        Object[] obj = { userInfo.getUserName(),userInfo.getUserId()};
        //调用方法
        return this.excuteOneQuery(sql,Userinfo.class,obj);
    }

    @Override
    public Userinfo findById(String id) throws Exception {
        return null;
    }

    /**
     * 查询
     * @param param
     * @return
     * @throws Exception
     */
    @Override
    public List<Userinfo> all(Object... param) throws Exception {

        String sql = "";
        List<Userinfo> list = null;
        if (param.length == 0) {
            //sql语句
            sql = "SELECT * from userinfo";
            //调用方法
            list = this.excuteMoreQuery(sql, Userinfo.class);
        } else {
            sql = "SELECT * from userinfo where username like ?";
            //参数
            Object[] obj = {"%" + param[0] + "%"};
            //调用方法
            list = this.excuteMoreQuery(sql, Userinfo.class, obj);
        }

        return list;
    }
}

