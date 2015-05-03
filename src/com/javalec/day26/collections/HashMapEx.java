package com.javalec.day26.collections;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Project: wizEx
 * FileName: HashMapEx
 * Date: 2015-05-03
 * Time: 오후 11:52
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(0, "str0");
        hashMap.put(1, "str1");
        hashMap.put(2, "str2");
        hashMap.put(3, "str3");
        System.out.println(hashMap.toString());

        String str = hashMap.get(2);
        System.out.println(hashMap.toString());

        hashMap.remove(2);
        System.out.println(hashMap.toString());

        hashMap.clear();
        System.out.println(hashMap.toString());

        hashMap.put(0, "str0");
        hashMap.put(1, "str1");
        hashMap.put(2, "str2");
        hashMap.put(3, "str3");
        System.out.println(hashMap.toString());

        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String string = hashMap.get(iterator.next());
            System.out.println(string);
        }


    }
}
