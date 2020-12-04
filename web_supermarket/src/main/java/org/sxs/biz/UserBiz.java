package org.sxs.biz;

import org.sxs.pojo.User;
import org.sxs.util.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: UserBiz
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/12/2 14:36
 * @Version: V1.0
 */
public class UserBiz extends BaseDao {

    /**
     * 登录
     *
     * @param user
     * @return
     */
    public int isLogin(User user) {
        String sql = "SELECT COUNT(1) FROM userinfo WHERE userName =? AND passWord = ?";

        //设置值
        Object[] obj = new Object[]{user.getUserName(), user.getPassWord()};
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
     * @param user
     * @return
     */
    public int add(User user) {
        String sql = "insert into userinfo values(?,?,?,?,?,?,?,?)";

        //设置值
        Object[] obj = new Object[]{user.getUserId(), user.getUserName(), user.getPassWord(), user.getSex(), user.getBorndate(), user.getUserTel(), user.getUserAddress(), user.getTypeID()};
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
     * @param user
     * @return
     */

    public int update(User user) {
        String sql = "UPDATE userinfo SET username = ?,password = ? WHERE userId = ?";

        //设置值
        Object[] obj = new Object[]{user.getUserName()};
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
     * @param userId
     * @return
     */
    public int delete(String userId) {
        String sql = "DELETE FROM userinfo WHERE userId = ?";

        //设置值
        Object[] obj = new Object[]{userId};
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
    public List<User> all() {
        //存储数据
        List<User> list = new ArrayList<>();
        //sql语句
        String sql = "SELECT * FROM userinfo";
        ResultSet rs = null;
        //调用方法
        try {
            rs = this.queryQuery(sql);
            while (rs.next()) {
                User user = new User();
                //保存到集合
                list.add(user);
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