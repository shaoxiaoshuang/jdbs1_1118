package org.sxs;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName: ClassBiz
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/11/19 14:58
 * @Version: V1.0
 */
public class ClassBiz extends BaseDao {

    /**
     * 查询方法
     * @param name
     */
    public void all( String name){
        String sql = "SELECT subject,classid,departmentid,num FROM class WHERE subject LIKE ?";

            //调用方法
        try {
            Object[] objs = new Object[]{"%" + name + "%"};
//           调用方法
            ResultSet rs = this.queryQuery(sql,objs);

            while (rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4));
            }
//            关闭
            this.closeAll(rs,null,this.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * 删除方法
     * @param cid
     */
    public void del(int cid){
        String sql = "DELETE FROM class WHERE classid = ?";
        Object[] objs = {cid};
        try {
            int count = this.queryUpdate(sql,objs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * 修改
     */

    public void update(int cid,String sname,int did,int n){
        String sql = "update class set subject = ?,departmentid = ?,num = ? WHERE classid = ?";
        Object[] objs = {sname,did,n,cid};
        try {
            int count = this.queryUpdate(sql,objs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *添加
     */
    public void add(int cid,String sname,int did,String ele,int n){
        String sql = "INSERT INTO class VALUES (?,?,?,?,?);";
        Object[] objs = {cid,sname,did,ele,n};
        try {
            int count = this.queryUpdate(sql,objs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

