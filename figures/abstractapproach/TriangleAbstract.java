package figures.abstractapproach;

import java.util.List;

public class TriangleAbstract extends FigureAbstract {


    public TriangleAbstract(List<Integer> sides) {
        super(sides);
    }



    @Override
    public void describe() {
        System.out.println("I'm triangle");
    }

    @Override
    public Integer findPerimeter() {
        Integer result = 0;
        for(Integer side : super.getSides()){
            result += side;
        }
        return result;
    }
}
