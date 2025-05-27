package hangman.core;

public class Word {

    private static final char HIDDEN_CHAR = '-';

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

    public boolean reveal(char letter) {

        boolean replaced = false;

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == letter) {
                hiddenLetters[i] = letter;
                replaced = true;
            }
        }
        return replaced;
    }
}
