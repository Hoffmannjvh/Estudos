package br.com.javainsider.other.wrapper;

public class Person {

    private final Integer age;
    private final Double weight;

    public Person(Integer age, Double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }
}
