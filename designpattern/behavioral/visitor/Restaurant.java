package designpattern.behavioral.visitor;

public class Restaurant extends Client{

    private boolean isInternational;

    public Restaurant(String name, String address, boolean isInternational) {
        super(name, address);
        this.isInternational = isInternational;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRestaurant();
    }
}
