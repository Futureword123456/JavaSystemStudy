package com.loopContion;

/**
 * @Time : 2021/5/16 16:17
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo5.java
 * @Software: IntelliJ IDEA
 **/

import java.util.Scanner;

/**
 * 条件语句 if
 */
public class Demo5 {
    public static void main(String[] args) {
        String inputInt = "请输入一个整数";
        int age = 18;
        if (age>18) {
            System.out.println("可以上网");
        }else{
            System.out.println("不可以上网");
        }
        /**
         * 输入一个数，判断是否是偶数，是的话输出偶数，不是的话输出不是偶数
         */
        System.out.println(inputInt);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2==0) {
            System.out.println(num+"是偶数");
        }else {
            System.out.println(num + "不是偶数");
        }

    }
}
