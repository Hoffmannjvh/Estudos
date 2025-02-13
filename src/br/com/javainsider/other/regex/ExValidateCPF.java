package br.com.javainsider.other.regex;

public class ExValidateCPF {

    public static void main(String[] args) {

        System.out.println(validateCPF("111.111.111-11"));
        System.out.println(validateCPF("11111111111"));
        System.out.println(validateCPF("111 111 111 11"));

    }

    private static boolean validateCPF(String cpf) {

      return cpf.matches("\\d{3}([.\\s])?\\d{3}([.\\s])?\\d{3}([-\\s])?\\d{2}");

    }

}
