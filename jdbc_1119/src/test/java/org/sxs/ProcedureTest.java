package org.sxs;

import org.junit.Test;
import org.sxs.procedure.ClassProcedure;

import java.sql.SQLException;

/**
 * @ClassName: ProcedureTest
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/11/19 17:08
 * @Version: V1.0
 */
public class ProcedureTest {
    ClassProcedure cp = new ClassProcedure();


    /**
     * 查询
     */
    @Test
    public void find1(){
        try {
            cp.findByName("电",2);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * 添加
     */
    @Test
    public void find2(){
        try {
        cp.add(146,"ps",2,"1996",20);
    } catch (SQLException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
}



}

