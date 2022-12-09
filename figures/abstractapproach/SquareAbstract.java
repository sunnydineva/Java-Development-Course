package figures.abstractapproach;

import java.util.List;

public class SquareAbstract extends FigureAbstract {
    public SquareAbstract(List<Integer> sides) {
        super(sides);
    }


    @Override
    public void describe() {
        System.out.println("I'm square");
    }

    @Override
    public Integer findPerimeter() {
        Integer result = 0;
        for(Integer side : super.getSides()){
            result += side;
        }
        return result * 4;
    }
}
