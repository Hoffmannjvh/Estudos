package br.com.javainsider.app;

import br.com.javainsider.other.Strings.StringManipulatorImpl;

public class App7 {

    public static void main(String[] args) {

        StringManipulatorImpl m = new StringManipulatorImpl();
        System.out.println(m.join("ab", "cd"));
        System.out.println(m.takeFirst("java", 2));
        System.out.println(m.upper("java"));

    }

}
