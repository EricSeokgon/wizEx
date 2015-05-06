package com.javalec.day28.ioEx;

import java.io.*;
import java.util.InputMismatchException;

/**
 * Project: wizEx
 * FileName: Main3Class
 * Date: 2015-05-06
 * Time: 오후 1:03
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Main3Class {
    public static void main(String[] args) {

        InputStream is = null;
        DataInputStream dis = null;

        OutputStream os = null;
        DataOutputStream dos = null;

        try {
            is = new FileInputStream("C:\\Users\\sklee\\IdeaProjects\\wizEx\\str.txt");
            dis = new DataInputStream(is);
            String str = dis.readUTF();

            os = new FileOutputStream("C:\\Users\\sklee\\IdeaProjects\\wizEx\\str_copy.txt");
            dos = new DataOutputStream(os);
            dos.writeUTF(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (dos != null) {
                try {
                    dos.close();
                } catch (Exception e2) {
                    System.out.println(e2.getMessage());
                }
            }
        }
        if (os != null) {
            try {
                os.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
    }
}
