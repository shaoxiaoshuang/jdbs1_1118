package org.sxs.work3;


import java.lang.reflect.Method;

/**
 * @ClassName: TestPerson
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/11/23 18:10
 * @Version: V1.0
 */
public class TestPerson {
    public static void main(String[] args) throws NoSuchMethodException {
        try {
//            1.class对象
            Class<?> cl = Class.forName("org.sxs.work3.Util");
//            2.method对象
            Method method = cl.getMethod("show");
//            3. 获得当前方法是否使用注解JdbcUtil
            boolean flag = method.isAnnotationPresent(Util.class);
//            4.判断
            if (flag) {
//            5.通过方法获取注解
                Util ui = method.getAnnotation(Util.class);
//            6.获取注解参数
                String age = ui.age();
            } else {
                System.out.println("没有注解");
            }
            int age = 0;
            if (age > 18) {
                System.out.println("具备选举权");
            } else {
                System.out.println("未成年");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

