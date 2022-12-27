package softwareuniversity.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L0809SkiTrip {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int days = Integer.parseInt(scanner.nextLine());
    String place = scanner.nextLine();
    String grade = scanner.nextLine();

    double price = 0;
    double discount = 0;
//за престой: ▪ "room for one person" – 18.00 лв за нощувка
//▪ "apartment" – 25.00 лв за нощувка
//▪ "president apartment" – 35.00 лв за нощувка
    switch (place) {
        case "room for one person": {
            price = 18;
            if (days < 10) {
                discount = 0;
            } else if (days <=15){
                discount = 0;
            } else  {
                discount = 0;
            }
        } break;
        case "apartment": {
            price = 25;
            if (days < 10) {
                discount = 30;
            } else if (days <=15){
                discount = 35;
            } else  {
                discount = 50;
            }
        } break;
        case "president apartment": {
            price = 35;
            if (days < 10) {
                discount = 10;
            } else if (days <=15){
                discount = 15;
            } else  {
                discount = 20;
            }
        } break;
    }

    double total = (days - 1 ) * (price - price * discount * 0.01);

    if (grade.equals("positive")) {
        total = total + total * 0.25;
    } else if (grade.equals("negative")) {
        total = total - total * 0.10;
    }
    System.out.printf("%.2f", total);
    //• Цената за престоят му в хотела, форматирана до втория знак след десетичната запетая.

    }
}
