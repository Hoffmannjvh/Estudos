package br.com.javainsider.other.textNumber;

public class FormatApp2 {

    public static void main(String[] args) {

        Account a1 = new Account("12345-6", "Joao Vitor", 150);
        Account a2 = new Account("6512-2", "Carlos Silva", 182.4);
        Account a3 = new Account("894-1", "Janderson Pereira", 486);
        Account a4 = new Account("64654-6", "Joao Correia", 100);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }

}
