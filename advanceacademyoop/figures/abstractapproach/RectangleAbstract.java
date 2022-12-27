package advanceacademyoop.figures.abstractapproach;

import java.util.List;

public class RectangleAbstract extends FigureAbstract {
    public RectangleAbstract(List<Integer> sides) {
        super(sides);
    }

    @Override
    public void describe() {
        System.out.println("I'm rectangle");
    }

    @Override
    public Integer findPerimeter() {
        Integer result = 0;
        for(Integer side : super.getSides()){
            result += side;
        }
        return result * 2;
    }
}
