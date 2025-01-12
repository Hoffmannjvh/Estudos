package br.com.javainsider.other.account;

public class Account2 {

    private String owner;
    private String number;
    protected Double balance;

    public Account2(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void print() {
        System.out.println(
                "Account{" +
                        "owner='" + owner + '\'' +
                        ", number='" + number + '\'' +
                        ", balance=" + balance +
                        '}'
        );
    }
}
