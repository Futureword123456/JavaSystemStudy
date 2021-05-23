package com.test1;

/**
 * @Time : 2021/5/20 21:22
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : TestStudent.java
 * @Software: IntelliJ IDEA
 **/
public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(25);
        int age = stu.getAge();
        System.out.println(age);
        stu.setName("杨华钟");

        stu.show();

    }
}
