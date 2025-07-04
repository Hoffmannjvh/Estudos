package br.com.javainsider.other.regex;

import java.util.Scanner;

public class Photo {

    private final int sequence;
    private final int year;
    private final String city;

    public Photo(int sequence, int year, String city) {
        this.sequence = sequence;
        this.year = year;
        this.city = city;
    }

    public int getSequence() {
        return sequence;
    }

    public int getYear() {
        return year;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "sequence=" + sequence +
                ", year=" + year +
                ", city='" + city + '\'' +
                '}';
    }

    public static Photo createFromFileName(String filename){
        Scanner scanner = new Scanner(filename);
        scanner.useDelimiter("[-.]");

        int sequence = Integer.parseInt(scanner.next().replaceAll("\\D", ""));
        int year  = scanner.nextInt();
        String city = scanner.next().replaceAll("_", " ");
        return new Photo(sequence, year, city);
    }
}
