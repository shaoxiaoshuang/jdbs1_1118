package org.sxs;

import java.sql.*;

/**
 * @ClassName: SubjectBiz
 * @Description: Connection 接口  （数据库连接）
 * DriverManager 类 （管理数据库驱动）
 * Statement 接口   (操作sql语句) ==》拼接字符串
 * ResultSet 接口   (操作结果集（查询）)
 * （1） rs.next（） 光标往下走
 * （2） rs.getInt（1）  根据第几个获得数据表中的列名字段类型和值,按1开始 2,3，4。。。
 * （3） rs.getInt（"StudentNo"） 根据字段名类获得数据表中的列名字段类型和值
 * @Author: SXS
 * @date: 2020/11/18 15:53
 * @Version: V1.0
 */
public class SubjectBiz {
    //    mysql驱动
    private String driver = "com.mysql.cj.jdbc.Driver";
    //  路径jdbc:mysql://localhost本机IP;3306mysql端口号 ；mysql数据库名
    private String url = "jdbc:mysql://localhost:3306/school1112";
    //   用户名
    private String uname = "root";
    //   密码
    private String pwd = "123";


    /**
     * 连接
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
     * 查询所有数据
     */
    public void all() {
//        1、连接对象
        Connection con = getConnection();
//        2、st对象
        try {
            Statement st = con.createStatement();
//            3、spl语句
            String spl = "select * from subject";
//            4、执行
            ResultSet rs = st.executeQuery(spl);
//            5、遍历
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3) + "\t" + rs.getInt(4));
            }
//            6、关闭(由内向外)
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 添加
     */
    public void add() {
//        spl语句
        String spl = "INSERT INTO `subject` VALUES('pe',90,3)";

//        1、连接对象
        Connection conn = getConnection();
//        2、st对象
        try {
            Statement st = conn.createStatement();
//            3、执行sql语句
            int count = st.executeUpdate(spl);
            System.out.println(count);
//            4、关闭
            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 修改
     */
    public void update() {
        //        spl语句
        String spl = "UPDATE `subject` set subjectname = 'mess',classhour = 60 WHERE subjectid = 8";
        //        1、连接对象
        Connection conn = getConnection();
//        2、st对象
        try {
            Statement st = conn.createStatement();
//            3、执行sql语句
            int count = st.executeUpdate(spl);
            System.out.println(count);
//            4、关闭
            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * 删除
     */

    public void del(){
        //        spl语句
        String spl = "DELETE FROM `subject` WHERE subjectid = 7";
        //        1、连接对象
        Connection conn = getConnection();
//        2、st对象
        try {
            Statement st = conn.createStatement();
//            3、执行sql语句
            int count = st.executeUpdate(spl);
            System.out.println(count);
//            4、关闭
            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public void updates(String sname,int chour,int sid) {
//        spl语句
        String spl = "UPDATE `subject` set subjectname = '"+sname+"',classhour = "+chour+" WHERE subjectid = "+sid;
//        1、连接对象
        Connection conn = getConnection();
//        2、st对象
        try {
            Statement st = conn.createStatement();
//            3、执行sql语句
            int count = st.executeUpdate(spl);
            System.out.println(count);
//            4、关闭
            st.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}

