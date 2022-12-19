package designpattern.facade;

public class ShapeFacade {

    private Rectangle rectangle;
    private Square square;
    private Triangle triangle;
    private Circle circle;

    public ShapeFacade() { //constructor w/o parameters
        this.rectangle = new Rectangle();
        this.square = new Square();
        this.triangle = new Triangle();
        this.circle = new Circle();
    }

    public void drawShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Circle")) {
            circle.draw();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            square.draw();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            rectangle.draw();
        } else if (shapeType.equalsIgnoreCase("Triangle")) {
            triangle.draw();
        }
    }
}
