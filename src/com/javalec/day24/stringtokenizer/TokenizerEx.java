package com.javalec.day24.stringtokenizer;

import java.util.StringTokenizer;

/**
 * Project: wizEx
 * FileName: TokenizerEx
 * Date: 2015-05-01
 * Time: 오후 2:58
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TokenizerEx {
    public static void main(String[] args) {

        String str1 = "오늘 날씨는 춥고, 눈이 많이 오고 있습니다.";
        String str2 = "2014/12/25";

        System.out.println(str1);
        System.out.println(str2);

        StringTokenizer tokenizer1 = new StringTokenizer(str1);
        StringTokenizer tokenizer2 = new StringTokenizer(str2,"/");

        System.out.println("tokenizer1 문자열 수 : " + tokenizer1.countTokens());
        System.out.println("tokenizer2 문자열 수 : " + tokenizer2.countTokens());

        while (tokenizer1.hasMoreTokens()) {
            System.out.println(tokenizer1.nextToken());
        }

        while (tokenizer2.hasMoreTokens()) {
            System.out.println(tokenizer2.nextToken());
        }

    }
}
