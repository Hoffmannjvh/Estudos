package br.com.javainsider.other.Strings;

public class StringManipulatorImpl implements StringManipulator, CharacterChanger {

    @Override
    public String join(String s1, String s2) {
        return s1 + s2;
    }

    @Override
    public String takeFirst(String s, int length) {
        return s.substring(0, length);
    }

    @Override
    public String upper(String s) {
        return StringManipulator.super.upper(s);
    }
}
