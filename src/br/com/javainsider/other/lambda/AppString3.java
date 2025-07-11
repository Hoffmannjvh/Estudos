package br.com.javainsider.other.lambda;

public class AppString3 {

    public static void main(String[] args) {
        //transformAndPrint(s -> s.toUpperCase(), "Java");
        transformAndPrint(String::toUpperCase, "Java");

    }

    private static void transformAndPrint(TextTransformer transformer, String text) {
        System.out.println(transformer.transform(text));
    }
}
