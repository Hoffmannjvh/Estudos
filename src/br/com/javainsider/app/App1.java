package br.com.javainsider.app;

import br.com.javainsider.other.account.*;

public class App1 {

    public static void main(String[] args) {

        Account a1 = new Account();

        a1.accountNumber = "1234-5";
        a1.accountOwner = "Joao Vitor Hoffmann";
        a1.balance = 100.00;


        Account a2 = new Account();

        a2.accountNumber = "6542-1";
        a2.accountOwner = "Pedro";
        a2.balance = 200.00;

        System.out.println(a1.accountNumber);
        System.out.println(a1.accountOwner);
        System.out.println(a1.balance);
        System.out.println("--------------");
        System.out.println(a2.accountNumber);
        System.out.println(a2.accountOwner);
        System.out.println(a2.balance);

    }
}
