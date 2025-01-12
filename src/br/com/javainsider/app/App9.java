package br.com.javainsider.app;

import br.com.javainsider.other.Generator.Generator;
import br.com.javainsider.other.Generator.Person;
import br.com.javainsider.other.Generator.SequenceGenerator;


public class App9 {

    public static void main(String[] args) {

        Generator generator = new SequenceGenerator();

        Person p1 = new Person(generator);
        System.out.println(p1.getId());

        Person p2 = new Person(generator);
        System.out.println(p2.getId());

        Person p3 = new Person(generator);
        System.out.println(p3.getId());

    }

}
