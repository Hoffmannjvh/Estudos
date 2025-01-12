package br.com.javainsider.other.account;

public class Account {

    public String accountNumber;
    public String accountOwner;
    public double balance;


    //Deposito da conta
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    //Deposito com metodo String
    public boolean deposit(String amount) {
        return deposit(Double.parseDouble(amount));
    }


    //Saque da conta
    public boolean withdraw(double amount) {

        if (amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    //Transferencia entre contas
    public void transfer(double amount, Account targetAccount) {
        withdraw(amount);
        targetAccount.deposit(amount);
    }

    public void printBalance() {
        System.out.println("Balance: R$" + balance);
    }
}
