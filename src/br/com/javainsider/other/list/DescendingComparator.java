package br.com.javainsider.other.list;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return -o1.compareTo(o2);
    }
}
