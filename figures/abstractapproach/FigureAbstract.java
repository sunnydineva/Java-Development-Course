package figures.abstractapproach;

import java.util.List;

public abstract class FigureAbstract {
    private List<Integer> sides;

    public FigureAbstract(List<Integer> sides) {
        this.sides = sides;
    }

    public List<Integer> getSides() {
        return sides;
    }

    public void setSides(List<Integer> sides) {
        this.sides = sides;
    }

    public abstract void describe();

    public abstract Integer findPerimeter();

}
