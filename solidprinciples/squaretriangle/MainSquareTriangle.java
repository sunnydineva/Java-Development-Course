package solidprinciples.squaretriangle;

import javax.swing.table.TableRowSorter;

public class MainSquareTriangle {
    public static void main(String[] args) {
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        square.printShape();
        triangle.printShape();
        circle.printShape();
    }
}
