package br.com.javainsider.other.textNumber;

public class Account {

    private final String number;
    private final String name;
    private final double balance;

    public Account(String number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
       // return number + " " + name + " " + balance;
        return String.format("%-8s\t\t%-20s  \t%.2f",number, name, balance);
    }
}
