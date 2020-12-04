package org.sxs;

import com.mysql.cj.protocol.Resultset;

import javax.xml.transform.Result;

import java.sql.*;

/**
 * @ClassName: BaseDao
 * @Description: 工具类
 * @Author: SXS
 * @date: 2020/11/20 13:50
 * @Version: V1.0
 */
public class BaseDao {

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/my";
    private static final String uname = "root";
    private static final String pwd = "123";


    /**
     * 连接
     *
     * @return
     */
    public Connection getConnection() {
        try {
//        1、加载驱动
            Class.forName(driver);
//        2、获得连接对象
            Connection con = DriverManager.getConnection(url, uname, pwd);
            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 查询
     *
     * @param sql
     * @param objs
     * @return
     * @throws SQLException
     */
    public ResultSet queryQuery(String sql, Object... objs) throws SQLException {
//        1、连接
        Connection con = getConnection();
//        2、获取预编译对象
        PreparedStatement ps = con.prepareStatement(sql);
//        3、设置参数
        if (objs != null) {
            for (int i = 0; i < objs.length; i++) {
                ps.setObject(i + 1, objs[i]);
            }
        }
//        4、获得连接
        ResultSet rs = ps.executeQuery();

        return rs;
    }

    /**
     * 添加
     *
     * @param sql
     * @param objs
     * @return
     * @throws SQLException
     */
    public int queryUpdate(String sql, Object... objs) throws SQLException {
        int count = 0;
//        1、连接对象
        Connection con = getConnection();
//        2、获取预编译对象
        PreparedStatement ps = con.prepareStatement(sql);
//        3、设置参数
        if (objs != null) {
            for (int i = 0; i < objs.length; i++) {
                ps.setObject(i + 1, objs[i]);
            }
        }
//        4、执行sql
        count = ps.executeUpdate();
//        5、关闭所有连接
        closeAll(null, ps, con);
        return count;
    }


    /**
     * 关闭所有连接
     *
     * @param rs  结果对象
     * @param ps  预编译对象
     * @param con 连接对象
     */
    protected void closeAll(ResultSet rs, PreparedStatement ps, Connection con) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}

