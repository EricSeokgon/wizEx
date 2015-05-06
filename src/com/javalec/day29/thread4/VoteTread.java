package com.javalec.day29.thread4;

import java.util.Random;

/**
 * Project: wizEx
 * FileName: ThreadTest
 * Date: 2015-05-06
 * Time: 오후 1:46
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class VoteTread implements Runnable {

    int targetNum = 100;
    int sum = 0;
    Random random = new Random();

    @Override
    public void run() {

        StringBuffer sb = new StringBuffer();

        while (true) {
            sum = sum + random.nextInt(10);
            sb.delete(0, sb.toString().length());

            if (sum >= targetNum) {
                sum = 100;
                for (int i = 0; i < sum; i++) {
                    sb.append("*");
                }
                System.out.println(Thread.currentThread().getName() + " 개표율 : " + sum + "\t:" + sb);
                break;
            } else {
                for (int i = 0; i < sum; i++) {
                    sb.append("*");
                }
                System.out.println(Thread.currentThread().getName() + " 개표율 : " + sum + "\t:" + sb);
            }
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
