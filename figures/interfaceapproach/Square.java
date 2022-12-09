package figures.interfaceapproach;

public class Square extends Figure{
    private int side;

    public Square(int sidesNumber, int side) {
        super(sidesNumber);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
