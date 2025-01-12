package br.com.javainsider.other.maxSpeed;

public class ExVehicle  {

    public static void main(String[] args) throws RuntimeException {

        Vehicle v1 = new Vehicle(5);

        System.out.println(v1.accelerate());

        System.out.println(v1.accelerate());
        System.out.println(v1.accelerate());
        System.out.println(v1.accelerate());
        System.out.println(v1.accelerate());
        System.out.println(v1.accelerate());

    }

}
