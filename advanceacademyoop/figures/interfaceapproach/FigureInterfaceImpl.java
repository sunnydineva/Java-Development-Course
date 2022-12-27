package advanceacademyoop.figures.interfaceapproach;

public class FigureInterfaceImpl implements FigureInterface {
    @Override
    public void describe(Figure figure) {
        if (Triangle.class.isInstance(figure)) {
            System.out.println("I'm triangle");
        } else if (Square.class.isInstance(figure)) {
            System.out.println("I'm square");
        } else if (Rectangle.class.isInstance(figure)) {
            System.out.println("I'm rectangle");
        }
    }

    @Override
    public int findPerimeter(Figure figure) {
        int result = 0;
        if (Triangle.class.isInstance(figure)) {
            Triangle triangle = (Triangle) figure;
            result = triangle.getA() + triangle.getB() + triangle.getC();
        } else if (Square.class.isInstance(figure)) {
            Square square = (Square) figure;
            result = square.getSide() * 4;

        } else if (Rectangle.class.isInstance(figure)) {
            Rectangle rectangle = (Rectangle) figure;
            result = (rectangle.getA() * + rectangle.getB()) * 2;
        }
        return result;
    }
}
