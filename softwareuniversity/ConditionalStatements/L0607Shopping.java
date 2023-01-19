package softwareuniversity.ConditionalStatements;

import java.util.Scanner;

public class L0607Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
//        Петър иска да купи N видеокарти, M процесора и P на брой рам памет.
//    Ако броя на видеокартите е по-голям от този на процесорите получава 15% отстъпка от крайната сметка. Важат следните цени:
//• Видеокарта – 250 лв./бр. •
// Процесор – 35% от цената на закупените видеокарти/бр. •
// Рам памет – 10% от цената на закупените видеокарти/бр.
//  Да се изчисли нужната сума за закупуване на материалите и да се пресметне дали бюджета ще му стигне.
//
        double budget = Double.parseDouble(scanner.nextLine());
        int countVGA = Integer.parseInt(scanner.nextLine());
        int countCPU = Integer.parseInt(scanner.nextLine());
        int countRAM = Integer.parseInt(scanner.nextLine());
        double sumVGA = countVGA * 250;
        double priceCPU = 0.35 * sumVGA;
        double priceRAM = 0.10 * sumVGA;
        double subTotal = sumVGA + countCPU * priceCPU + countRAM * priceRAM;

        if (countVGA > countCPU) {
            //  totalWithDiscount = subTotal - 0.15 * subTotal;
            subTotal = subTotal - 0.15 * subTotal;
        }
        if (subTotal <= budget) {
            System.out.printf("You have %.2f leva left!", budget - subTotal);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", subTotal - budget);
        }
    }
}
