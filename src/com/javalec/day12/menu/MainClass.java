package com.javalec.day12.menu;

/**
 * Created by IntelliJ IDEA.
 * User: Hadeslee
 * Date: 2015-04-29
 * Time: 오후 4:02
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args) {
        ChildMenu childMenu = new ChildMenu();
        childMenu.makeChungGukJang();
        childMenu.makeHotDoenJangGuk();
        childMenu.makeKongNaMool();
        childMenu.makeDoenJangGuk();
        childMenu.makeSoybean();
        childMenu.makeGalbijjim();
    }
}
