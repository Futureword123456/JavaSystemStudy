package com.list;

import java.util.ArrayList;

/**
 * @Time : 2021/5/23 16:36
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo1List.java
 * @Software: IntelliJ IDEA
 **/
public class Demo1List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
//        list.add(132);
          list.add("abc");
          list.add("123");
          list.add("465");
//        list.add(true);
        for (int i = 0; i <3 ; i++) {

        }
        list.add(1,"ert");

        System.out.println(list);
        System.out.println(list instanceof ArrayList);
    }
}
