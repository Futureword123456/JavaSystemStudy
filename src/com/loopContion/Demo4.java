package com.loopContion;

/**
 * @Time : 2021/5/16 14:51
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo4.java
 * @Software: IntelliJ IDEA
 **/

/**
 * 赋值运算符
 */
public class Demo4 {
    public static void main(String[] args) {
        int a = 10;
        a+=10;
        System.out.println(a);
        int x=10;
        System.out.println(x>5&x<15);
        /**
         * 关系运算符
         */
        int c = 10;
        int d = 20;
        System.out.println(c == d);//false
        System.out.println(c != d);//true
        System.out.println(c > d);//false
        System.out.println(c >= d);//false
        System.out.println(c < d);//true
        System.out.println(c <= d);//true
        boolean flag = c>d;
        System.out.println(flag);//false

        /**
         * 逻辑运算符：逻辑运算符把各个运算的关系表达式连接起来组成一个复杂的逻辑表达式，以判断程序中的表达式是否成立，判断
         * 的结果是 true 或 false。 & | ！ ^
         */
        int m = 10;
        int n = 20;
        int y = 30;
        //false&
        System.out.println((m<n)&(m>y));
        /**
         * 三元运算符
         */
        int p = m > n ? m: n;
        System.out.println(p);


        /**
         * 需求：
         * 一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，请用程序实现获取这三个和尚的最
         * 高身高。
         */
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        int midheight = height1>height2?height1:height2;
        int max = midheight>height3?midheight:height3;
        System.out.println(max);




    }
}
