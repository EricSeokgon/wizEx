package com.javalec.day24.timerex;

import java.util.TimerTask;

/**
 * Project: wizEx
 * FileName: ExTimerTask2
 * Date: 2015-05-01
 * Time: 오후 2:43
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ExTimerTask2 extends TimerTask {

    @Override
    public void run() {
        System.out.println("ExTimerTask2 : 이곳의 작업이 실행 됩니다.");
    }
}
