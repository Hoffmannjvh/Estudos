package br.com.javainsider.other.lambda;

public class ExRunTrueFalse {
    public static void main(String[] args) {
        run(
                "java",
                s -> System.out.println("My language is: " + s),
                () -> System.out.println("My language none")
        );
    }

    public static void run(String s, CodeWithParam codeIfNotNull, CodeWithoutParam codeIfNull) {
        if (s != null) {
            codeIfNotNull.execute(s);
        } else {
            codeIfNull.execute();
        }
    }

    @FunctionalInterface
    interface CodeWithParam{
        void execute(String s);
    }

    @FunctionalInterface
    interface CodeWithoutParam {
        void execute();
    }
}
