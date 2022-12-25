package designpattern.factory;

public class MainFactory {
    public static void main(String[] args) {

//        ShapeFactory factory = new ShapeFactory();
//
//        Shape square = factory.getShape("square");
//        square.draw();

        Shape rectangle = ShapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = ShapeFactory.getShape("square");
        square.draw();

        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();

        Shape triangle = ShapeFactory.getShape("triangle");
        triangle.draw();

    }
}
