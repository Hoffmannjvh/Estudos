package br.com.javainsider.other.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathApp2 {

    public static void main(String[] args) {

        Path path1 = Paths.get("home");
        Path path2 = Paths.get("ctosin");
        Path path3 = Paths.get("log.out");

        Path p4 = path1.resolve(path2).resolve(path3);
        Path p5 = p4.toAbsolutePath();

        System.out.println(p5);

    }
}
