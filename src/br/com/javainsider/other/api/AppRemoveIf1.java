package br.com.javainsider.other.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppRemoveIf1 {
    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>(Arrays.asList('A', 'b', 'C', 'd', 'E', 'f'));
        System.out.println(letters);

        letters.removeIf(Character::isLowerCase);
        System.out.println(letters);
    }
}
