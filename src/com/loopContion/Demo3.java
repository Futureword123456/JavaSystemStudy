package com.loopContion;

/**
 * @Time : 2021/5/15 16:26
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo3.java
 * @Software: IntelliJ IDEA
 **/

import java.util.Scanner;

/**
 * 字符的+操作
 */
public class Demo3 {

    public static void main(String[] args) {

        String inputNum = "请输入一个数";
       //键盘录入一个三位数，将其拆分为个位，十位，百位，打印在控制台
        Scanner sc = new Scanner(System.in);
        System.out.println(inputNum);
        int num = sc.nextInt();
        //获得个位数123%10

        num1(num);


//        int ge = num % 10;
//        //获得十位数
//        int shi = num / 10 % 10;
//        //获得百位数 123/10/10
//        int bai = num / 10 / 10 % 10;
//
//        System.out.println("数据"+num+"的个位是"+ge);
//        System.out.println("数据"+num+"的十位是"+shi);
//        System.out.println("数据"+num+"的百位是"+bai);


    }
    static void num1(int num){
        int ge = num % 10;
        //获得十位数
        int shi = num / 10 % 10;
        //获得百位数 123/10/10
        int bai = num / 10 / 10 % 10;
        System.out.println("数据"+num+"的个位是"+ge);
        System.out.println("数据"+num+"的十位是"+shi);
        System.out.println("数据"+num+"的百位是"+bai);
    }

}

