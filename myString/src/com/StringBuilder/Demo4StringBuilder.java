package com.StringBuilder;

import java.util.Scanner;

/**
 * @Time : 2021/5/23 11:11
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo4StringBuilder.java
 * @Software: IntelliJ IDEA
 **/
public class Demo4StringBuilder {
    public static void main(String[] args) {
        /**
         * 输入一个字符串，判断字符串是否对称
         */
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入一个字符串：");
            String s = scanner.nextLine();
            StringBuffer stringBuffer = new StringBuffer(s);
            stringBuffer.reverse();
            String s1 = stringBuffer.toString();
            if (s.equals(s1)){
                System.out.println("字符串是对称的");
                break;
            }else {
                System.out.println("字符串不是对称的");
            }
        }
    }
}
