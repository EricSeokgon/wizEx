package com.javalec.day17.interfacephone;

/**
 * Project: wizEx
 * FileName: MainClass
 * Date: 2015-04-30
 * Time: 오후 3:17
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args) {

        //APhone aPhone = new APhone();
        //BPhone bPhone = new BPhone();
        //CPhone cPhone = new CPhone();

        IFunction aPhone = new APhone();
        IFunction bPhone = new BPhone();
        IFunction cPhone = new CPhone();

        int[] iArr = {10, 20, 30};

        IFunction[] iFunctions = {aPhone, bPhone, cPhone};

        for (int i = 0; i < iFunctions.length; i++) {
            iFunctions[i].callSenderReceive();
            iFunctions[i].canLte();
            iFunctions[i].tvRemoteController();
            System.out.println("=================================");

        }
    }
}
