package br.com.javainsider.other.lambda;

public class AppClosure3 {

    public static void main(String[] args) {
        NumberProvider p = new NumberProvider();

        p.setN(1);
        NumberProvider.Number n1 = p.provider();

        p.setN(10);
        NumberProvider.Number n2 = p.provider();
        System.out.println(n1.get());
        System.out.println(n2.get());

    }
}
