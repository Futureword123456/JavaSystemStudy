package com.StringBuilder;

/**
 * @Time : 2021/5/23 10:21
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo2StringBuilder.java
 * @Software: IntelliJ IDEA
 **/
public class Demo2StringBuilder {
    public static void main(String[] args) {
        /**
         *创建一个空白字符串对象，不含有任何内容
         */
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer);
        /**
         * 根据字符串的内容，来创建可变字符串对象
         */
        StringBuffer stringBuffer1 = new StringBuffer("abc");
        System.out.println(stringBuffer1);
    }
}
