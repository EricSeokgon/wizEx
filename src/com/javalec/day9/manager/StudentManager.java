package com.javalec.day9.manager;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Hadeslee
 * Date: 2015-04-29
 * Time: 오후 1:15
 * To change this template use File | Settings | File Templates.
 */
public class StudentManager {

    ArrayList<Student> students = new ArrayList<Student>();
    StudentExpel studentExpel = new StudentExpel();

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        manager.addStudent("홍길동", 22, 20123485, "영극영화");
        manager.addStudent("홍길순", 23, 20113645, "수학과");
        manager.addStudent("이은경", 21, 20133345, "국문과");
        manager.addStudent("김철수", 24, 20103425, "체육과");
        manager.addStudent("김순희", 25, 20093345, "무용과");

        System.out.println(manager.students.get(0).getName());
        System.out.println(manager.students.get(0).getAge());
        System.out.println(manager.students.get(0).getStudentNum());
        System.out.println(manager.students.get(0).getMajor());

        manager.students.get(0).updateInfo(1, "홍길동");

        System.out.println(manager.students.get(0).getName());
    }

    private void addStudent(String name, int age, int studentNum, String major) {

        students.add(new Student(name, age, studentNum, major));
        System.out.println(name + " 학생 정보 입력 성공!!!");
    }
}
