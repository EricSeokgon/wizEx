package com.javalec.day29.synchronizedex;

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

    int testNum = 0;

    @Override
    public synchronized void run() {

        for (int i = 0; i < 10; i++) {
            if (Thread.currentThread().getName().equals("A")) {
                System.out.println("=========================");
                testNum++;
            }
            System.out.println("Thread Name : " + Thread.currentThread().getName() + ", testNum : " + testNum);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
