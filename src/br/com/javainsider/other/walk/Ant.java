package br.com.javainsider.other.walk;

public class Ant implements Walkable {

    private int totalDistance = 100;


    @Override
    public void walk() {
        totalDistance -= 10;
    }

    @Override
    public void stop() {
        totalDistance = 100;
    }
}
