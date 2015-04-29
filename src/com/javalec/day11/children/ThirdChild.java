package com.javalec.day11.children;

import com.javalec.day11.papa.PapaPouch;

/**
 * Created by IntelliJ IDEA.
 * User: Hadeslee
 * Date: 2015-04-29
 * Time: 오후 2:43
 * To change this template use File | Settings | File Templates.
 */
public class ThirdChild {

    public ThirdChild() {

    }

    public void takeMoney(int money) {

        PapaPouch.MONEY = PapaPouch.MONEY - money;
        if (PapaPouch.MONEY < 0) System.out.println("셋째는 돈이 없어 못 받았어요. ㅜㅜ");
    }
}
