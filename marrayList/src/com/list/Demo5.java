package com.list;

import java.util.ArrayList;

/**
 * @Time : 2021/5/24 16:42
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo5.java
 * @Software: IntelliJ IDEA
 **/
public class Demo5 {
    public static void main(String[] args) {
        /**
         * 把小于18岁的人筛选出来进行装在新的集合中
         */
        ArrayList<Student> list = new ArrayList<>();
        Student student = new Student("杨华钟",23);
        Student student1 = new Student("杨华钟1",13);
        Student student2 = new Student("杨华钟1",17);
        list.add(student);
        list.add(student1);
        list.add(student2);

        ArrayList<Student> studentArrayList = getAge(list);

        for (int i = 0; i < studentArrayList.size(); i++) {
            Student stu = studentArrayList.get(i);
            System.out.println(stu.getName()+"..."+stu.getAge());
        }
    }
    public static ArrayList<Student> getAge(ArrayList<Student> list){
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            int age = stu.getAge();
            if (age<18){
                students.add(stu);
            }
        }
        return students;
    }
}
