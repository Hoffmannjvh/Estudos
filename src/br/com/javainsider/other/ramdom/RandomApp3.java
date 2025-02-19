package br.com.javainsider.other.ramdom;

import java.util.UUID;

public class RandomApp3 {
    public static void main(String[] args) {

        UUID id = UUID.randomUUID();
        String s = id.toString();
        System.out.println(s);

    }

}
