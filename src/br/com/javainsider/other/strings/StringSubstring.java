package br.com.javainsider.other.strings;

public class StringSubstring {

    public static void main(String[] args) {

        String str = "java is the greatest language!";

        String subs1 =  str.substring(4).trim();
        System.out.println(subs1);

        String subs2 =  str.substring(4,str.length() - 1);
        System.out.println(subs2);
    }

}
