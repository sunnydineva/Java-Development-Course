package figures.interfaceapproach;

public class Triangle extends Figure{
    private int a;
    private int b;
    private int c;

    public Triangle(int sidesNumber, int a, int b, int c) {
        super(sidesNumber);
        this.a = a;
        this.b = b;
        this.c = c;
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }


}
