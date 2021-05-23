package com.StringBuilder;

/**
 * @Time : 2021/5/23 13:35
 * @Author : Yang Huazhong
 * @Email : 2635681517@qq.com
 * @File : Demo5StringBuilder.java
 * @Software: IntelliJ IDEA
 **/
public class Demo5StringBuilder {
    public static void main(String[] args) {
        /**
         * 把 int[] arr={1,2,3}转换为[1,2,3]
         */
        int[] arr= new int[]{1, 2, 3};

        long start1 = System.currentTimeMillis();//获取的毫秒值，1秒=1000毫秒
        String s = arrtoArray(arr);
        System.out.println(s);
        long end1 = System.currentTimeMillis();
        System.out.println(end1- start1);

    }
    public static String arrtoArray(int[]arr){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                stringBuffer.append(i).append("]");
            }
            else {
                stringBuffer.append(i).append(", ");
            }
        }
        return stringBuffer.toString();
    }
}
