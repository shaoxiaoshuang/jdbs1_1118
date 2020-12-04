package org.sxs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @ClassName: Student
 * @Description: 需求说明
 * 定义Student 类，包含：姓名和年龄等属性，有参和无参构造方法，输出所有信息的方法
 * 使用多种方法生成一个Student类的Class对象
 * 使用Class类获取Student类的结构信息并输出
 * 通过有参(无参)构造方法动态创建Student类的对象
 * @Author: SXS
 * @date: 2020/11/23 14:45
 * @Version: V1.0
 */
public class Student {


    /**
     * 属性
     */
    private String name;
    private int age;

    /**
     * 构造方法
     */
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 封装
     *
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "\t" + age;
    }


    public static void main(String[] args) {

//使用多种方法生成一个Student类的Class对象
//         1.对象. 方法
        Class<?> cl1 = new Student().getClass();
        System.out.println(cl1);

//        2.类.class 方法
        Class<?> cl2 = Student.class;
        System.out.println(cl2);


//        3.Class.forName() 方法
        try {
            Class<?> cl3 = Class.forName("org.sxs.Student");

            System.out.println(cl3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");


//通过有参(无参)构造方法动态创建Student类的对象
        /**
         * 无参
         */
        try {
//            1.获取student类
            Class<?> c1 = Class.forName("org.sxs.Student");
//            2.实例化对象
            Object obj = c1.newInstance();
//             强制类型转换
            Student stu = (Student) obj;
//            3.属性赋值
            stu.setName("小明");
            stu.setAge(20);
            System.out.println(stu);


            /**
             * 有参
             */
            Constructor cs = c1.getConstructor(new Class[]{String.class, int.class});
//            实例化对象
            Object ob = cs.newInstance("小李", 18);
            System.out.println(ob);
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");


        try {
            Class<?> c1l = Class.forName("org.sxs.Student");
            Field[] fields = c1l.getDeclaredFields();
//            循环
            for (Field field : fields){
                String modifiy = Modifier.toString(c1l.getModifiers());
                String type = field.getType().getName();
                String name = c1l.getName();

                System.out.println(modifiy+"\t"+type+"\t"+name);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}

