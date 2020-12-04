package org.sxs;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName: CountrylanguageBiz
 * @Description: 业务类
 * @Author: SXS
 * @date: 2020/11/20 14:04
 * @Version: V1.0
 */
public class CountrylanguageBiz extends BaseDao {

    /**
     * 查询
     *
     * @param lg
     */
    public void all(String lg) {
        String sql = "SELECT CountryCode,Language,IsOfficial,Percentage FROM Countrylanguage where Language like ?";
        //调用方法
        try {
            Object[] objs = new Object[]{"%" + lg + "%"};
//           调用方法
            ResultSet rs = this.queryQuery(sql, objs);
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4));
            }
//            关闭
            this.closeAll(rs, null, this.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * 添加
     *
     */
    public void add(String cc, String lu, String iff, double pt) {
        String sql = "INSERT INTO Countrylanguage(CountryCode,Language,IsOfficial,Percentage) VALUES (?,?,?,?)";
        Object[] objs = {cc, lu, iff, pt};
        try {
            int count = this.queryUpdate(sql, objs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

