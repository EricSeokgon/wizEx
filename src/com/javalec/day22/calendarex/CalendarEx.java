package com.javalec.day22.calendarex;

import java.util.Calendar;

/**
 * Project: wizEx
 * FileName: CalendarEx
 * Date: 2015-05-01
 * Time: 오후 1:30
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CalendarEx {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println(year + "년 " + month + "월 " + day + "일");
        System.out.println(hour + "시 " + minute + "분 " + second + "초");


    }
}
