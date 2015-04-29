package com.javalec.day9.manager;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Hadeslee
 * Date: 2015-04-29
 * Time: 오후 1:15
 * To change this template use File | Settings | File Templates.
 */
public class StudentExpel {

    ArrayList<Student> expelStudent;

    public StudentExpel() {

        expelStudent = new ArrayList<Student>();
    }
    public void addExpelStudent(String name, int age, int studentNem, String major){

        expelStudent.add(new Student(name, age,studentNem,major));
        System.out.println("재적 학생 정보 등록 완료");
    }
}
