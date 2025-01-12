package br.com.javainsider.other.enums;

public class EnumApp2 {

    public static void main(String[] args) {

        Dog d = new Dog();
        talk(d);
        talk(MyPet.CAT);
        talk(MyPet.MOUSE);

    }

    private static void talk (Pet pet) {
        System.out.println(pet.talk());
    }

}
