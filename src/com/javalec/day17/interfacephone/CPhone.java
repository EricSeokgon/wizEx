package com.javalec.day17.interfacephone;

/**
 * Project: wizEx
 * FileName: CPhone
 * Date: 2015-04-30
 * Time: 오후 3:18
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CPhone implements IFunction {

    public CPhone() {
        System.out.println("CPhone입니다.");
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
        System.out.println("가능 합니다. 4G입니다.");
    }

    @Override
    public void tvRemoteController() {
        System.out.println("미탑재 되어 있습니다.");

    }
}
