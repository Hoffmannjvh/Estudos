package hangman.core;

import java.util.Arrays;

public class Word {

    private static final char HIDDEN_CHAR = '_';

    private final char [] letters;
    private final char [] hiddenLetters;

    public  Word (String text) {

        letters = text.toCharArray();
        hiddenLetters = new String(new char[text.length()])
                .replace('\0', HIDDEN_CHAR)
                .toCharArray();
    }

    @Override
    public String toString() {
        return String.valueOf(hiddenLetters);
    }
}
