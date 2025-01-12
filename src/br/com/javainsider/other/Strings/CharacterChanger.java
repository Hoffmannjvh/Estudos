package br.com.javainsider.other.Strings;

public interface CharacterChanger {

    default String upper(String s) {
        return "*" + s.substring(1);
    }

    static String lower(String s) {
        return s.toLowerCase();
    }

}
