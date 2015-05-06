package com.javalec.day27.collections;

import java.util.HashSet;

/**
 * Project: wizEx
 * FileName: HashSetEx
 * Date: 2015-05-06
 * Time: 오전 9:55
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class HashSetEx {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("str0");
        hashSet.add("str1");
        hashSet.add("str2");
        hashSet.add("str3");
        hashSet.add("str2");
        System.out.println(hashSet.toString());

        hashSet.remove("str0");
        System.out.println(hashSet.toString());

        int i = hashSet.size();
        System.out.println("사이즈 : " + i);
    }
}
