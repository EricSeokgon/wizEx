package com.javalec.day29.thread;

/**
 * Project: wizEx
 * FileName: ThreadTest
 * Date: 2015-05-06
 * Time: 오후 1:46
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ThreadTest implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread Test");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
