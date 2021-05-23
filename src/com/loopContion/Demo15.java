package com.loopContion;

/**
 * @Time : 2021/5/17 14:37
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo15.java
 * @Software: IntelliJ IDEA
 **/
public class Demo15 {
    public static void main(String[] args) {
        /**
         * 需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫
         * 米。请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
         */
        int count = 0;
        double paper = 0.1;
        while (paper <= 8844430) {
            paper *= 2;//折叠就是每次是前一次的2倍
            count++;//统计次数
            System.out.println(paper);
        }
        System.out.println(count);

        /**
         * do...while()循环打印长江大学次
         */
        int i = 1;
        do{
            System.out.println("长江大学");
            i++;
        }while (i<=10);
    }

}
