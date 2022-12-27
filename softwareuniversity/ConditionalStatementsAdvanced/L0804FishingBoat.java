package softwareuniversity.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L0804FishingBoat {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Тони и приятели много обичали да ходят за риба, те са толкова запалени по риболова, че решават да отидат
    // на риболов с кораб. Цената за наема на кораба зависи от сезона и броя рибари.

        int budget = Integer.parseInt(scanner.nextLine());         //• Бюджет на групата – цяло число в интервала [1…8000]
        String season = scanner.nextLine();         //• Сезон – текст : "Spring", "Summer", "Autumn", "Winter"
        int fishermenCount = Integer.parseInt(scanner.nextLine());         //• Брой рибари – цяло число в интервала [4…18]

       double boatRent = 0;

        switch (season) {
            case "Spring":
                boatRent = 3000;         // • Цената за наем на кораба през Spring е 3000 лв.
                if (fishermenCount <= 6) { //• Ако групата е до 6 човека включително – отстъпка от 10%.
                    boatRent = boatRent - boatRent * 0.10;
                } else if ((fishermenCount >= 7) && (fishermenCount <= 11)) {  //• Ако групата е от 7 до 11 човека включително – отстъпка от 15%.
                    boatRent = boatRent - boatRent * 0.15;
                } else if (fishermenCount >= 12) {
                    boatRent = boatRent - boatRent * 0.25; //• Ако групата е от 12 нагоре – отстъпка от 25%.
                }
                break;
            case "Summer":
            case "Autumn":
                boatRent = 4200;         //• Цената за наем на кораба през Summer и Autumn е 4200 лв.
                if (fishermenCount <= 6) { //• Ако групата е до 6 човека включително – отстъпка от 10%.
                    boatRent = boatRent - boatRent * 0.10;
                } else if ((fishermenCount >= 7) && (fishermenCount <= 11)) {  //• Ако групата е от 7 до 11 човека включително – отстъпка от 15%.
                    boatRent = boatRent - boatRent * 0.15;
                } else if (fishermenCount >= 12) {
                    boatRent = boatRent - boatRent * 0.25; //• Ако групата е от 12 нагоре – отстъпка от 25%.
                }
                break;
//            case "Autumn": {
//                boatRent = 4200;
//                if (fishermenCount <=6) { //• Ако групата е до 6 човека включително – отстъпка от 10%.
//                    boatRent = boatRent - boatRent * 0.10;
//                } else if ((fishermenCount >=7) && (fishermenCount <= 11)) {  //• Ако групата е от 7 до 11 човека включително – отстъпка от 15%.
//                    boatRent = boatRent - boatRent * 0.15;
//                } else if (fishermenCount >=12) {
//                    boatRent = boatRent - boatRent * 0.25; //• Ако групата е от 12 нагоре – отстъпка от 25%.
//                }
//            }
//            break;
            case "Winter":
                boatRent = 2600;        //• Цената за наем на кораба през Winter е 2600 лв.
                if (fishermenCount <= 6) { //• Ако групата е до 6 човека включително – отстъпка от 10%.
                    boatRent = boatRent - boatRent * 0.10;
                } else if ((fishermenCount >= 7) && (fishermenCount <= 11)) {  //• Ако групата е от 7 до 11 човека включително – отстъпка от 15%.
                    boatRent = boatRent - boatRent * 0.15;
                } else if (fishermenCount >= 12) {
                    boatRent = boatRent - boatRent * 0.25; //• Ако групата е от 12 нагоре – отстъпка от 25%.
                }
                break;
        }
            if (season.equals("Spring") || season.equals("Summer") || season.equals("Winter")) {
                //Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - тогава нямат допълнителна отстъпка.
                boolean isEven = fishermenCount % 2 == 0;
                if ( isEven) {
                boatRent = boatRent - boatRent * 0.05;
                }
            }
       //Напишете програма, която да пресмята дали рибарите ще съберат достатъчно пари.

        if (budget >= boatRent) {         //• Ако бюджетът е достатъчен:
            System.out.printf("Yes! You have %.2f leva left.", budget - boatRent);//"Yes! You have {останалите пари} leva left."
        } else {             //• Ако бюджетът НЕ Е достатъчен:
            System.out.printf("Not enough money! You need %.2f leva.", boatRent - budget);
            //"Not enough money! You need {сумата, която не достига} leva."
        }
        //Сумите трябва да са форматирани с точност до два знака след десетичната запетая.
    }

}
