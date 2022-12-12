package solidprinciples.squaretriangle;

public class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public void printShape(){
        System.out.println(this.type);
    }

}
