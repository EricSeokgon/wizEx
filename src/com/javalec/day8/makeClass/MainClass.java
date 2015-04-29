package com.javalec.day8.makeClass;

import com.javalec.day8.human.WomanClass;

/**
 * Created by IntelliJ IDEA.
 * User: Hadeslee
 * Date: 2015-04-29
 * Time: 오전 11:09
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args) {
        ManClass mc = new ManClass();
        ManClass mc1 = new ManClass(15, 160, 50, "010-5555-3333");

        mc.getAge();
        mc.setAge(16);

        mc.calculateBMI()
    }
}
