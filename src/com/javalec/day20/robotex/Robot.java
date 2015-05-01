package com.javalec.day20.robotex;

/**
 * Project: wizEx
 * FileName: Robot
 * Date: 2015-05-01
 * Time: 오전 9:51
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public abstract class Robot {

    public Robot() {
    }

    public void actionWalk() {
        System.out.println("걸을 수 있습니다.");
    }

    public void actionRun() {
        System.out.println("달릴 수 있습니다.");
    }

    public void Shape() {
        System.out.println("SuperRobot 로봇입니다. 외형은 팔,다리,몸통,머리가 있습니다.");
    }

    public abstract void actionFly();

    public abstract void actionMisail();

    public abstract void actionKnife();
}
