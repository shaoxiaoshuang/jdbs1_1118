package org.sxs.biz;

import org.sxs.BaseDao;
import org.sxs.pojo.Books;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName: BooksBiz
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/11/28 9:09
 * @Version: V1.0
 */
public class BooksBiz extends BaseDao {

    /**
     * 登录
     * @param books
     * @return
     */
    public int isLogin(Books books) {
        String sql = "SELECT COUNT(1) FROM books WHERE BOOKNAME =? AND STOCK = ?";

        //设置值
        Object[] obj = new Object[]{books.getBOOKNAME(), books.getSTOCK()};
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
     * @param books
     * @return
     */
    public int add(Books books) {
        String sql = "insert into books (BID,BOOKNAME,B_PRICE,IMAGE,STOCK) values(?,?,?,?,?)";

        //设置值
        Object[] obj = new Object[]{books.getBID(),books.getBOOKNAME(), books.getB_PRICE(),books.getIMAGE(),books.getSTOCK()};
        //调用方法
        try {
            return this.queryUpdate(sql, obj);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }


}

