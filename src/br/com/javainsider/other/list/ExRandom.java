package br.com.javainsider.other.list;

import java.util.*;

public class ExRandom {

    private static Random random = new Random();

    public static void main(String[] args) {

        System.out.println(generate(10));

    }

    private static List<Integer> generate(int number) {
        List<Integer> numbers = new ArrayList<>(number);
        for (int i = 0; i < number; i++) {
            numbers.add(random.nextInt(101));
        }

        numbers.sort(Comparator.naturalOrder());

        return Collections.unmodifiableList(numbers);

    }
}
