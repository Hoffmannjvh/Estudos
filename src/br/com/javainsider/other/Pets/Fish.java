package br.com.javainsider.other.Pets;

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
