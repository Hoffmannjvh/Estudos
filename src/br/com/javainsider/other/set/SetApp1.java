package br.com.javainsider.other.set;

import java.util.HashSet;
import java.util.Set;

public class SetApp1 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("E");
        set.add("I");
        set.add("O");
        set.add("U");

        for(String s : set) {
            System.out.println(s);
        }
    }

}
