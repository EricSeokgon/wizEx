package com.javalec.day19.signletonex;

/**
 * Project: wizEx
 * FileName: SecondClass
 * Date: 2015-04-30
 * Time: 오후 4:59
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SecondClass {
    public SecondClass() {
        SingletonClass singletonClass = SingletonClass.getSingletonClass();
        System.out.println("SecondClass");
        System.out.println("i = " + singletonClass.getI());
    }
}
