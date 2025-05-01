package br.com.javainsider.other.dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;

import static java.time.ZoneOffset.UTC;

public class InRangeApp {

    public static void main(String[] args) {
        OffsetDateTime start = LocalDate.of(2020,1,1).atStartOfDay().atOffset(UTC);
        OffsetDateTime end = LocalDate.of(2030,12,31).atTime(LocalTime.MAX).atOffset(UTC);

        OffsetDateTime now = OffsetDateTime.now();

        System.out.println(start);
        System.out.println(end);

        System.out.println(inRange(now, start, end));
    }

    private static boolean inRange (OffsetDateTime odt, OffsetDateTime start, OffsetDateTime end) {
        return odt.isEqual(start) || odt.isEqual(end) || odt.isAfter(start) && odt.isBefore(end);
    }
}
