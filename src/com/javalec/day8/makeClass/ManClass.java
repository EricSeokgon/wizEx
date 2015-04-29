package com.javalec.day8.makeClass;

import javax.print.StreamPrintService;
import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 * User: Hadeslee
 * Date: 2015-04-29
 * Time: 오전 11:17
 * To change this template use File | Settings | File Templates.
 */
public class ManClass {

    private int age;
    private int height;
    private int weight;
    private String phoneNum;

    public ManClass() {

    }

    public ManClass(int age, int height, int weight, String phoneNum) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.phoneNum = phoneNum;

    }

    public double calculateBMI() {
        double result = weight / (height * height);
        return result;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
