package designpattern.facade;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("I'm facade rectangle");
    }
}
