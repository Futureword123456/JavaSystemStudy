package com.String;

import java.util.Scanner;

/**
 * @Time : 2021/5/22 20:48
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo7String.java
 * @Software: IntelliJ IDEA
 **/
public class Demo7String {
    public static void main(String[] args) {
        /**
         * 键盘录入一个 字符串，如果字符串中包含（TMD），则使用***替换
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s1 = scanner.nextLine();
        String tmd = s1.replace("tmd", "***");
        System.out.println(tmd);
    }
}
