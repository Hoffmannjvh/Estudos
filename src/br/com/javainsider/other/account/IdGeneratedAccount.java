package br.com.javainsider.other.account;

public class IdGeneratedAccount {

    public static final int INITIAL_VALUE = 10;

    String accountNumber;
    String accountOwner;
    double balance;

    private static int currentId;

    static {
        currentId = INITIAL_VALUE;
    }


    public IdGeneratedAccount(String accountOwner) {
        this.accountNumber = "000" + currentId++;
        this.accountOwner = accountNumber;
        this.balance = 0.0;
    }

    //Deposito da conta
    boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    //Deposito com metodo String
    boolean deposit(String amount) {
        return deposit(Double.parseDouble(amount));
    }


    //Saque da conta
    boolean withdraw(double amount) {

        if (amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    //Transferencia entre contas
    void transfer(double amount, Account targetAccount) {
        withdraw(amount);
        targetAccount.deposit(amount);
    }

    void printBalance() {
        System.out.println("Balance: R$" + balance);
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static int getCurrentId() {
        return currentId;
    }
}
