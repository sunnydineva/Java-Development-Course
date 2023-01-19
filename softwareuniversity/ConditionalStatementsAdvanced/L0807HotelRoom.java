package softwareuniversity.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L0807HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//• За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
//• За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
//• За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
//• За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.

        String month = scanner.nextLine(); //• На първия ред е месецът – May, June, July, August, September или October
        int nights = Integer.parseInt(scanner.nextLine());    // • На втория ред е броят на нощувките – цяло число в интервала [0 ... 200]
        double studioPrice = 0;
        double apartmentPrice = 0;
        double discountApartment = 0;
        double discountStudio = 0;

        switch (month) {
            case "May":
            case "October": {
                studioPrice = 50;
                apartmentPrice = 65;
                if (nights > 7) discountStudio = 5;
                if (nights > 14) {
                    discountStudio = 30;
                    discountApartment = 10;
                }
            }
            break;
            case "June":
            case "September": {
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if (nights > 14) {
                    discountStudio = 20;
                    discountApartment = 10;
                }
            }
            break;
            case "July":
            case "August": {
                studioPrice = 76;
                apartmentPrice = 77;
                if (nights > 14) {
                    discountApartment = 10;
                }
                break;
            }
        }
        double subTotalApartment = nights * apartmentPrice;
        double subTotalStudio = nights * studioPrice;
        double totalApartment = subTotalApartment - subTotalApartment * discountApartment * 0.01;
        double totalStudio = subTotalStudio - subTotalStudio * discountStudio * 0.01;
        System.out.printf("Apartment: %.2f lv.", totalApartment);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", totalStudio);

//• На първия ред: "Apartment: {цена за целият престой} lv."
//• На втория ред: "Studio: {цена за целият престой} lv."
//  Цената за целия престой форматирана с точност до два знака след десетична
    }
}
