package com.javalec.day29.thread2;

/**
 * Project: wizEx
 * FileName: MainClass
 * Date: 2015-05-06
 * Time: 오후 1:45
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args) {

        ThreadTest threadTest = new ThreadTest();
        threadTest.setName("A");
        threadTest.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println("MainClass");
    }
}
