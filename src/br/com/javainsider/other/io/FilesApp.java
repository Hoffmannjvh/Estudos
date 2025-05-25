package br.com.javainsider.other.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesApp {
    public static void main(String[] args) {

        Path file1 = Paths.get("Examples");
        System.out.println(file1.toAbsolutePath());
        System.out.println(Files.exists(file1));

        System.out.println(Files.isDirectory(file1));
        System.out.println(Files.isRegularFile(file1));
    }
}
