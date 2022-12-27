package softwareuniversity.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L08A03Flowers {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int hrizantemiCount = Integer.parseInt(scanner.nextLine());
    int rosesCount = Integer.parseInt(scanner.nextLine());
    int tulipsCount = Integer.parseInt(scanner.nextLine());
    String season = scanner.nextLine();
    String isHoliday = scanner.nextLine();

    double hrizantemiPrice = 0;
    double rosesPrice = 0;
    double tulipsPrice = 0;
    double discount = 0;

    switch (season) {
        case "Spring":
        case "Summer": {
            if (isHoliday.equals("Y")) {
                hrizantemiPrice = 2.00 * 1.15;
                rosesPrice = 4.10 * 1.15;
                tulipsPrice = 2.50 * 1.15;
            } else if (isHoliday.equals("N")) {
                hrizantemiPrice = 2.00;
                rosesPrice = 4.10;
                tulipsPrice = 2.50;}
            if (season.equals("Spring") && tulipsCount > 7) {
                discount = 5;
            }
        }
        break;
        case "Autumn":
        case "Winter": {
            if (isHoliday.equals("Y")) {
                hrizantemiPrice = 3.75 * 1.15;
                rosesPrice = 4.50 * 1.15;
                tulipsPrice = 4.15 * 1.15;
            } else if (isHoliday.equals("N")) {
                hrizantemiPrice = 3.75;
                rosesPrice = 4.50;
                tulipsPrice = 4.15;
            }
            if (season.equals("Winter") && rosesCount >= 10) {
                discount = 10;
            }
            break;
        }
    }

    double flowersCount = hrizantemiCount + rosesCount + tulipsCount;
    double discountAllSeasons = 0;
    double arranging = 2;
    double flowersPrice = 0;

    if (flowersCount > 20) {
        discountAllSeasons = 20;
    }

    flowersPrice = (hrizantemiCount * hrizantemiPrice + rosesCount * rosesPrice + tulipsCount * tulipsPrice);
    flowersPrice = flowersPrice - flowersPrice * discount * 0.01;
    flowersPrice = flowersPrice - flowersPrice * discountAllSeasons * 0.01 + arranging;

    System.out.printf("%.2f", flowersPrice);

    }

}
