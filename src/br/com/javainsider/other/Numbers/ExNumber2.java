package br.com.javainsider.other.Numbers;

public class ExNumber2 {

    public static void main(String[] args) {

        Number2 n1 = Number2.newNumber(10);
        System.out.println(n1.getNumber());

        Number2 n2 = Number2.newNumber(5);
        Number2 n3 = Number2.add(n1, n2);

        System.out.println(n3.getNumber());

        System.out.println(Number2.getInstances());

    }

}
