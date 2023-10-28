package entities;

import enumerations.Color;

public class Circle implements Shape, Drawable, Comparable<Circle> {

    private Double radius;
    private Color color;

    public Circle(Double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }
    
    @Override
    public Double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("A cricle printed here!");
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public int compareTo(Circle other) {
        return radius.compareTo(other.getRadius());
    }
}
