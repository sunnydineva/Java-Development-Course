package designpattern.behavioral.template;

public class MainTemplate {
    public static void main(String[] args) {
        Game myGame = new MyGame("Mitko", "Viktor", "Messy");
        myGame.play();
        System.out.println("----------------");

        Game myOtherGame = new MyOtherGame("Mitko", "Viktor", "Messy");
        myOtherGame.play();
    }


}
