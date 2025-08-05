package br.com.javainsider.other.api;

import java.util.Arrays;
import java.util.List;

public class AppForEach1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.forEach(System.out::println);

    }
}
