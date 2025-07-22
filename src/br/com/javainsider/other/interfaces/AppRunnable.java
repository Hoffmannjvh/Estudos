package br.com.javainsider.other.interfaces;

public class AppRunnable {
    public static void main(String[] args) {
        execute(() -> System.out.println("Hi!"));
    }

    private static void execute(Runnable runnable) {
        runnable.run();
    }
}
