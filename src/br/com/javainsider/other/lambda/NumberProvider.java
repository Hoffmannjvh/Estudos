package br.com.javainsider.other.lambda;

public class NumberProvider {
    private int n;

    public void setN(int n) {
        this.n = n;
    }

    public Number provider() {
        int v = n;
        return () -> v;
    }

    @FunctionalInterface
    public interface Number{
        int get();
    }
}
