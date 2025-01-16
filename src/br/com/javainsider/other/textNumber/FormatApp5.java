package br.com.javainsider.other.textNumber;

import java.text.NumberFormat;
import java.util.Currency;

public class FormatApp5 {

    public static void main(String[] args) {

        double n = 4545456.21;

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        nf.setGroupingUsed(false);
        nf.setMinimumFractionDigits(4);
        nf.setMaximumFractionDigits(4);
        nf.setCurrency(Currency.getInstance("EUR"));

        System.out.println(nf.format(n));

    }

}
