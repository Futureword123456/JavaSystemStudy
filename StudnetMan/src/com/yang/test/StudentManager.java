package com.yang.test;

import com.yang.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Time : 2021/5/25 15:32
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : StudentManager.java
 * @Software: IntelliJ IDEA
 **/
public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //添加学生容器对象
        ArrayList<Student> list = new ArrayList<>();

        lo:
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择:");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    //System.out.println("2 删除学生");
                    deleteStudent(list);
                    break;
                case "3":
                    //System.out.println("3 修改学生");
                    updateStudent(list);
                    break;
                case "4":
                    //System.out.println("4 查看学生");
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("感谢你的使用");
                    break lo;
                default:
                    System.out.println("你输入的数据有误");
                    break;
            }
        }
    }

    //修改学生信息（根据学号进行修改）
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        //1、给出提示（输入学号）
        System.out.println("输入需要修改的学生学号");
        //2、调用getIndex方法, 查找该学号在集合中出现的索引位置
        String sid = sc.next();
        int index = getIndex(list, sid);
        //3、根据索引判断, 学号在集合中是否存在
        if (index == -1) {
            System.out.println("查无信息, 请重新输入");
        }else {
            //调用set方法进行学生信息的修改
            System.out.println("输入新的姓名");
            String newName = sc.next();
            System.out.println("输入新的学生学号");
            String newSid = sc.next();
            System.out.println("输入新的年龄");
            int newAge = sc.nextInt();
            System.out.println("输入新的生日");
            String newBirthday = sc.next();
            Student stu = new Student(newName,newSid,newAge,newBirthday);
            list.set(index, stu);
            System.out.println("修改成功");
        }


    }

    //删除学生信息
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        //1、给出提示
        System.out.println("请输入你要删除的学生学号：");
        //2、键盘接收输入的学号
        String sid = sc.next();

        //3、调用getIndex()方法判断学号是否存在，存在就调用remove()方法删除
        int index = getIndex(list, sid);
        if (index == -1) {
            System.out.println("学号不存在，请重新输入");
        } else {
            list.remove(index);
            //Student stu = list.get(index);
            System.out.println("删除成功");
        }

    }

    public static void queryStudent(ArrayList<Student> list) {
        // 1. 判断集合中是否存在数据, 如果不存在直接给出提示
        if (list.size() == 0) {
            System.out.println("无信息，请添加后查看");
            return;
        }
        // 2. 存在: 展示表头数据
        System.out.println("ID\t姓名\t\t学号\t\t年龄\t\t生日");
        // 3. 遍历集合, 获取每一个学生对象的信息, 打印在控制台
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(i + "\t" + stu.getName() + "\t\t" + stu.getSid() + "\t" + stu.getAge() + "岁\t\t" + stu.getBirthday());
        }
    }

    //添加学生方法
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        // 1. 给出录入的提示信息
        // 2. 将键盘录入的信息封装为学生对象
        String sid;
        while (true){
            System.out.println("请输入学生学号：");
            sid = sc.next();
            int index = getIndex(list, sid);
            if (index!=-1){
                //学号不重复可以继续输入
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生生日：");
        String birthday = sc.next();
        // 3. 将封装好的学生对象, 添加到集合容器当中
        Student stu = new Student(name, sid, age, birthday);
        // 4. 给出添加成功的提示信息
        list.add(stu);
        System.out.println("添加学生成功！");

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
