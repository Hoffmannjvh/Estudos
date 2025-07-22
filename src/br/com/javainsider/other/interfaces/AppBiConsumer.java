package br.com.javainsider.other.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class AppBiConsumer {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C", "D");

        iterate(list, (i, e) -> System.out.println(i + " -> " + e));

    }

    private static void iterate(List<String> list, BiConsumer<Integer, String> biConsumer){
        for (int i = 0; i <list.size(); i++) {
            biConsumer.accept(i, list.get(i));

        }
    }
}
