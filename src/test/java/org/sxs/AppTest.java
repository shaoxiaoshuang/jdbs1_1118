package org.sxs;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }


    @Test
    public void show() { System.out.println("使用mvn,junit 测试！"); }


    @Test
    public void showConnection() {
      SubjectBiz biz = new SubjectBiz();
//      Connection con = biz.getConnection();
//        System.out.println(con);

//        biz.add();
//        biz.update();
//        biz.del();
        biz.all();

/**
 * 添加
 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("name:");
        String name =scanner.next();

//        biz.updates(name,);
//        biz.all();
       }


}
