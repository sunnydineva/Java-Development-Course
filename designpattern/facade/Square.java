package designpattern.facade;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("I'm facade square");
    }
}