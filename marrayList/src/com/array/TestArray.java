package com.array;

import com.domain.Student;

/**
 * @Time : 2021/5/23 15:40
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : TestArray.java
 * @Software: IntelliJ IDEA
 **/
public class TestArray {
    public static void main(String[] args) {
        //定义一个对象数组，数组长度为3
        Student[] arr = new Student[3];
        Student stu1 = new Student("杨华钟",23);
        Student stu2 = new Student("杨华钟1",24);
        Student stu3 = new Student("杨华钟2",22);
        //把对象添加到数组内容中
        arr[0]=stu1;
        arr[1]=stu2;
        arr[2]=stu3;

        for (int i = 0; i < arr.length; i++) {
            //得到一个学生对象stu
            Student stu = arr[i];
            //利用学生对象进行取出值
            System.out.println(stu.getName()+"*****"+stu.getAge());
        }
    }
}
