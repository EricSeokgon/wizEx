package com.javalec.day9.manager;

/**
 * Created by IntelliJ IDEA.
 * User: Hadeslee
 * Date: 2015-04-29
 * Time: 오후 1:15
 * To change this template use File | Settings | File Templates.
 */
public class Student {

    private String name;
    private int age;
    private int studentNum;
    private String major;

    public Student(String name, int age, int studentNum, String major) {
        this.name = name;
        this.age = age;
        this.studentNum = studentNum;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
