package br.com.javainsider.other.shape;

public class Rectangle implements Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return width * height;
    }
}
