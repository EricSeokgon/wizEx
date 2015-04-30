package com.javalec.day19.signletonex;

/**
 * Project: wizEx
 * FileName: FirstClass
 * Date: 2015-04-30
 * Time: 오후 4:59
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class FirstClass {
    public FirstClass() {

        SingletonClass singletonClass = SingletonClass.getSingletonClass();
        System.out.println("FirstClass");
        System.out.println("i = " + singletonClass.getI());
        singletonClass.setI(200);
        System.out.println("i = " + singletonClass.getI());
    }
}

