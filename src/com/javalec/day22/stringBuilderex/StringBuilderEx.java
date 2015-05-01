package com.javalec.day22.stringBuilderex;

/**
 * Project: wizEx
 * FileName: StringBuilderEx
 * Date: 2015-05-01
 * Time: 오후 1:25
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StringBuilderEx {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("abcdefg");

        stringBuilder.append("hijklmn");    //문자열 추가
        System.out.println(stringBuilder);

        stringBuilder.insert(3, "AAA");     //특정 위치에 문자열추가
        System.out.println(stringBuilder);

        stringBuilder.delete(3, 5);         //문자열 삭제
        System.out.println(stringBuilder);

        stringBuilder.deleteCharAt(10);     //특정 문자 하나 삭제
        System.out.println(stringBuilder);

    }
}
