package br.com.javainsider.app;

import br.com.javainsider.other.account.Account2;
import br.com.javainsider.other.account.SavingsAccount;

public class App6 {

    public static void main(String[] args) {
        Account2 a1 = new Account2(0);
        a1.setNumber("1234");
        a1.setOwner("Pedro");
        a1.setBalance(1000.);
        a1.print();

        SavingsAccount a2 = new SavingsAccount(0);
        a2.setNumber("4321");
        a2.setOwner("Joao");
        a2.setRate(1.2);
        a2.setBalance(500.);
        a2.print();
    }

}
