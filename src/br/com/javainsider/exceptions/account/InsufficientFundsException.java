package br.com.javainsider.exceptions.account;

public class InsufficientFundsException extends Exception {

    private final double CURRENT_BALANCE;

    public InsufficientFundsException(double CURRENT_BALANCE) {
        super("There is no sufficient funds to withdraw");
        this.CURRENT_BALANCE = CURRENT_BALANCE;
    }

    public double getCURRENT_BALANCE() {
        return CURRENT_BALANCE;
    }
}
