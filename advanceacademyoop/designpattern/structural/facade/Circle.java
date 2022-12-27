package advanceacademyoop.designpattern.structural.facade;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("I'm facade circle");
    }
}
