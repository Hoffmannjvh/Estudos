package br.com.javainsider.other.list;

import java.util.Arrays;
import java.util.List;

public class ListApp2 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C", "D");

        for (String s: list) {
            System.out.println(s);
        }

    }

}
