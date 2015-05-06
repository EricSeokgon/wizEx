package com.javalec.day28.output;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Project: wizEx
 * FileName: MainClass
 * Date: 2015-05-06
 * Time: 오전 11:13
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args) {

        try {
            OutputStream os = new FileOutputStream("C:\\Users\\sklee\\IdeaProjects\\wizEx\\jaout.txt");
            String str = "오늘 날씨는 아주 좋습니다.";
            byte[] bs = str.getBytes();
            os.write(bs);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
