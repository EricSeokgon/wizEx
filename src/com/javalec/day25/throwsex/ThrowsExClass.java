package com.javalec.day25.throwsex;

/**
 * Project: wizEx
 * FileName: ThrowsExClass
 * Date: 2015-05-01
 * Time: 오후 3:51
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class ThrowsExClass {
    public ThrowsExClass() {
        actionC();
    }

    private void acttionA() throws Exception {
        System.out.println("actionA");

        int[] iArr = {1, 2, 3, 4};
        System.out.println(iArr[4]);

        System.out.println("actionAA");
    }

    private void actionB() {
        System.out.println("actionB");

        try {
            acttionA();
        } catch (Exception e) {
            System.out.println("예외는 여기서 처리 할게요.^^");
            System.out.println(e.getMessage());
        }
        System.out.println("actionBB");
    }

    private void actionC() {
        System.out.println("actionC");
        actionB();
        System.out.println("actionC");

    }


}
