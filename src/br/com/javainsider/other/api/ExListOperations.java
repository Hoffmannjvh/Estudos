package br.com.javainsider.other.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExListOperations {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 6, 2, 4, 9, 7, 1, 5, 8, 0));
        numbers.replaceAll(n -> n + 2); // Soma por 2
        numbers.removeIf(n -> n % 2 ==0); // Remove números pares
        numbers.sort(Comparator.reverseOrder()); // Ordena em ordem decrescente
        numbers.forEach(System.out::println);
    }
}
