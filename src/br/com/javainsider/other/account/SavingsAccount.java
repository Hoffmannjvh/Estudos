package br.com.javainsider.other.account;

public class SavingsAccount extends Account2 {
    private Double rate;

    public SavingsAccount(double balance) {
        super(balance);
    }


    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Override
    public void setBalance(Double balance) {
        this.balance = balance * rate;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Rate: " + rate);
    }
}

