package br.com.javainsider.other.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeApp {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2000, 1, 1);
        LocalTime time = LocalTime.of(16, 45);

        LocalDateTime ldt1 = LocalDateTime.of(date, time);
        LocalDateTime ldt2 = LocalDateTime.of(2000, 1, 1, 16, 45);
        LocalDateTime ldt3 = date.atTime(time);
        LocalDateTime ldt4 = time.atDate(date);
        String formattedDateTime = ldt4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));


        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
        System.out.println(ldt4);
        System.out.println(formattedDateTime);

    }

}
