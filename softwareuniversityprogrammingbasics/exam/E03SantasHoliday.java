package softwareuniversityprogrammingbasics.exam;

import java.util.Scanner;

public class E03SantasHoliday {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String rate = scanner.nextLine();
        int nights = days - 1;
        double discount = 0;
        double subTotal = 0;
        double priceNight = 0;

        switch (typeRoom) {
            case "room for one person": {
                priceNight = 18;
                discount = 0;
                break;
            }
            case "apartment": {
                priceNight = 25;
                if (days < 10) {
                    discount = 0.30;
                } else if (days <= 15) {
                    discount = 0.35;
                } else {
                    discount = 0.50;
                }
                break;
            }
            case "president apartment": {
                priceNight = 35;
                if (days < 10) {
                    discount = 0.10;
                } else if (days <= 15) {
                    discount = 0.15;
                } else {
                    discount = 0.20;
                }
                break;
            }
        }
        subTotal = (nights * priceNight) - (nights * priceNight) * discount;
        double total = 0;
        switch (rate) {
            case "positive": {
                total = subTotal + subTotal * 0.25;
                break;
            }
            case "negative": {
                total = subTotal - subTotal * 0.10;
                break;
            }
        }
        System.out.printf("%.2f%n", total);
    }
}

