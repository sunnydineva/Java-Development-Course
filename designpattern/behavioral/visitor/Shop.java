package designpattern.behavioral.visitor;

public class Shop extends Client{

    private Integer employees;

    public Shop(String name, String address, Integer employees) {
        super(name, address);
        this.employees = employees;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitShop();
    }
}
