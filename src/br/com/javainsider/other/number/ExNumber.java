package br.com.javainsider.other.number;

import java.util.Scanner;

public class ExNumber {

    public static void main(String[] args) {

        int n = askNumber();

        System.out.println("Binary: " + Integer.toBinaryString(n));
        System.out.println("Hex: " + Integer.toHexString(n));
        System.out.println("Octal: " + Integer.toOctalString(n));

    }

    private static int askNumber(){
        Scanner scanner = new Scanner(System.in);

        while (true)
        try {
            System.out.print("Number: ");
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException ignored) {
        }
    }
}
