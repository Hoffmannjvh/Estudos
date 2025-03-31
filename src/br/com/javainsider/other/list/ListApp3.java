package br.com.javainsider.other.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListApp3 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C", "D");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println("__________________");

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {

            String s = iter.next();
            System.out.println(s);


        }

    }

}
