package com.javalec.ifEx;

/**
 * Created by sklee on 2015-04-28.
 */
public class IfEx {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int h = 30;
        int k = 10;

        if (i > j) {
            System.out.println("i가 j보다 " + (i - j) + " 큽니다. ");
        } else {
            System.out.println("j가 i보다 " + (j - i) + " 큽니다. ");
        }
        if ((i + j) == h) {
            System.out.println("i와 h는 감습니다.");
        }else{
            System.out.println("i와 h는 같지 않습니다.");
        }
    }
}
