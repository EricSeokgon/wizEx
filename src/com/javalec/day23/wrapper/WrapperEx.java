package com.javalec.day23.wrapper;

/**
 * Project: wizEx
 * FileName: WrapperEx
 * Date: 2015-05-01
 * Time: 오후 2:27
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class WrapperEx {
    public static void main(String[] args) {

        Integer integer = new Integer(234); //기초데이터를 객체 데이터로 변환
        int i = integer.intValue();  //int i = 234; (기초 데이터)
        System.out.println("i = " + i);

        String str = "123";
        int j = Integer.parseInt(str);  //sting을 int로 변환
        System.out.println(j + 10);
    }
}
