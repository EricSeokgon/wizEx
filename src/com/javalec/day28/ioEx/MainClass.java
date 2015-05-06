package com.javalec.day28.ioEx;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Project: wizEx
 * FileName: MainClass
 * Date: 2015-05-06
 * Time: 오전 10:43
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args) {

        try {
            InputStream is = new FileInputStream("C:\\Users\\sklee\\IdeaProjects\\wizEx\\jain.txt");
            while (true) {
                int i = is.read();
                System.out.println("데이터 : " + i);
                if (i == -1) break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
