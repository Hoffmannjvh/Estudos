package br.com.javainsider.other.interfaces;

import java.util.function.Function;

public class AppFunction {
    public static void main(String[] args) {
        Person p1 = new Person("Pedro", "Silva");
        System.out.println(map(p1, Person::getFirstName));
        System.out.println(map(p1, Person::getLastName));
        System.out.println(map(p1, p -> p.getFirstName() + " " + p.getLastName()));
    }

    private static String map(Person person, Function<Person, String> function) {
        return function.apply(person);

    }

    static class Person {
        private final String firstName;
        private final String lastName;

        public String getLastName() {
            return lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
}
