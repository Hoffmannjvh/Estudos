package hangman.core;

import hangman.io.Input;
import java.util.List;
import java.util.Random;

public class Dictionary {
    private static final String FILE_PATH = "/hangman/resources/dictionary.txt";
    private static final Dictionary INSTANCE = new Dictionary();

    private final List<String> words;
    private final Random random = new Random();

   private Dictionary() {
      words = Input.readLinesFromFile(FILE_PATH);

   }

   public String nextWord() {
       int randomIndex = random.nextInt(words.size());
       return words.get(randomIndex);
   }

   public static Dictionary instance() {
       return INSTANCE;
   }

}
