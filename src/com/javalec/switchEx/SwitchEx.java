package com.javalec.switchEx;

import java.util.Scanner;

/**
 * Created by sklee on 2015-04-28.
 */
public class SwitchEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int r = i % 2;

        switch (r) {
            case 0:
                System.out.println("입력하신 숫자는 짝수 입니다.");
                break;
            case 1:
                System.out.println("입력하신 숫자는 홍수 입니다.");
                break;
            default:
                System.out.println("모르겠습니다..");
                break;
        }

    }
}
