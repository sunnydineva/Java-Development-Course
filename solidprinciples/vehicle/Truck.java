package solidprinciples.vehicle;

public class Truck extends Vehicle{
    @Override
    public void repair(Vehicle vehicle){
        if(vehicle instanceof Truck){
            System.out.println("Truck is repaired");
        }
    }
}
