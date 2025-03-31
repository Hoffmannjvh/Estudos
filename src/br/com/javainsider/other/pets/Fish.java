package br.com.javainsider.other.pets;

public class Fish  extends WaterPet{

    @Override
    public void swim() {
        System.out.println("Nadando lento");
    }

    @Override
    public void sleep(int time) {
        System.out.println("Dog sleeping");
    }
}
