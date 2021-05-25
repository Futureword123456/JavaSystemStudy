package com.array;

/**
 * @Time : 2021/5/18 20:36
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo5.java
 * @Software: IntelliJ IDEA
 **/
public class Demo5 {
    public static void main(String[] args) {
        /**
         * 数组获取最大值或者最小值
         */
        //最大值
        int[] arr = new int[]{80,60,96,98,78,35,61,2,102,6,4,51,586,265,98};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>max){
                max =arr[i];
            }
            if (arr[i]<min){
               min =arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);


    }
}
