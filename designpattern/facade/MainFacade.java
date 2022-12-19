package designpattern.facade;

public class MainFacade {
    public static void main(String[] args) {
        ShapeFacade facade = new ShapeFacade();
        facade.drawShape("rectangle");
        facade.drawShape("triangle");
        facade.drawShape("square");
        facade.drawShape("circle");
    }

}
