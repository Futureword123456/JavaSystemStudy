package com.StringBuilder;

/**
 * @Time : 2021/5/23 10:35
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo3StringBuilder.java
 * @Software: IntelliJ IDEA
 **/
public class Demo3StringBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("长江大学").append("欢迎你").append("杨华钟");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.toString());

    }
}
