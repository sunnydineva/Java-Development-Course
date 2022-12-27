package softwareuniversity.ForLoop;

import java.util.Scanner;

public class L10A03Logistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cargo = Integer.parseInt(scanner.nextLine());


        double totalPrice = 0;
        int totalCargo = 0;
        int cargoByBus = 0;
        int cargoByTruck = 0;
        int cargoByRailway = 0;


        for (int i = 1; i <= cargo; i++) {

            int cargoWeight = Integer.parseInt(scanner.nextLine());

            if (cargoWeight <= 3) {
                cargoByBus = cargoByBus + cargoWeight;
                int price = 200;
                totalPrice = totalPrice + price * cargoWeight;
                totalCargo = totalCargo + cargoWeight;

            } else if (cargoWeight <= 11) {
                cargoByTruck = cargoByTruck + cargoWeight;
                int price = 175;
                totalPrice = totalPrice + price * cargoWeight;
                totalCargo = totalCargo + cargoWeight;

            } else {
                cargoByRailway = cargoByRailway + cargoWeight;
                int price = 120;
                totalPrice = totalPrice + price * cargoWeight;
                totalCargo = totalCargo + cargoWeight;
            }


        }

        System.out.printf("%.2f%n", totalPrice/totalCargo);
        System.out.printf("%.2f%%%n", cargoByBus * 1.0 / totalCargo * 100);
        System.out.printf("%.2f%%%n", cargoByTruck * 1.0 / totalCargo * 100);
        System.out.printf("%.2f%%%n", cargoByRailway * 1.0 / totalCargo * 100);


    }
}
