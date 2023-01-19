package softwareuniversity.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L0803NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// Roses = 5
// Dahlias = 3.80
// Tulips = 2.80
// Narcissus = 3
// Gladiolus = 2.50
//• Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
//• Ако Нели купи повече от 90 Далии - 15% отстъпка от крайната цена
//• Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
//• Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
//• Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
//• Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
//• Брой цветя - цяло число в интервала [10…1000]
//• Бюджет - цяло число в интервала [50…2500]

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double flowerPrice = 0;
        double discount = 0;
        switch (flowerType) {
            case "Roses":
                flowerPrice = 5.00;
                if (flowerCount > 80) {
                    discount = 0.10;
                }
                break;
            case "Dahlias":
                flowerPrice = 3.80;
                if (flowerCount > 90) {
                    discount = 0.15;
                }
                break;
            case "Tulips":
                flowerPrice = 2.80;
                if (flowerCount > 80) {
                    discount = 0.15;
                }
                break;
            case "Narcissus":
                flowerPrice = 3.00;
                if (flowerCount < 120) {
                    discount = 1.15;
                }
                break;
            case "Gladiolus":
                flowerPrice = 2.50;
                if (flowerCount < 80) {
                    discount = 1.20;
                }
                break;
        }
        double subTotal = flowerCount * flowerPrice;
        double total = 0;

        if (discount <= 1) {
            total = subTotal - subTotal * discount;
        } else {
            total = subTotal * discount;
        }
        double moneyLeft = Math.abs(budget - total);
        if (total <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, moneyLeft);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", moneyLeft);
        }
// Ако бюджета им е достатъчен - "Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
//"Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."
//    Сумата да бъде форматирана до втория знак след десетичната запетая.
    }
}
