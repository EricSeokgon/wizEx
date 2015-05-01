package com.javalec.day20.robotex;

import com.javalec.day21.robotex.inter.FlyNo;
import com.javalec.day21.robotex.inter.FlyYes;
import com.javalec.day21.robotex.inter.KnifeLazer;
import com.javalec.day21.robotex.inter.MisailYes;

/**
 * Project: wizEx
 * FileName: MainClass
 * Date: 2015-05-01
 * Time: 오전 9:25
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {

    public static void main(String[] args) {

        System.out.println("SuperRobot을 만들어 주세요.");
        Robot superRobot = new SuperRobot();
        superRobot.shape();
        superRobot.actionWalk();
        superRobot.actionRun();

        //superRobot.setFly(new FlyYes());
        superRobot.actionFly();
        //superRobot.setMisail(new MisailYes());
        superRobot.actionMisail();
        //superRobot.setKnife(new KnifeLazer());
        superRobot.actionKnife();


    }

}
