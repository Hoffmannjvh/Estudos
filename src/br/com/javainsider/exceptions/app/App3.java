package br.com.javainsider.exceptions.app;

import br.com.javainsider.exceptions.account.Account3;

public class App3 {

    public static void main(String[] args) throws Exception {

        Account3 a = new Account3("1234");
        a.deposit(500);
        System.out.println(a);

        a.withdraw(2000);
        System.out.println(a);

        System.out.println("Success");
    }

}
