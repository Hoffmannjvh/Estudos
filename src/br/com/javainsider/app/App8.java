package br.com.javainsider.app;

import br.com.javainsider.other.pets.Cat;
import br.com.javainsider.other.pets.Dog;

public class App8 {

    public static void main(String[] args) {

        Dog p1 = new Dog();
        p1.feed(10);
        p1.feed(5);
        System.out.println(p1.getAmountEaten());

        Cat p2 = new Cat();
        p2.feed(5);
        p2.feed(9);
        System.out.println(p2.getAmountEaten());

//        Pet p3 = new Pet();
//        p3.feed(10);
//        System.out.println(p3.getAmountEaten());

    }

}
