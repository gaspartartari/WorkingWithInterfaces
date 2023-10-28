package entities;
import enumerations.Color;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollection implements Shape {

    private List<Shape> shapeCollection = new ArrayList<>();

    public ShapeCollection() {
    }

    public List<Shape> getShapeCollection() {
        return shapeCollection;
    }

    // Implement methods to add shapes, remove shapes, and calculate the total area and perimeter of all shapes in the collection.

    public void addShape(Shape shape){
        shapeCollection.add(shape);
    }

    public boolean removeShapeByCollor(Color color){
        return shapeCollection.removeIf(x -> x.getColor() == color);
    }

    @Override
    public Double calculateArea() {
        Double sum = 0.0;
        for (Shape x : shapeCollection){
            sum += x.calculateArea();
        }
    return sum;
    }

    @Override
    public Double calculatePerimeter() {
        Double sum = 0.0;
        for (Shape x : shapeCollection){
            sum += x.calculatePerimeter();
        }
    return sum;
    }

    @Override
    public Color getColor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getColor'");
    }


    

    
    
}
