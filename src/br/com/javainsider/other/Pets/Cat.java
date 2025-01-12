package br.com.javainsider.other.Pets;

public  class Cat extends EarthPet {

    @Override
    public void talk() {
        System.out.println("Miau");
    }

    @Override
    public void walk() {
        System.out.println("Devagar");
    }

    @Override
    public void sleep(int time) {
        System.out.println("Dog sleeping");
    }
}
