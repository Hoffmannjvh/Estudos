package br.com.javainsider.other.set;


import java.util.Set;
import java.util.TreeSet;

public class SetApp3 {

    public static void main(String[] args) {

        Set<AccountOrdering> set = new TreeSet<>( new AccountComparator());
        set.add(new AccountOrdering("431", 100));
        set.add(new AccountOrdering("111", 200));
        set.add(new AccountOrdering("678", 300));

        System.out.println(set);

    }

}
