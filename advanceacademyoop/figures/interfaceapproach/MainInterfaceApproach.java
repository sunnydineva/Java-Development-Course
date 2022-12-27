package advanceacademyoop.figures.interfaceapproach;

public class MainInterfaceApproach {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3, 3);
        Square square = new Square(1, 2);
        Rectangle rectangle = new Rectangle(2, 5, 8);

        FigureInterface figureInterface = new FigureInterfaceImpl();
        figureInterface.describe(triangle);
        figureInterface.findPerimeter(triangle);
        figureInterface.describe(square);
        figureInterface.findPerimeter(square);
        figureInterface.describe(rectangle);
        figureInterface.findPerimeter(rectangle);

    }
}
