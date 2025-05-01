package br.com.javainsider.other.dateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormatApp {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2000,Calendar.APRIL, 10,0,0,0);

        System.out.println(calendar.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formatted = sdf.format(calendar.getTime());
        System.out.println(formatted);

    }

}
