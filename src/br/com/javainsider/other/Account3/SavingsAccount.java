package br.com.javainsider.other.Account3;

public class SavingsAccount  extends Account {

 public SavingsAccount(double balance) {
     super(balance);
 }

    @Override
    public double rate() {
        return 0.05;
    }


}
