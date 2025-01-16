package br.com.javainsider.other.textNumber;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatApp4 {

    public static void main(String[] args) {

        double n = 3456.21;

        Locale locale = new Locale("pt", "BR");

        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String formatted = nf.format(n);

        System.out.println(formatted);
    }
}
