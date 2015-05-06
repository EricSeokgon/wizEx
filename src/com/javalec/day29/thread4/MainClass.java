package com.javalec.day29.thread4;

/**
 * Project: wizEx
 * FileName: MainClass
 * Date: 2015-05-06
 * Time: 오후 1:45
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args) {

        VoteTread voteLocation1 = new VoteTread();
        VoteTread voteLocation2 = new VoteTread();
        VoteTread voteLocation3 = new VoteTread();

        Thread location1 = new Thread(voteLocation1, "Location1");
        Thread location2 = new Thread(voteLocation2, "Location2");
        Thread location3 = new Thread(voteLocation3, "Location3");

        location1.start();
        location2.start();
        location3.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println("MainClass");
    }
}
