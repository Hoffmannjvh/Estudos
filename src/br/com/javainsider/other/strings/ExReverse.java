package br.com.javainsider.other.strings;

import java.util.Scanner;

public class ExReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.println(new StringBuilder(texto).reverse());

    }

}
