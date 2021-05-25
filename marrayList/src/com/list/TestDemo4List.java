package com.list;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Time : 2021/5/24 15:55
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : TestDemo4List.java
 * @Software: IntelliJ IDEA
 **/
public class TestDemo4List {
    public static void main(String[] args) {
        /**
         * 创建一个存储学生对象的集合，存储3个学生对象，
         * 使用程序实现在控制台遍历该集合
         * 学生的姓名和年龄来自于键盘录入
         */
        ArrayList<Student> list = new ArrayList<>();
        addStu(list);
    }

    private static void addStu(ArrayList<Student> list) {
        Student stu1 = getName();
        Student stu2 = getName();
        Student stu3 = getName();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "..." + stu.getAge());
        }
    }

    private static Student getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        //存入对象中
        Student stu = new Student(name,age);
        return stu;
    }
}
