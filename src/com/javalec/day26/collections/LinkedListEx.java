package com.javalec.day26.collections;

import java.util.LinkedList;

/**
 * Project: wizEx
 * FileName: LinkedListEx
 * Date: 2015-05-03
 * Time: 오후 11:18
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class LinkedListEx {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("str1");
        linkedList.add("str2");
        linkedList.add("str3");
        linkedList.add("str4");
        System.out.println(linkedList.toString());

        linkedList.add("str5");
        System.out.println(linkedList.toString());

        linkedList.set(2, "STR2");
        System.out.println(linkedList.toString());

        int size = linkedList.size();
        System.out.println("사이즈는 " + size);

        linkedList.remove();
        System.out.println(linkedList.toString());

        linkedList.clear();
        System.out.println(linkedList.toString());

        linkedList = null;
        System.out.println(linkedList);


    }
}
