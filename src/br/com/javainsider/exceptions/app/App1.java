package br.com.javainsider.exceptions.app;

import br.com.javainsider.exceptions.account.Account1;

public class App1 {

    public static void main(String[] args) {
        Account1 a = new Account1("1234");
        a.deposit(500);
        System.out.println(a);
        if (! a.withdraw(1000)){
            System.out.println("ERROR: Not enough funds");
        }
        System.out.println(a);
    }

}
