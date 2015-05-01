package com.javalec.day20.robotex;

/**
 * Project: wizEx
 * FileName: LowRobot
 * Date: 2015-05-01
 * Time: 오전 9:48
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class LowRobot extends Robot {

    public LowRobot() {
    }

    @Override
    public void actionFly() {
        System.out.println("날수 없습니다.");
    }

    @Override
    public void actionMisail() {
        System.out.println("미사일 쏠 수 없습니다.");
    }

    @Override
    public void actionKnife() {
        System.out.println("검이 없습니다.");
    }

}
