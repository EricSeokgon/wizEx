package com.javalec.day11.staticex;

import com.javalec.day11.children.FirstChild;
import com.javalec.day11.children.SecondChild;
import com.javalec.day11.children.ThirdChild;
import com.javalec.day11.papa.PapaPouch;

/**
 * Created by IntelliJ IDEA.
 * User: Hadeslee
 * Date: 2015-04-29
 * Time: 오후 2:51
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args) {
        FirstChild firstChild = new FirstChild();
        firstChild.takeMoney(100);

        SecondChild secondChild = new SecondChild();
        secondChild.takeMoney(100);

        ThirdChild thirdChild = new ThirdChild();
        thirdChild.takeMoney(100);

        System.out.println("PapaPouch.money : " + PapaPouch.MONEY);
    }
}
