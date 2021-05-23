package com.test;

/**
 * @Time : 2021/5/20 20:46
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : TestPhone.java
 * @Software: IntelliJ IDEA
 **/
public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        //phone.brand = "华为";
        phone.setPrice(100);
        phone.setBrand("华为");
        phone.show();

//        phone.call("杨华钟");
//        phone.sendMessage();


    }
}
