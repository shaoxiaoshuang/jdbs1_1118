package org.sxs;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    ClassBiz biz = new ClassBiz();

    /**
     * Rigorous Test :-)
     */


    /**
     * 查询
     */
    @Test
    public void all() {
        biz.all("学");
    }


    /**
     * 删除
     */
    @Test
    public void dell() {
        biz.del(101);
    }



    /**
     * 修改
     */
    @Test
    public void update() {
        biz.update(111, "有机化学", 2, 30);
    }



    /**
     * 添加
     */
    @Test
    public void adds() {
        biz.add(146, "语文", 2, "1996", 30);
    }


}
