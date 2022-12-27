package softwareuniversity.ConditionalStatements;

import java.util.Scanner;

public class L06AFuelTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelLt = Double.parseDouble(scanner.nextLine());

        if (fuelType.equals("Diesel") || fuelType.equals("Gasoline") || fuelType.equals("Gas")) {
            if (fuelLt >= 25) {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
