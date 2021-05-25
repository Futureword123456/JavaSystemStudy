package com.yang.test;

import com.yang.domain.Student;

import java.util.ArrayList;

/**
 * @Time : 2021/5/25 17:19
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : testStudent.java
 * @Software: IntelliJ IDEA
 **/
public class testStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("杨华钟","2017032088",23,"1998-12-06");
        Student stu2 = new Student("杨华钟1","201703208",23,"1998-12-06");
        Student stu3 = new Student("杨华钟12","2017032081",23,"1998-12-06");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        int index = getIndex(list, "201703208");
        System.out.println(index);

    }
    //	4. 根据输入的学号判断原来集合中是否存在这个学号，如果存在返回学号索引，不存在返回-1
    public static int getIndex(ArrayList<Student> list, String sid) {
        // 1. 假设传入的学号, 在集合中不存在
        int index = -1;
        //2、遍历集合得出每一个学生对象
        for (int i = 0; i < list.size(); i++) {
            //3、获取每一个学生对象的学号
            Student stu = list.get(i);
            //根据输入的学号判断原来集合中是否存在这个学号
            String id = stu.getSid();//原来的学生学号    sid是输入的学生学号
            if (id.equals(sid)) {
                index = i;
            }
        }
        return index;
    }
}
