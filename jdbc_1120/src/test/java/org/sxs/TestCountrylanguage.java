package org.sxs;

import org.junit.Test;
import org.sxs.countrylanguage.Countrylanguage;

import java.sql.SQLException;

/**
 * @ClassName: TestCountrylanguage
 * @Description: 测试类
 * @Author: SXS
 * @date: 2020/11/20 14:03
 * @Version: V1.0
 */
public class TestCountrylanguage {

    Countrylanguage cl = new Countrylanguage();

    @Test
    public void find1() {
        try {
            cl.add("Aac", "spanish", "T", 4.5);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void find2() {
        try {
            cl.alls("Dutch", "T");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

