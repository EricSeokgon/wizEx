package com.javalec.day19.signletonex;

/**
 * Project: wizEx
 * FileName: SignletonClass
 * Date: 2015-04-30
 * Time: 오후 4:58
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SingletonClass {

    private static SingletonClass SINGLETON_CLASS_INSTANCE = new SingletonClass();
    public int i = 10;

    private SingletonClass() {

    }

    public static SingletonClass getSingletonClass() {

        if (SINGLETON_CLASS_INSTANCE == null) {
            SINGLETON_CLASS_INSTANCE = new SingletonClass();
        }
        return SINGLETON_CLASS_INSTANCE;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
