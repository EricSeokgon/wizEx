package com.javalec.day20.robotex;

/**
 * Project: wizEx
 * FileName: StandardRobot
 * Date: 2015-05-01
 * Time: 오전 9:47
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class StandardRobot extends Robot {

    public StandardRobot() {

    }

    @Override
    public void actionFly() {
        System.out.println("날수 없습니다.");
    }

    @Override
    public void actionMisail() {
        System.out.println("미사일 쏠 수 있습니다.");
    }

    @Override
    public void actionKnife() {
        System.out.println("목검이 있습니다.");
    }


}
