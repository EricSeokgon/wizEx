package com.javalec.day24.timerex;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Project: wizEx
 * FileName: TimerEx
 * Date: 2015-05-01
 * Time: 오후 2:40
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TimerEx {

    public TimerEx() throws InterruptedException {

        System.out.println("^^");
        Timer timer = new Timer(true);
        TimerTask t1 = new ExTimerTask1();
        TimerTask t2 = new ExTimerTask2();

        timer.schedule(t1, 2000); //2초후 실행
        timer.schedule(t2, 10000); //10초후 실행

        Thread.sleep(11000);
        System.out.println("**");

    }
}
