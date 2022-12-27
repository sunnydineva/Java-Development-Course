package softwareuniversity.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L08A01MatchTickets {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double budget = Double.parseDouble(scanner.nextLine());
    String category = scanner.nextLine();
    int guysCount = Integer.parseInt(scanner.nextLine());

    double ticketPrice = 0;
    double transportPercent = 0;


    switch (category) {
        case "VIP" :{
            ticketPrice = 499.99;
            if ((guysCount >= 1) && (guysCount <= 4)) {
                transportPercent = 75;
            } else if ((guysCount >= 5) && (guysCount <= 9)) {
                transportPercent = 60;
            } else if ((guysCount >= 10) && (guysCount <= 24)) {
                transportPercent = 50;
            } else if ((guysCount >= 25) && (guysCount <= 49)) {
                transportPercent = 40;
            } else {
                transportPercent = 25;
            }
        } break;
        case "Normal": {
            ticketPrice = 249.99;
            if ((guysCount >= 1) && (guysCount <= 4)) {
                transportPercent = 75;
            } else if ((guysCount >= 5) && (guysCount <= 9)) {
                transportPercent = 60;
            } else if ((guysCount >= 10) && (guysCount <= 24)) {
                transportPercent = 50;
            } else if ((guysCount >= 25) && (guysCount <= 49)) {
                transportPercent = 40;
            } else {
                transportPercent = 25;
            }
        } break;

    }

    double transportPrice = transportPercent * 0.01 * budget;
    double ticketsTotal = guysCount * ticketPrice;
    double expensesTotal = transportPrice + ticketsTotal;

    double difference = Math.abs(expensesTotal - budget);

    if (expensesTotal <= budget) {
        System.out.printf("Yes! You have %.2f leva left.", difference);
    } else {
        System.out.printf("Not enough money! You need %.2f leva.", difference);

    }

    }
}
