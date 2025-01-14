package br.com.javainsider.other.wrapper;

public class WrapperApp2 {

    public static void main(String[] args) {

        Integer i = Integer.valueOf(1);
        Integer j = Integer.valueOf("1");
        int k = Integer.parseInt("1");

        Boolean b = Boolean.valueOf(true);
        Boolean c = Boolean.valueOf("true");
        boolean d = Boolean.parseBoolean("true");

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

}
