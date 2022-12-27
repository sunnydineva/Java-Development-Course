package designpattern.behavioral.template;

public abstract class Game {

    private String p1;
    private String p2;
    private String p3;

    public Game(String p1, String p2, String p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void welcomeMsg(){
        System.out.println("Welcome!");
    }


    void enterPlayer(String name){
        System.out.println("Player " + name + " has entered.");
    }

    void leavePlayer(String name){
        System.out.println("Player " + name + " has left.");
    }

    public abstract void startGame();

    public abstract void endGame();

    public void play(){
        welcomeMsg();
        startGame();
        enterPlayer(p1);
        enterPlayer(p2);
        leavePlayer(p1);
        enterPlayer(p3);
        leavePlayer(p2);
        leavePlayer(p3);
        endGame();
    }
}
