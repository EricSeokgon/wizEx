package com.javalec.day27.collections;

import com.javalec.day22.stringBuilderex.StringBuilderEx;

/**
 * Project: wizEx
 * FileName: Student
 * Date: 2015-05-06
 * Time: 오전 10:00
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Student {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " : " + grade;
    }

    @Override
    public boolean equals(Object obj) {
        String compareValue = obj.toString();
        String thisValue = toString();
        return thisValue.equals(compareValue);
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}
