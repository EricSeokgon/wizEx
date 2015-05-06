package com.javalec.day31.urlconnectionex;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * Project: wizEx
 * FileName: URLConEx
 * Date: 2015-05-06
 * Time: 오후 5:18
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class URLConEx {

    public URLConEx() {

        String code = null;
        System.out.println("웹 주소를 입력 하세요 ex)http://www.googlr.com");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.next();

        try {
            URL url = new URL(address);
            URLConnection con = url.openConnection();
            BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
            FileWriter fw = new FileWriter("C:\\Users\\sklee\\IdeaProjects\\wizEx\\file.html", false);

            while ((code = webData.readLine()) != null) {
                fw.write(code);
            }
            System.out.println("The End");

            fw.close();
            webData.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
