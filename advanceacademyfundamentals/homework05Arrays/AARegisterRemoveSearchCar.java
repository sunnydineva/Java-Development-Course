package advanceacademyfundamentals.homework05Arrays;

import java.util.ArrayList;

public class AARegisterRemoveSearchCar {
    public static ArrayList<Car> carsList;

    public static void main(String[] args) {
        Car car1 = new Car("BMV", "X5", "White", "B1200NH", 10000);
        Car car2 = new Car("Cooper", "Mini", "Yellow", "B1200NH", 12000);
        Car car3 = new Car("Audi", "S3", "Black", "B1200NH", 11000);
        Car car4 = new Car("Mercedes", "Benz", "Silver", "B1200NH", 13000);
        Car car5 = new Car("Citroen", "Berlingo", "Deep blue", "B1200NH", 4000);


        //Създайте статичен масив и добавете няколко коли вътре после използвайте първо единия for loop после другия,
        // за да принтирате всичко за всяка кола.
        Car cars[] = {car1, car2, car3, car4, car5};

        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            car.printCarInfo();
            System.out.println();
        }
        for (Car car : cars) {
            car.printCarInfoMini();
            System.out.println();
        }

        carsList = new ArrayList<>();

        registerCar("BMW", "X5", "White", "B2500KT", 13000);
        registerCar("Suzuki", "X5", "White", "B2500KT", 12000);
        registerCar("Citroen", "Berlingo", "Red", "B2700KT", 10000);
        registerCar("BMW", "X3", "Black", "B2800KT", 9000);
        registerCar("Lada", "Samara", "Green", "B2900KT", 8000);
        registerCar("Audi", "A4", "Silver", "B3000KT", 7000);
        registerCar("VW", "Passat", "Silver", "B3100KT", 20000);

        searchCarBrand("BMW");
        removeCar("B2500KT");

    }


// Направете метод, който при извикването да се подава един параметър (изберете вие какъв), който да принтира всички коли
// с марката бмв, като в масива вие имате коли, които не са само бмв, а и други марки. Ако няма такива коли,
// изкарайте резултат в конзолата "Не са намерени резултати за бмв". Направете го, да работи за всяка марка.
// Ако примерно напиша сузуки да излизат съответно резултатите. За тази задача използвайте ArrayList


    public static void searchCarBrand(String searchBrand) {
        boolean isFound = false;
        System.out.println();
        for (Car car : carsList) {
            String carBrandModel = car.carBrand + " " + car.carModel;
            if (carBrandModel.toLowerCase().contains(searchBrand.toLowerCase())) {
                isFound = true;
                System.out.println(car.carBrand + " " + car.carModel);
            }
        }
        if (!isFound) {
            System.out.printf("%nResults not found for %s%n", searchBrand);
        }

    }
//•	Направете метод, който при подаване на съответните параметри да изтрива една кола от масива.
// (Продадена е и ние трябва да я махнем от масива)
    public static void removeCar(String CarPlateForRemove) {
        System.out.println();
        System.out.println("All our cars are");
        for (Car car : carsList) {
            System.out.println(car);
        }
        for (int i = 0; i < carsList.size(); i++) {
            Car car = carsList.get(i); //създаваме обект car, който получава стойността от съответното i
            if (car.carPlate.toLowerCase().equals(CarPlateForRemove.toLowerCase())) {
                carsList.remove(car); //в упражненията са дали carsList.remove[i];
                break; //!!!!!!!!!!!!!!!!!!!
            }
        }
        System.out.println();
        System.out.println(CarPlateForRemove + " is removed from data base");
        System.out.println();
        System.out.println("The cars are now: ");
        for (Car car : carsList) {
                System.out.println(car);
        }
    }

    //Направете метод, който да прави същото като горната задача,
    // но този път да не махаме, а да добяваме. (Нова кола сме получили и трябва да я добавим)
    public static void registerCar(String carBrand, String carModel, String carColor, String carPlate, double carPrice) {
        if (carBrand.length() <= 1) {
            System.out.println("carBrand is required field");
            return; //прекъсва метода; може и с else
        }
        if (carModel.length() <= 1) { // отделно, за да дава кое име се изисква - първо или второ
            System.out.println("carModel is required field");
            return;
        }
        if (carColor.length() <= 1) {
            System.out.println("carColor is required field");
            return; //прекъсва метода; може и с else
        }
        if (carPrice == 0) {
            System.out.println("carPrice is required field");
            return;
        }
        if (carPlate.length() <= 1) {
            System.out.println("carPlate is required field");
            return;
        }
        Car car = new Car(carBrand, carModel, carColor, carPlate, carPrice);
        carsList.add(car);
        System.out.println("The car is registered");
    }


}




// Коментар от преподавател:
// Супер браво, единствената забележка, която мога да ти направя е да сложиш break в проверката когато махаш кола,
// онеже е само 1 кола коя махаш не е нужно да върти повече