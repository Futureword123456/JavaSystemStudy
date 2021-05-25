package com.array;

/**
 * @Time : 2021/5/19 16:41
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo4.java
 * @Software: IntelliJ IDEA
 **/
public class Demo4 {
    /**
     * 需求：设计一个方法（print） 用于打印 n 到 m 之间所有的奇数
     *
     * @param args
     */
    public static void main(String[] args) {
        print(150, 200);
    }

    public static void print(int n, int m) {
        if (n>=m){
            System.out.println("你输入的数据有误，请重新输入");
            return;
        }
        int count = 0;
        System.out.println(n + "到" + m + "之间的奇数为:");
        for (int i = n; i <= m; i++) {
            if (i % 2 != 0) {
                count++;
                System.out.print(i + "\t");
            }
        }
        System.out.println();
        System.out.println(n + "到" + m + "之间的奇数有" + count + "个");
    }

}
