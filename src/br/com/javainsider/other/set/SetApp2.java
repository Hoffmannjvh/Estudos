package br.com.javainsider.other.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetApp2 {

    public static void main(String[] args) {

        Account a1 = new Account("123", 100);
        Account a2 = new Account("456", 200);
        Account a3 = new Account("456", 200);

        Set<Account> accounts = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(a1, a2, a3)));

        for (Account account : accounts ) {
            System.out.println(account);
        }
    }

}
