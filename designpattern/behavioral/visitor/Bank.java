package designpattern.behavioral.visitor;

public class Bank extends Client{

    private Integer branches;

    public Bank(String name, String address, Integer branches) {
        super(name, address);
        this.branches = branches;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBank();
    }
}
