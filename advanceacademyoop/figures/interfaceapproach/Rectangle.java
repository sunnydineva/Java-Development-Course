package advanceacademyoop.figures.interfaceapproach;

public class Rectangle extends Figure {
    private int a;
    private int b;

    public Rectangle(int sidesNumber, int a, int b) {
        super(sidesNumber);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
