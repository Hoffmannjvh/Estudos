package br.com.javainsider.other.account;

public class EncapsulatedAccount {

    private final String accountNumber;
    private final String accountOwner;
    private double balance;


    public EncapsulatedAccount(String accountNumber, String accountOwner, double balance) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public EncapsulatedAccount(String accountNumber) {
        this(accountNumber, null, 0.);
    }

    public EncapsulatedAccount(String accountNumber, String accountOwner) {
        this(accountNumber, accountOwner, 0);
    }

    public EncapsulatedAccount(String accountNumber, double balance) {
        this(accountNumber, null, balance);
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

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public double getBalance() {
        return balance;
    }

}
