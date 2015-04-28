package com.sklee.calex;

/**
 * Created by sklee on 2015-04-28.
 */
public class CalculationEx {
    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        int h = 5;

        System.out.println("=== 산술 연산자 ===");
        System.out.println("덧셈 : " + (i + j)); //13
        System.out.println("뺄셈 : " + (i - j)); //7
        System.out.println("곱셈 : " + (i * j)); //30
        System.out.println("나눗셈 : " + (i / j)); //3.33333
        System.out.println("나머지 : " + (i % j)); //1
    }
}
