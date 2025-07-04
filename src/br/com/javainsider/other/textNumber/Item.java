package br.com.javainsider.other.textNumber;


import java.text.NumberFormat;
import java.util.Currency;

public class Item {

    private final String description;
    private final double price;
    private final NumberFormat numberFormat;

    public Item(String description, double price, String currency) {
        this.description = description;
        this.price = price;

        numberFormat = NumberFormat.getCurrencyInstance();
        numberFormat.setCurrency(Currency.getInstance(currency));
    }

    @Override
    public String toString() {
        return String.format("%-15s - %15s", description, numberFormat.format(price));
    }
}
