package br.com.javainsider.other.set;

import java.util.Objects;

public class AccountOrdering implements Comparable<AccountOrdering> {

    private final String number;
    private final double balance;

    public AccountOrdering(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountOrdering that = (AccountOrdering) o;
        return Double.compare(that.balance, balance) == 0 &&
                Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public int compareTo(AccountOrdering accountOrdering) {
        return this.number.compareTo(accountOrdering.number);
    }
}
