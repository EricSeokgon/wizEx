package com.javalec.day29.thread3;

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

        ThreadTest threadTest0 = new ThreadTest();
        ThreadTest threadTest1 = new ThreadTest();

        Thread thread0 = new Thread(threadTest0, "A");
        Thread thread1 = new Thread(threadTest1, "B");

        thread0.start();
        thread1.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println("MainClass");
    }
}
