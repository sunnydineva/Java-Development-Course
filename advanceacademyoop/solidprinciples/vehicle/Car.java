package advanceacademyoop.solidprinciples.vehicle;

public class Car extends Vehicle {

    @Override
    public void repair(Vehicle vehicle){
        if(vehicle instanceof Car){
            System.out.println("Car is repaired");
        }
    }
}
