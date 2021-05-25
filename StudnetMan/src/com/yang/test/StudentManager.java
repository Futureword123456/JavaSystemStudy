package com.yang.test;

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
                    System.out.println("1 添加学生");
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
}
