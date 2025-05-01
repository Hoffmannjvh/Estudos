package br.com.javainsider.other.dateTime;

import java.util.Calendar;

public class CalendarApp {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2020,Calendar.MARCH,10,14,30,20);

        System.out.println(calendar.getTime());

    }
}
