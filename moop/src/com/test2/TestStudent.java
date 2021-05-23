package com.test2;

/**
 * @Time : 2021/5/20 21:48
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : TestStudent.java
 * @Software: IntelliJ IDEA
 **/
public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("杨华钟");
        System.out.println(stu.getName());
        System.out.println(stu);

        System.out.println("---------------");

        Student stu1 = new Student();
        stu1.setName("杨华钟");
        System.out.println(stu1.getName());
        System.out.println(stu1);


    }
}
