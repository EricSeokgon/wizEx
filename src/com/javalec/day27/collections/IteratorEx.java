package com.javalec.day27.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Project: wizEx
 * FileName: IteratorEx
 * Date: 2015-05-06
 * Time: 오전 10:21
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class IteratorEx {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("str0");
        arrayList.add("str1");
        arrayList.add("str2");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.toString());
        }
    }

}
