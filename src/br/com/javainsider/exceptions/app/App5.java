package br.com.javainsider.exceptions.app;

import br.com.javainsider.exceptions.account.Account3;
import br.com.javainsider.exceptions.account.InsufficientFundsException;

public class App5 {

    public static void main(String[] args) {

        Account3 account = new Account3("1234");
        account.deposit(500);
        System.out.println(account);


        try {
            account.withdraw(600);
            System.out.println(account);

        } catch (InsufficientFundsException | IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
            System.out.println("Stacktrace:");
            e.printStackTrace();
        }

    }
}
