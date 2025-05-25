package br.com.javainsider.other.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathApp {
    public static void main(String[] args) {

        Path p1 = Paths.get("C:", "System", "file.exe");
        System.out.println(p1);

        Path p2 = p1.getFileName();
        System.out.println(p2);

        Path p3 = p1.getRoot();
        System.out.println(p3);
        
    }
}
