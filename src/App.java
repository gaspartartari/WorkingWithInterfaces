import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Calculator;
import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.ShapeCollection;
import enumerations.Color;


public class App {
    public static void main(String[] args) throws Exception {
        
        ShapeCollection shapes = new ShapeCollection();

        //creating random shapes and adding to a shapeCollection
        for (int i =0; i < 5; i++){
            Color randomColor = Color.values()[(int) (Math.random() * Color.values().length)];

            Rectangle r = new Rectangle((Double)(Math.random() * (50 - 0)), (Double)(Math.random() * (50 - 0)), randomColor);
            shapes.addShape(r);
        }

        for (int i =0; i < 5; i++){
            Color randomColor = Color.values()[(int) (Math.random() * Color.values().length)];
            Circle c = new Circle(25.00 * i, randomColor);
            shapes.addShape(c);
        }

        System.out.println("--------------------------------------- ");
        int totalNumberOfShapes = Shape.totalNumberOfShapes(shapes);
        System.out.println("\nTOTAL NUMBER OF SHAPES: " + totalNumberOfShapes);
        System.out.println();
        
        for (Shape shape : shapes.getShapeCollection()){
            if(shape instanceof Circle){
                System.out.println("CIRCLE\n" + shape.printInfo());
                System.out.println();
            } else{
               System.out.println("RECTANGLE\n" + shape.printInfo());
                System.out.println(); 
            }
        }

        System.out.println("--------------------------------------- ");
        
        List <Circle> circles = new ArrayList<>();

     
        shapes.removeShapeByCollor(Color.GREEN);
        totalNumberOfShapes = Shape.totalNumberOfShapes(shapes);
        System.out.println("\nTOTAL NUMBER OF SHAPES AFTER REMOVING COLOR GREEN: " + totalNumberOfShapes);
        System.out.println();
        for (Shape shape : shapes.getShapeCollection()){
        if(shape instanceof Circle){
            System.out.println("CIRCLE\n" + shape.printInfo());
            System.out.println();
            circles.add((Circle)shape);
        } else{
            System.out.println("RECTANGLE\n" + shape.printInfo());
            System.out.println(); 
            }
        }

        System.out.println("--------------------------------------- ");
        System.out.println("Total area of all shapes: " + String.format("%.2f", shapes.calculateArea()));

        System.out.println("--------------------------------------- ");
        System.out.println("Circles sort by radius");
        System.out.println();

        Collections.sort(circles);
        for (Circle circle : circles){
                System.out.println("CIRCLE\n" + circle.printInfo());
                System.out.println();
            }

        System.out.println("--------------------------------------- ");
        System.out.println("Demonstrating funcional interface methods");

        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;

        double result1 = addition.calculate(5.0, 3.0); // Addition: 8.0
        double result2 = subtraction.calculate(5.0, 3.0); // Subtraction: 2.0

        System.out.println("5 + 3 = " + result1);
        System.out.println("5 - 3 = : " + result2);

        System.out.println("-------PROGRAM ENDED---------------- ");
        System.out.println("");
    }
}
