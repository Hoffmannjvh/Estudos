package br.com.javainsider.other.strings;

public class ExExtractAndTransform {

    public static void main(String[] args) {
        String convert = uppercase("java is cool", "cool");
        System.out.println(convert);
    }

    private static String uppercase(String s, String piece) {

      int pos = s.indexOf(piece);
      if (pos < 0) {
          return s;
      }

      String extracted = s.substring(pos, pos + piece.length());
        String transformed = extracted.toUpperCase();

        return s.substring(0, pos) + transformed + s.substring(pos + piece.length());
    }

}
