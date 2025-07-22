package br.com.javainsider.other.interfaces;

import java.util.function.Supplier;

public class AppSupplier {
    public static void main(String[] args) {
       int n1 = generate(() -> 1);
        System.out.println(n1);
    }

    private static int generate(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
