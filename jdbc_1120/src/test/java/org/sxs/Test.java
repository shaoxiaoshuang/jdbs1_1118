package org.sxs;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/11/20 16:42
 * @Version: V1.0
 */
public class Test {
    CountrylanguageBiz biz = new CountrylanguageBiz();



    @org.junit.Test
    public void all(){
        biz.all("Dutch");
    }

    @org.junit.Test
    public void add(){
        biz.add("Aac", "spanish", "T", 4.5);
    }
}

