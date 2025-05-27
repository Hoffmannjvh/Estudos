package hangman.core;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Dictionary {
    private static final String FILE_PATH = "/hangman/resources/dictionary.txt";

    private final List<String> words;
    private final Random random = new Random();

   public Dictionary() {
       URL url = getClass().getResource(FILE_PATH);

       if (url == null) {
           throw new RuntimeException("File not found " + FILE_PATH);
       }
        try {
            words = Files.readAllLines(Paths.get(url.toURI()));
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException("Error loading dictionary", e);
        }

   }

   public String nextWord() {
       int randomIndex = random.nextInt(words.size());
       return words.get(randomIndex);
   }

}
