package entities;

import enumerations.Color;

public class Rectangle implements Shape, Drawable {
    
    private Double length;
    private Double width;
    private Color color;

    public Rectangle(Double length, Double width, Color color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public Double calculateArea() {
       return length * width;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * (length + width);
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("A rectangle printed here!");
    }

    @Override
    public Color getColor() {
        return color;
    }
}
