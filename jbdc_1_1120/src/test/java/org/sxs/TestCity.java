package org.sxs;

import org.junit.Test;
import org.sxs.biz.CityBiz;
import org.sxs.entity.City;

import java.util.List;

/**
 * @ClassName: TestCity
 * @Description: 测试类
 * @Author: SXS
 * @date: 2020/11/22 12:52
 * @Version: V1.0
 */
public class TestCity {

    private CityBiz biz = new CityBiz();



    /**
     * 查询
     */
    @Test
    public void all(){
        try {
            List<City>list = biz.all(new City("a",353632));
            for (City city : list){
                System.out.println(city);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 添加
     */
    @Test
    public void insert(){
        try {
            int count = biz.add(new City("Aaa","ACG","Zimburg",440911));
        if (count>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 修改
     */
    @Test
    public void update(){
        try {
            int count = biz.update(new City(2,"Kabulles","AUG","Kaboless",1780012));
            if (count>0){
                System.out.println("修改成功");
            }else {
                System.out.println("修改失败");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 删除
     */
    @Test
    public void delete(){
        try {
            int count = biz.delete(new City(4080));
            if (count>0){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

