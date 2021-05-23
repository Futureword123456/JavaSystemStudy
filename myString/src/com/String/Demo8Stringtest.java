package com.String;

import java.util.Scanner;

/**
 * @Time : 2021/5/22 20:51
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo8Stringtest.java
 * @Software: IntelliJ IDEA
 **/
public class Demo8Stringtest {
    /**
     * 1. 编写Student类，用于封装数据
     * 2. 键盘录入一个字符串，用 Scanner 实现
     * 3. 根据逗号切割字符串，得到（张三）（23）
     * String[] split(String regex) ：根据传入的字符串作为规则进行切割 将切割后的内容存入字符串数组中，并将
     * 字符串数组返回
     * 4. 从得到的字符串数组中取出元素内容，通过Student类的有参构造方法封装为对象
     * 5. 调用对象getXxx方法，取出数据并打印
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s1 = scanner.nextLine();
        //字符串的分割
        String[] split = s1.split(",");
        Demo8String demo8String = new Demo8String(split[0],split[1]);
//        System.out.println(demo8String.getAge());
//        System.out.println(demo8String.getName());
        demo8String.show();

    }
}
