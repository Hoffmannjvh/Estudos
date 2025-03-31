package br.com.javainsider.other.list;

import java.util.*;

public class ListApp6 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(6, 5, 7, 1, 3, 2, 4));
        Collections.sort(list);
        System.out.println(list);

    }

}
