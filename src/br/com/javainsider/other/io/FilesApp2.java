package br.com.javainsider.other.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesApp2 {

    public static void main(String[] args) throws IOException {
        Path root = Paths.get("examples");

        if (!Files.exists(root)) {
            Files.createDirectory(root);
        }

        Path d1 = root.resolve("d1");

        if (!Files.exists(d1)) {
            Files.createDirectory(d1);
        }
    }
}
