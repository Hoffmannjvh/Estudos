package br.com.javainsider.other.Strings;

public class StringIndexOf {

    public static void main(String[] args) {

        String str = "Java is the greatest language!";

        int pos = str.indexOf("the");

        System.out.println(pos);

        int pos2 = str.lastIndexOf("a");
        System.out.println(pos2);
    }

}
