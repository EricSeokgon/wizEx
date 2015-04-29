package com.javalec.day12.inex;

/**
 * Created by IntelliJ IDEA.
 * User: Hadeslee
 * Date: 2015-04-29
 * Time: 오후 3:50
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {

    public static void main(String[] args) {

        ChildClass childClass=new ChildClass();
        System.out.println(childClass.cStr);

        System.out.println(childClass.getPapaName());
        System.out.println(childClass.getmamiName());
    }
}
