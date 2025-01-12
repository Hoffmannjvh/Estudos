package br.com.javainsider.other.Clock;

public class ExWatch {

    public static void main(String[] args) {

        Watch w = new Watch();
        w.setTime(11, 30, 40);

        System.out.println(w.readHour() + ":" + w.readMinute() + ":" + w.readSecond());

        System.out.println(w.hour);
        System.out.println(w.minute);
        System.out.println(w.second);

    }

}
