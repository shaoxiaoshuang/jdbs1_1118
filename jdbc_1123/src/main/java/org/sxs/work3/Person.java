package org.sxs.work3;

/**
 * @ClassName: Person
 * @Description:
 * 需求说明
 * 自定义注解，只能修饰方法，包含一个成员变量age，有默认值20
 * 定义Person类，包含验证年龄的方法，使用自定义注解修饰，
 * 在此方法中读取注解中的年龄信息并进行判断，如果年龄在18岁以下，
 * 提示“未成年”，否则，提示“具备选举权”
 * 定义测试类
 * @Author: SXS
 * @date: 2020/11/23 17:07
 * @Version: V1.0
 */
public class Person {

    @Util(age = "20")
    public void show() {
    }
}




