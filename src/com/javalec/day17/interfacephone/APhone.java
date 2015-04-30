package com.javalec.day17.interfacephone;


/**
 * Project: wizEx
 * FileName: APhone
 * Date: 2015-04-30
 * Time: 오후 3:18
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class APhone implements IFunction {

    public APhone() {
        System.out.println("APhone 입니다.");
        callSenderReceive();
        canLte();
        tvRemoteController();
        System.out.println("================");
    }

    @Override
    public void callSenderReceive() {
        System.out.println("가능 합니다.");

    }

    @Override
    public void canLte() {
        System.out.println("불가능 합니다. 3G입니다.");
    }

    @Override
    public void tvRemoteController() {
        System.out.println("미탐재 되어 있습니다.");
    }
}
