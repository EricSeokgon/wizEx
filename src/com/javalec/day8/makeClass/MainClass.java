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
        WomanClass wc = new WomanClass();
        WomanClass wc1 = new WomanClass();
        System.out.println(wc.equals(wc1));
    }
}
