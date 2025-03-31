package br.com.javainsider.other.account3;

public abstract class Account {

    //Parametros
    public double balance;



    //Construtor
    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    //Metodo
    public void updateBalance() {
        balance += balance * rate();
    }

    public abstract double rate() ;
}
