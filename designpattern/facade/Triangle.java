package designpattern.facade;

public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("I'm facade triangle");
    }

}
