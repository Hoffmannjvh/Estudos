package br.com.javainsider.other.enums;

import static br.com.javainsider.other.enums.Car.Brand.BMW;

public class EnumApp3 {

    public static void main(String[] args) {

        //Car c = new Car(Car.Brand.BMW);
        Car c = new Car(BMW);
        System.out.println(c.getBrand());

    }

}
