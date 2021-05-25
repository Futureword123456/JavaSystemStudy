package com.list;

import java.util.ArrayList;

/**
 * @Time : 2021/5/24 16:25
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo4List.java
 * @Software: IntelliJ IDEA
 **/
public class Demo4List {
    public static void main(String[] args) {
        /**
         * 集合删除元素
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("test");
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("test");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if ("test".equals(s)){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
