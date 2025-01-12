package br.com.javainsider.other.maxSpeed;

public class Vehicle {

    private int currentSpeed;

    public Vehicle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int accelerate() throws RuntimeException{
        if (currentSpeed * 2 > 200) {
            throw new ExcessiveSpeedException ("Maximum speed has been reached!");
        }

        this.currentSpeed *= 2;
        return currentSpeed;
    }
}
