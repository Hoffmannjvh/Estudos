package hangman.core;

public class Test {

    public static void main(String[] args) {

        Dictionary dictionary = Dictionary.instance();
        System.out.println(dictionary.nextWord());
        System.out.println(dictionary.nextWord());
        System.out.println(dictionary.nextWord());

    }
}
