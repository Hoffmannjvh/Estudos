package br.com.javainsider.other.rectangles;

public class Rectangle {

    //Altura
    private int widht;
    //Largura
    private int height;
    //Area do quadrado
    private final int square;


    public Rectangle(int widht, int height) {
        this.widht = widht;
        this.height = height;
        square = widht * height;
    }

    public Rectangle(int widht) {
        this(widht, widht);
    }

    public int Square() {
        return square;
    }

}
