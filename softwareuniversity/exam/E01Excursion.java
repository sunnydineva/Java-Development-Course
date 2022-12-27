package softwareuniversity.exam;

import java.util.Scanner;

public class E01Excursion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int transportCards = Integer.parseInt(scanner.nextLine());
        int ticketsMuseum = Integer.parseInt(scanner.nextLine());

        double priceNights = people * nights * 20;
        double priceCards = people * 1.0 * transportCards * 1.6;
        double priceMuseums = people * ticketsMuseum * 6;
        double subTotal = (priceNights + priceCards + priceMuseums);
        double unpredictedExpenses = subTotal * 0.25;
        double totalPrice = subTotal + unpredictedExpenses;

        System.out.printf("%.2f", totalPrice);
    }
}
