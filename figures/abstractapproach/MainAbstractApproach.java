package figures.abstractapproach;

import figures.interfaceapproach.*;

import java.util.Arrays;

public class MainAbstractApproach {
    public static void main(String[] args) {


        TriangleAbstract triangle = new TriangleAbstract(Arrays.asList(3, 4, 5));
        SquareAbstract square = new SquareAbstract(Arrays.asList(2));
        RectangleAbstract rectangle = new RectangleAbstract(Arrays.asList(2, 4));

        triangle.describe();
        System.out.println(triangle.findPerimeter());
        square.describe();
        System.out.println(square.findPerimeter());
        rectangle.describe();
        System.out.println(rectangle.findPerimeter());
    }

}
