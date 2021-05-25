package com.yang.test;

import com.yang.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Time : 2021/5/25 15:32
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : StudentManager.java
 * @Software: IntelliJ IDEA
 **/
public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //添加学生容器对象
        ArrayList<Student> list = new ArrayList<>();

        lo:while (true){
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择:");
            String choice = sc.next();
            switch (choice){
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    System.out.println("2 删除学生");
                    break;
                case "3":
                    System.out.println("3 修改学生");
                    break;
                case "4":
                    System.out.println("4 查看学生");
                    break;
                case "5":
                    System.out.println("感谢你的使用");
                    break lo;
                default:
                    System.out.println("你输入的数据有误");
                    break;
            }
        }
    }
    //添加学生方法
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        // 1. 给出录入的提示信息
        // 2. 将键盘录入的信息封装为学生对象
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生学号：");
        String sid = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生生日：");
        String birthday = sc.next();
        // 3. 将封装好的学生对象, 添加到集合容器当中
        Student stu = new Student(name,sid,age,birthday);
        // 4. 给出添加成功的提示信息
        list.add(stu);
        System.out.println("添加学生成功！");

    }
}
