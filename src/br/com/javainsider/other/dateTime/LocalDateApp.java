package br.com.javainsider.other.dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateApp {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2050, 1, 1);
        System.out.println(date);

        LocalDate date2 = LocalDate.parse("2050-01-01");
        System.out.println(date2);

        LocalDate date3 = LocalDate.parse("01/01/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(date3);

    }
}
