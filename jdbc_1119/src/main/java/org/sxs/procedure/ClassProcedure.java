package org.sxs.procedure;

import java.sql.*;

/**
 * @ClassName: ClassProcedure
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/11/19 16:25
 * @Version: V1.0
 */
public class ClassProcedure {
    //    mysql驱动
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    //  路径
    private static final String url = "jdbc:mysql://localhost:3306/school";
    //   用户名
    private static final String uname = "root";
    //   密码
    private static final String pwd = "123";


    /**
     * 查询
     * @param sname
     * @param did
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void findByName(String sname, int did) throws SQLException, ClassNotFoundException {
//        1、加载驱动
        Class.forName(driver);
//        2、获得连接对象
        Connection con = DriverManager.getConnection(url, uname, pwd);
//        3、cs对象
        CallableStatement cs = con.prepareCall("{call proc_find1(?,?)}");
//        4、设置参数值
        cs.setString(1,sname);
        cs.setInt(2,did);
//        5、执行
        ResultSet rs = cs.executeQuery();
        while (rs.next()){
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
        }

//6、关闭
        rs.close();
        cs.close();
        con.close();
    }


    /**
     * 添加
     * @param cid
     * @param sname
     * @param did
     * @param ele
     * @param n
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void add(int cid,String sname,int did,String ele,int n) throws SQLException, ClassNotFoundException {
//        1、加载驱动
        Class.forName(driver);
//        2、获得连接对象
        Connection con = DriverManager.getConnection(url, uname, pwd);
//        3、cs对象
        CallableStatement cs = con.prepareCall("{call proc_find2(?,?,?,?,?,?)}");
//        4、设置参数值
        cs.setInt(1,cid);
        cs.setString(2,sname);
        cs.setInt(3,did);
        cs.setString(4,ele);
        cs.setInt(5,n);
//        输出参数，注册变量，指定类型；（返回数据）
        cs.registerOutParameter(6,Types.VARCHAR);
//        5、执行
       cs.execute();
//       返回输出参数的值
        String msg = cs.getString(6);
        System.out.println(msg);
//6、关闭
        cs.close();
        con.close();
    }


    /**
     * 修改
     */

}

