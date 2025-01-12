package br.com.javainsider.app;

public class App11 {

    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();

        for (char c = 'A'; c <= 'Z'; c++) {
            s.append(c);
        }

        System.out.println(s);
    }

}
