package entities;

import enumerations.Color;

public interface Shape{

    Double calculateArea();
    Double calculatePerimeter();
    Color getColor();

    static int totalNumberOfShapes(ShapeCollection shapeCollection){
        return shapeCollection.getShapeCollection().size();
    }
    
    default String printInfo(){
        return 
            "Area: " 
            + String.format("%.2f",calculateArea())
            + "\n"
            + "Perimeter: "
            + String.format("%.2f",calculatePerimeter())
            + "\n"
            + "Color: "
            + getColor();
    }

}