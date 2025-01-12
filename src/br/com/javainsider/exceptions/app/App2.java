package br.com.javainsider.exceptions.app;

import br.com.javainsider.exceptions.account.Account2;

public class App2 {

    public static void main(String[] args) {

        Account2 a = new Account2("1234");
        a.deposit(500);
        System.out.println(a);

        int rc = a.withdraw(2000);

        if (rc == -2){
            System.out.println("ERROR: Not enough funds");
        }else if (rc == -1) {
            System.out.println("ERROR: Negative amount");
        }else if (rc == 1) {
            System.out.println("SUCCESS");
            System.out.println(a);
        }

    }

}
