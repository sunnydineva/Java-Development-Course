package designpattern.behavioral.template;

public class MyOtherGame extends Game{
    public MyOtherGame(String p1, String p2, String p3) {
        super(p1, p2, p3);
    }

    @Override
    public void startGame() {
        System.out.println("The OtherGame has started.");
    }
    @Override
    public void endGame() {
        System.out.println("*** GAME OVER ***");
    }
}
