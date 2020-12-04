package org.sxs.biz;

import org.sxs.pojo.Userinfo;
import org.sxs.util.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: UserinfoBiz
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/11/30 14:21
 * @Version: V1.0
 */
public class UserinfoBiz extends BaseDao {

    /**
     * 登录
     *
     * @param userinfo
     * @return
     */
    public int isLogin(Userinfo userinfo) {
        String sql = "SELECT COUNT(1) FROM userinfo WHERE username =? AND password = ?";

        //设置值
        Object[] obj = new Object[]{userinfo.getUsername(), userinfo.getPassword()};
        ResultSet rs = null;

        //调用方法
        try {
            rs = this.queryQuery(sql, obj);

            //获得值
            rs.next();
            return rs.getInt(1);


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭
            this.closeAll(rs, this.ps, this.con);
        }

        return 0;
    }

    /**
     * 注册
     *
     * @param userinfo
     * @return
     */
    public int add(Userinfo userinfo) {
        String sql = "insert into userinfo (id,username,password) values(?,?,?)";

        //设置值
        Object[] obj = new Object[]{userinfo.getId(), userinfo.getUsername(), userinfo.getPassword()};
        //调用方法
        try {
            return this.queryUpdate(sql, obj);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 修改
     *
     * @param userinfo
     * @return
     */

    public int update(Userinfo userinfo) {
        String sql = "UPDATE userinfo SET username = ?,password = ? WHERE id = ?";

        //设置值
        Object[] obj = new Object[]{userinfo.getUsername(), userinfo.getPassword(), userinfo.getId()};
        //调用方法
        try {
            return this.queryUpdate(sql, obj);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }


    /**
     * 删除
     *
     * @param id
     * @return
     */
    public int delete(int id) {
        String sql = "DELETE FROM userinfo WHERE id = ?";

        //设置值
        Object[] obj = new Object[]{id};
        //调用方法
        try {
            return this.queryUpdate(sql, obj);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }


    /**
     * 查询
     *
     * @param
     * @return
     */
    public List<Userinfo> all() {
        //存储数据
        List<Userinfo> list = new ArrayList<>();
        //sql语句
        String sql = "SELECT * FROM userinfo";
        ResultSet rs = null;
        //调用方法
        try {
            rs = this.queryQuery(sql);
            while (rs.next()) {
                Userinfo userinfo = new Userinfo(rs.getInt(1), rs.getString(2), rs.getString(3));
                //保存到集合
                list.add(userinfo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭
            this.closeAll(rs, this.ps, this.con);
        }
        return list;
    }


}

