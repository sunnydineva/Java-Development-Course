package softwareuniversity.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L08A06TruckDriver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());
        double tariffPerKm = 0;

        if ((kmPerMonth <= 20000) && (kmPerMonth > 10000)) {
            tariffPerKm = 1.45;
        } else {
            switch (season) {
                case "Spring":
                case "Autumn": {
                    if (kmPerMonth <= 5000) {
                        tariffPerKm = 0.75;
                    } else if (kmPerMonth <= 10000) {
                        tariffPerKm = 0.95;
                    }
                }
                break;
                case "Summer": {
                    if (kmPerMonth <= 5000) {
                        tariffPerKm = 0.90;
                    } else if (kmPerMonth <= 10000) {
                        tariffPerKm = 1.10;
                    }
                }
                break;
                case "Winter": {
                    if (kmPerMonth <= 5000) {
                        tariffPerKm = 1.05;
                    } else if (kmPerMonth <= 10000) {
                        tariffPerKm = 1.25;
                    }
                }
                break;
            }
        }
        double taxes = 0.10;
        double kilometers = kmPerMonth * 4;
        double salary = kilometers * tariffPerKm - kilometers * tariffPerKm * taxes;
        System.out.printf("%.2f", salary);
    }
}
