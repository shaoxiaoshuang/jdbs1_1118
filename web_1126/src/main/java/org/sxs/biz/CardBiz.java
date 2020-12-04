package org.sxs.biz;

import org.sxs.BaseDao;
import org.sxs.Cards;

import java.sql.*;

/**
 * @ClassName: CardBiz
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/11/26 16:04
 * @Version: V1.0
 */
public class CardBiz extends BaseDao {

    /**
     * 登录
     *
     * @param cards
     * @return
     */
    public int isLogin(Cards cards) {
        String sql = "SELECT COUNT(1) FROM cards WHERE card =? AND pwd = ?";

        //设置值
        Object[] obj = new Object[]{cards.getCard(), cards.getPwd()};
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




    public int add(Cards cards){
        String sql = "insert into cards (card,`name`,pwd) values(?,?,?)";

        //设置值
        Object[] obj = new Object[]{cards.getCard(), cards.getName(),cards.getPwd()};
        //调用方法
        try {
            return this.queryUpdate(sql,obj);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

