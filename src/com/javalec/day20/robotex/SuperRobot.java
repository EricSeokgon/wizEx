package com.javalec.day20.robotex;


import com.javalec.day21.robotex.inter.FlyYes;
import com.javalec.day21.robotex.inter.KnifeLazer;
import com.javalec.day21.robotex.inter.MisailYes;

/**
 * Project: wizEx
 * FileName: SuperRobot
 * Date: 2015-05-01
 * Time: 오전 9:26
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class SuperRobot extends Robot {

    public SuperRobot() {

        fly = new FlyYes();
        misail = new MisailYes();
        knife = new KnifeLazer();

    }

    @Override
    public void shape() {
        System.out.println("SuperRobot 로봇입니다. 외형은 팔,다리,몸통,머리가 있습니다.");
    }
}
