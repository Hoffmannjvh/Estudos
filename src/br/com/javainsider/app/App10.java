package br.com.javainsider.app;

import br.com.javainsider.other.pets2.Dog;
import br.com.javainsider.other.pets2.Pet;

public class App10 {

    public static void main(String[] args) throws Exception {

        Pet p = new Dog();
        p.feed();

        if (p instanceof Dog) {
            Dog d = (Dog) p;
            d.sit();
        }else {
            System.out.println("O tipo nao e um dog");
        }
    }
}
