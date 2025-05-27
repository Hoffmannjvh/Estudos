package hangman.test;

import hangman.core.Dictionary;

public class Test {

    public static void main(String[] args) {

        Dictionary dictionary = Dictionary.instance();
        System.out.println(dictionary.nextWord());
        System.out.println(dictionary.nextWord());
        System.out.println(dictionary.nextWord());

    }
}
