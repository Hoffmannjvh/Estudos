package br.com.javainsider.other.list;

import java.util.*;

public class ListApp8 {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Maria", 45),
                new Person("Paulo", 36),
                new Person("Pedro", 40)
        ));

        //Collections.sort(people);
        people.sort(Comparator.comparing(Person::getName));

        for (Person p : people) {
            System.out.format("==> %s\n", p);
        }
    }

}
