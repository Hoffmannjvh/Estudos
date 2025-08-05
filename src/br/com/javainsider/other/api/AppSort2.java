package br.com.javainsider.other.api;

import br.com.javainsider.other.list.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AppSort2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pedro", 25),
                new Person("Paulo", 40),
                new Person("Joana", 34),
                new Person("Maria", 30),
                new Person("Paulo", 27)
        );

        people.sort(Comparator.comparing(Person::getName).thenComparing(Person::getAge));

        people.forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));

    }
}
