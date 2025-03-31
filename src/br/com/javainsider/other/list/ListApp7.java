package br.com.javainsider.other.list;

import java.util.*;

public class ListApp7 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(6, 5, 7, 1, 3, 2, 4));
        list.sort(new DescendingComparator());
        System.out.println(list);

        list.sort(new DescendingComparator().reversed());
        System.out.println(list);

        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);

    }

}
