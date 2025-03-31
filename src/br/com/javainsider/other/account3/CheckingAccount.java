package br.com.javainsider.other.account3;

public class CheckingAccount extends Account {
    private double rate;

    public CheckingAccount(double rate) {
        super(100);
        this.rate = rate;
    }

    @Override
    public double rate() {
        return rate;
    }
}
