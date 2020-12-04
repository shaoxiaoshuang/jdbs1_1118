package org.sxs.countrylanguage;

import java.sql.*;

/**
 * @ClassName: Countrylanguage
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/11/20 16:25
 * @Version: V1.0
 */
public class Countrylanguage {

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/my";
    private static final String uname = "root";
    private static final String pwd = "123";


    public void alls(String lg, String iff) throws SQLException, ClassNotFoundException {
//        1、加载驱动
        Class.forName(driver);
//        2、获得连接对象
        Connection con = DriverManager.getConnection(url, uname, pwd);
//        3、cs对象
        CallableStatement cs = con.prepareCall("{call proc_find1(?,?)}");
//        4、设置参数值
        cs.setString(1, lg);
        cs.setString(2, iff);
//        5、执行
        ResultSet rs = cs.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4));
        }

//6、关闭
        rs.close();
        cs.close();
        con.close();
    }


    /**
     * 添加
     */
    public void add(String cc, String lg, String iff, double pt) throws SQLException, ClassNotFoundException {
//        1、加载驱动
        Class.forName(driver);
//        2、获得连接对象
        Connection con = DriverManager.getConnection(url, uname, pwd);
//        3、cs对象
        CallableStatement cs = con.prepareCall("{call proc_find2(?,?,?,?,?)}");
//        4、设置参数值
        cs.setString(1, cc);
        cs.setString(2, lg);
        cs.setString(3, iff);
        cs.setDouble(4, pt);

        cs.registerOutParameter(5,Types.VARCHAR);
//        5、执行
        cs.execute();

        String msg = cs.getString(5);
        System.out.println(msg);
//        6、关闭
        cs.close();
        con.close();
    }
}

