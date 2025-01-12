package br.com.javainsider.other.Pets;

public class Dog extends EarthPet {

    @Override
    public void talk() {
        System.out.println("Au-Au");
    }

    @Override
    public void walk() {
        System.out.println("Rápido");
    }

    @Override
    public void sleep(int time) {
        System.out.println("Dog sleeping");
    }
}
