package br.com.javainsider.other.Strings;

public class StringCompare {

    public static void main(String[] args) {

        String s1 = "bed";
        String s2 = "chair";

        int r1 = s1.compareTo(s2);
        System.out.println(r1);

        int r2 = s2.compareTo(s1);
        System.out.println(r2);

        int r3 = s1.compareTo(s1);
        System.out.println(r3);
    }


}
