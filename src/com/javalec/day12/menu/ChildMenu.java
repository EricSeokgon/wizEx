package com.javalec.day12.menu;

/**
 * Created by IntelliJ IDEA.
 * User: Hadeslee
 * Date: 2015-04-29
 * Time: 오후 4:03
 * To change this template use File | Settings | File Templates.
 */
public class ChildMenu extends ParentMenu {
    public ChildMenu() {

    }

    private void makeBeefChungGukJang() {
        System.out.println("쇠고기 청국장");
    }

    public void makeHotDoenJangGuk(){
        System.out.println("얼큰 된장국");
    }

    public void makeKongNaMool(){
        System.out.println("콩나물국");
    }

    public void makeChungGukJang(){
        System.out.println("냄세 없는 청국장");
    }

}
