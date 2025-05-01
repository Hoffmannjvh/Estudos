package br.com.javainsider.other.dateTime;

import java.time.LocalDate;
import java.time.Period;

public class ExDaysSinceBirth {

    public static void main(String[] args) {

        LocalDate birthDate = LocalDate.of(2002, 6,30);
        LocalDate today = LocalDate.now();
        Period period = Period.between(birthDate, today);

        System.out.format("O periodo é de %d anos, %d meses e %d dias", period.getYears(), period.getMonths(), period.getDays());

    }
}
