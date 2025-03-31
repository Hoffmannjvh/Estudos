package br.com.javainsider.other.strings;

public interface CharacterChanger {

    default String upper(String s) {
        return "*" + s.substring(1);
    }

    static String lower(String s) {
        return s.toLowerCase();
    }

}
