package com.javalec.ifelseif;

/**
 * Created by sklee on 2015-04-28.
 */
public class Ifelseid {
    public static void main(String[] args) {
        int busanLunchPrice = 5000;
        if (busanLunchPrice >= 9000) {
            System.out.println("부산 물가 많이 비싸네요");
        } else if (busanLunchPrice >= 7000) {
            System.out.println("부산 ㅁ루가 조금 비싸네요");
        } else if (busanLunchPrice >= 5000) {
            System.out.println("부산 물가 적당 하네요");
        } else {
            System.out.println("부산 물가 저렴 하네요");
        }
    }
}
