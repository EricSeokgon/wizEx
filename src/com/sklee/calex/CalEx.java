package com.sklee.calex;

import java.util.Scanner;

/**
 * Created by sklee on 2015-04-28.
 */
public class CalEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println("i를 3으로 나누어서 나머지가 0이 나오면 사용자가 입력한 숫자는 3의 배수입니다.");

        System.out.println("i % 3 = " + (i % 3));
    }
}
