package com.javalec.day23.randomex;

import java.util.Random;

/**
 * Project: wizEx
 * FileName: MainClass
 * Date: 2015-05-01
 * Time: 오후 2:12
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args) {

        double d = Math.random();
        System.out.println(d);

        int di = (int) (d * 10);
        System.out.println(di);

        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println(i);
    }
}
