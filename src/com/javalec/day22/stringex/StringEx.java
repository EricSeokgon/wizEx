package com.javalec.day22.stringex;

/**
 * Project: wizEx
 * FileName: StringEx
 * Date: 2015-05-01
 * Time: 오후 1:14
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StringEx {
    public static void main(String[] args) {

        String str1 = "abcdefg";
        String str2 = "HIJKLMN";
        String str3 = "opqrstu";

        System.out.println(str1.concat(str2)); //concat:문자열 연결
        System.out.println(str1.substring(3)); //substring:문자열 자르기
        System.out.println(str1.length());      //lenght:문자열 길이
        System.out.println(str1.toUpperCase()); //toUppercase:대문자로 만들기
        System.out.println(str2.toLowerCase()); //소문자로 만들기
        System.out.println(str1.charAt(3));     //특정위치의 글자 찾기
        System.out.println(str1.indexOf('c'));  //특정문자열의 위치

        String str4 = "abcdefg";
        System.out.println(str1.equals(str4));  //문자열 비교

        String str5 = "abc def ghi";
        System.out.println(str5.trim());        //문자열 공백제거

        System.out.println(str1.replace('a', 'Z'));    //특정문자 변경
        System.out.println(str1.replaceAll("abcd", "ZZZZZZ"));  //특정문자열 변경
        System.out.println(str1);

    }
}
