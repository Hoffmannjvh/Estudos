package br.com.javainsider.other.api;

import java.util.HashMap;
import java.util.Map;

public class AppForEach2 {
    public static void main(String[] args) {

        Map<Integer, String> people = new HashMap<>();
        people.put(1, "Pedro");
        people.put(2, "Maria");
        people.put(3, "Paulo");
        people.put(4, "Joana");

        people.keySet().forEach(System.out::println);
        people.values().forEach(System.out::println);

        people.forEach((k, v) -> System.out.println(k + "=> " + v));
    }
}
