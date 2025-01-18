package br.com.javainsider.other.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp1 {

    public static void main(String[] args) {
        printMatchs("uidhawhuia432wd323jnadw", "\\d([a-z])+");
    }

    private static void printMatchs(String text, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.format("%d -> '%s' \n", m.start(), m.group());
        }
    }
}
