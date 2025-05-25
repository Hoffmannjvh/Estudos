package br.com.javainsider.other.inout;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReaderWriter {
    public static void main(String[] args) {
        try (Writer writer = new OutputStreamWriter(
                new FileOutputStream("examples/out1.txt"),
                StandardCharsets.UTF_8)) {

            writer.write("Olá, mundo com UTF-8 no Java 8!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
