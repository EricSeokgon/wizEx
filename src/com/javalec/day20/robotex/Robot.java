package com.javalec.day20.robotex;

import com.javalec.day21.robotex.inter.IFly;
import com.javalec.day21.robotex.inter.IKnife;
import com.javalec.day21.robotex.inter.IMisail;

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

    IFly fly;
    IMisail misail;
    IKnife knife;


    public Robot() {
    }

    public void actionWalk() {
        System.out.println("걸을 수 있습니다.");
    }

    public void actionRun() {
        System.out.println("달릴 수 있습니다.");
    }

    public abstract void shape();

    public void setFly(IFly fly) {
        this.fly = fly;
    }

    public void setMisail(IMisail misail) {
        this.misail = misail;
    }

    public void setKnife(IKnife knife) {
        this.knife = knife;
    }

    public void actionFly() {
        this.fly.fly();
    }

    public void actionMisail() {
        this.misail.misail();
    }

    public void actionKnife() {
        this.knife.knife();
    }
}
