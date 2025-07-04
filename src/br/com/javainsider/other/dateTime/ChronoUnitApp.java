package br.com.javainsider.other.dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitApp {

    public static void main(String[] args) {

        LocalDate start = LocalDate.of(2000, 1, 1);
        LocalDate end = LocalDate.of(2000, 12, 31);
        System.out.println(ChronoUnit.DAYS.between(start, end));
        System.out.println(ChronoUnit.MONTHS.between(start, end));
        System.out.println(ChronoUnit.YEARS.between(start, end));

        LocalTime newTime = ChronoUnit.HOURS.addTo(LocalTime.of(12, 0, 0), 3);

        System.out.println(newTime);

    }
}
