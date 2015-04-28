package com.javalec.calex;

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

        System.out.println("=== 자동증감 연산자 ===");
        i++; //i = i* 1
        System.out.println("증가 : " + i);
        j--; //j=j-i
        System.out.println("감소 :" + j);

        System.out.println("=== 동등비교 관계 연산자 ===");
        System.out.println("i == j >> " + (i == j));
        System.out.println("i != j >> " + (i != j));
        System.out.println("i > j >> " + (i > j));
        System.out.println("i < j >> " + (i < j));

        System.out.println(" === 논리 연산자 ===");
        System.out.println("&&(AND) >> " + (i > j && i > h));
        System.out.println("&&(AND) >> " + (i > j && i < h));
        System.out.println("||(OR) >> " + (i > j || i < h));
        System.out.println("||(OR) >> " + (i > j || i > h));

        System.out.println(" === 삼항 연산자 ===");
        int result = h != 5 ? 1 : 2;
        System.out.println("삼항연산 결과(result) " + result);

        System.out.println(" === 할당 연산자 ===");
        System.out.println("h = " + h);
        h = i;
        System.out.println("h = " + h);

        System.out.println(" === 줄여 쓰는 연산자 ===");
        i = i + 100;
        System.out.println(" i = " + i);
        i = 11;
        System.out.println(" i = " + i);
        i += 100; //i+=100;
        System.out.println(" i = " + i);


    }
}
