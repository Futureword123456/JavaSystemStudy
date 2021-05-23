package com.String;

import java.util.Scanner;

/**
 * @Time : 2021/5/22 20:28
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo4String.java
 * @Software: IntelliJ IDEA
 **/
public class Demo4String {
    public static void main(String[] args) {
        /**
         * 键盘录入一个字符串，使用程序实现在控制台遍历该字符串
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s1 = scanner.nextLine();

        for (int i = 0; i <s1.length() ; i++) {
            char c = s1.charAt(i);
            System.out.println(c);
        }
    }
}
