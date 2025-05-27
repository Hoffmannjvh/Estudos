package hangman.core;

import java.net.URL;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Dictionary {
    private static final String FILE_PATH = "/hangman/resources/dictionary.txt";

    private final List<String> words;
    private final Random random = new Random();

   public Dictionary() throws Exception {
       URL url = getClass().getResource(FILE_PATH);
       words = Files.readAllLines(Paths.get(url.toURI()));
   }

   public String newtWord() {
       int randomIndex = random.nextInt(words.size());
       return words.get(randomIndex);
   }

}
