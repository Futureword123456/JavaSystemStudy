package com.list;

import java.util.ArrayList;

/**
 * @Time : 2021/5/24 15:39
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo3List.java
 * @Software: IntelliJ IDEA
 **/
public class Demo3List {
    public static void main(String[] args) {
        /**
         * 创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        //集合遍历
        for (int i = 0; i < list.size(); i++) {
            //集合取出值
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
