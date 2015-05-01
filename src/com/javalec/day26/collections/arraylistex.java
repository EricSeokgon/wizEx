package com.javalec.day26.collections;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: hadeslee
 * Date: 2015-05-02
 * Time: 오전 4:39
 * To change this template use File | Settings | File Templates.
 */
public class arraylistex {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("str1");
        arrayList.add("str2");
        arrayList.add("str3");
        arrayList.add("str4");
        System.out.println(arrayList.toString());

        String index3 = arrayList.get(3);
        System.out.println("index3 = " + index3);

        arrayList.set(2, "str2222222");
        System.out.println(arrayList.toString());

        int size = arrayList.size();
        System.out.println("size : " + size);

        arrayList.remove(2);
        System.out.println(arrayList.toString());

        arrayList.clear();
        System.out.println(arrayList.clone());

        arrayList = null;
        System.out.println(arrayList);
        System.out.println(arrayList.size());


    }

}
