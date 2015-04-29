package com.javalec.day6.methodEx;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: Hadeslee
 * Date: 2015-04-29
 * Time: 오전 10:37
 * To change this template use File | Settings | File Templates.
 */
public class GuGuDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        GuGuDan guGuDan = new GuGuDan();
        guGuDan.gugudan(input);

    }

    public void gugudan(int i) {
        for (int j = 1; j < 10; j++) {
            System.out.println(i + " * " + j + " = " + (i * j));

        }
    }
}
