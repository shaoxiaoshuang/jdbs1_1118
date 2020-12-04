package org.sxs.biz;

import org.sxs.Card;
import org.sxs.BaseDao;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName: CardBiz
 * @Description: 业务类
 * @Author: SXS
 * @date: 2020/11/26 15:04
 * @Version: V1.0
 */
public class CardBiz extends BaseDao {

    /**
     * 登录
     *
     * @param card
     * @return
     */
    public int isLogin(Card card) {
        String sql = "SELECT COUNT(1) FROM cards WHERE card =? AND pwd = ?";

        //设置值
        Object[] obj = new Object[]{card.getCard(), card.getPwd()};
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
            this.closeAll(rs, ps, this.con);
        }
        return 0;
    }

    public int add(Card card){
        String sql = "insert into cards WHERE(card,name) values(?,?)";

        //设置值
        Object[] obj = new Object[]{card.getCard(), card.getName()};
   //调用方法
        try {
            return this.queryUpdate(sql,obj);


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

