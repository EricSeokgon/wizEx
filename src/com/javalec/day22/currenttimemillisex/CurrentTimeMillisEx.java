package com.javalec.day22.currenttimemillisex;

/**
 * Project: wizEx
 * FileName: CurrentTimeMillisEx
 * Date: 2015-05-01
 * Time: 오후 1:51
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CurrentTimeMillisEx {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());

        String str = "A";
        long starNum = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {
            str = str + "A";
        }

        long endNum = System.currentTimeMillis();
        System.out.println("String 경과 시간 " + (endNum - starNum));

        System.out.println(System.currentTimeMillis());
        StringBuilder stringBuilder = new StringBuilder("A");

        long startNum1 = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {
            stringBuilder = stringBuilder.append("A");
        }

        long endNum1 = System.currentTimeMillis();
        System.out.println("StringBuilder 경과 시간 " + (endNum1 - startNum1));

    }
}
