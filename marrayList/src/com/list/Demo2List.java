package com.list;

import java.util.ArrayList;

/**
 * @Time : 2021/5/24 15:02
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo2List.java
 * @Software: IntelliJ IDEA
 **/
public class Demo2List {
    public static void main(String[] args) {
        testGet();
    }

    private static void testGet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        String s = list.get(2);
        System.out.println(s);
        int size = list.size();
        System.out.println(size);
    }

    private static void testSet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        String s = list.set(1, "666");
        System.out.println(s);//返回被修改的元素
        System.out.println(list);//修改之后的元素
    }

    private static void testRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        //删除指定元素
        list.remove("abc");//删除成功
        list.remove("123");//删除不存在的事务，不成功
        System.out.println(list);
        //按索引删除元素
        list.remove(0);
        System.out.println(list);
    }
}
