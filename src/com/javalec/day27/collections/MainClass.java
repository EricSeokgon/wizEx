package com.javalec.day27.collections;

import java.util.HashSet;

/**
 * Project: wizEx
 * FileName: MainClass
 * Date: 2015-05-06
 * Time: 오전 10:00
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args) {

        HashSet<Student> hashSet = new HashSet<Student>();
        hashSet.add(new Student("홍길동", 3));
        hashSet.add(new Student("이순신", 6));
        hashSet.add(new Student("장보고", 1));
        System.out.println(hashSet.toString());

        Student student = new Student("이순신", 6);
        hashSet.remove(student);
        System.out.println(hashSet.toString());

    }
}
