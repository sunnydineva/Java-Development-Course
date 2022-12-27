package advanceacademyoop.designpattern.creational.factory;

public class ShapeFactory {

    public static Shape getShape(String shapeName) {
        //some logic here
        if (shapeName.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (shapeName.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeName.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        }
        return null;
    }
}
