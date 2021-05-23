package com.loopContion;
import java.util.Scanner;
public class Demo1 {

    public static void main(String[] args) {

        String input = "请输入一个数字";
        String result ="结果是：";
        System.out.println("hello world");
        System.out.println(123);
        System.out.println(12.3);
        System.out.println('9');
        System.out.println('a');
        System.out.println(true);
        System.out.println(5>10);
//        System.out.println(null);
        /*
        变量定义

         */
        System.out.println("变量的定义:");
        int a = 18;
        System.out.println(a);
        double b = 12.3;
        System.out.println(b);
        char c = 'A';
        System.out.println(c);
        boolean d = true;
        System.out.println(d);
        {
            int bb = 10;
            System.out.println(bb);
        }

        //键盘的录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println(input);
        int i = sc.nextInt();
        System.out.println(result+i);



    }
}
