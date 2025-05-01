package br.com.javainsider.other.dateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class TruncateApp {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
        time = time.truncatedTo(ChronoUnit.SECONDS);

        System.out.println(time);

    }

}
