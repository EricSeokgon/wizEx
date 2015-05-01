package com.javalec.day25.exception;

/**
 * Project: wizEx
 * FileName: MainClass
 * Date: 2015-05-01
 * Time: 오후 3:21
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {

    public static void main(String[] args) {

        int i = 10;
        int j = 0;

        System.out.println(i * j);

        try {
            System.out.println(i / j);
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(i + j);
        System.out.println(i - j);


    }
}
