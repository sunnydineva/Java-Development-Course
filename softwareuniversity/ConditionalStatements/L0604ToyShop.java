package softwareuniversity.ConditionalStatements;

import java.util.Scanner;

public class L0604ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int puzzelsCount = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        double puzzlePrice = puzzelsCount * 2.60;
        double dollsPrice = dolls * 3;
        double teddyBearsPrice = teddyBears * 4.10;
        double minionsPrice = minions * 8.20;
        double trucksPrice = trucks * 2;
        int totalToys = puzzelsCount + dolls + teddyBears + minions + trucks;
        double subTotalPrice = puzzlePrice + dollsPrice + teddyBearsPrice + minionsPrice + trucksPrice;

        if (totalToys >= 50) {
            subTotalPrice = subTotalPrice - subTotalPrice * 0.25;
        }
        double totalPrice = subTotalPrice - subTotalPrice * 0.10;
        if (totalPrice >= holidayPrice) {
            System.out.printf("Yes! %.2f lv left.", totalPrice - holidayPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", holidayPrice - totalPrice);
        }
    }
}
