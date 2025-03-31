package br.com.javainsider.other.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListApp5 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> list2 = new ArrayList<>(Arrays.asList("C", "D", "E"));

        //list1.addAll(list2);
        //list1.retainAll(list2);
        list1.removeAll(list2);
        System.out.println(list1);

    }

}
