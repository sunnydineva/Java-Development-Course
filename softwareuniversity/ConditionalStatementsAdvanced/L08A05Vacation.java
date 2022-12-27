package softwareuniversity.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L08A05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());;
        String season = scanner.nextLine();

        String placeType = "";
        String place = "";
        double budgetPercent = 0;

        if (budget <= 1000) {
            placeType = "Camp";

            switch (season) {
                case "Summer": {
                    place = "Alaska";
                    budgetPercent = 65;
                } break;
                case "Winter": {
                    place = "Morocco";
                    budgetPercent = 45;
                } break;
            }

        } else if (budget <= 3000) {
            placeType = "Hut";
            switch (season) {
                case "Summer": {
                    budgetPercent = 80;
                    place = "Alaska";
                } break;
                case "Winter": {
                    budgetPercent = 60;
                    place = "Morocco";
                } break;
            }
        } else {
            placeType = "Hotel";
            budgetPercent = 90;
            switch (season) {
                case "Summer": {
                    place = "Alaska";
                }
                break;
                case "Winter": {
                    place = "Morocco";
                }
                break;
            }
        }
        double price = 0;
        price = budget * budgetPercent * 0.01;

        System.out.printf("%s - %s - %.2f", place, placeType, price);
    }

}
