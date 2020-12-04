package org.sxs.work2;

/**
 * @ClassName: Person
 * @Description:
 * 需求说明
 * 定义Person类，包含姓名属性（name）和打招呼的方法（sayHi()）。其中name属性标识为已过时
 * 定义学生类（Student）继承Person类，使用注解限定重写sayHi()方法
 * 在main()方法中实例化两个学生对象，并使用注解抑制对象未使用的编译器警告信息
 * @Author: SXS
 * @date: 2020/11/23 16:30
 * @Version: V1.0
 */

/**
 * 父类
 */
public abstract class Person {


//    过时 注解
    @Deprecated
    private String name;

    public abstract void sayHi();


}

/**
 * 子类
 */
class Student extends Person{

//    重写 注解
    @Override
    public void sayHi() {
        System.out.println("hello");
    }
}

class Test{
    public static void main(String[] args) {
        new Student();
    }
}



