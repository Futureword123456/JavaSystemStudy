package com.String;

import java.util.Scanner;

/**
 * @Time : 2021/5/22 20:35
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo5String.java
 * @Software: IntelliJ IDEA
 **/
public class Demo5String {
    public static void main(String[] args) {
        /**
         * 盘录入一个字符串，使用程序实现在控制台遍历该字符串
         * 实现步骤 :
         * 1. 键盘录入一个字符串，用 Scanner 实现
         * 2. 将字符串拆分为字符数组 , public char[] toCharArray( )：将当前字符串拆分为字符数组并返回
         * 3. 遍历字符数
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s1 = scanner.nextLine();

        char[] chars = s1.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            System.out.println(chars[i]);
        }
    }
}
