package softwareuniversityprogrammingbasics.ConditionalStatements;

import java.util.Scanner;

public class L06A04TransportPrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//Студент трябва да пропътува n километра. Той има избор измежду три вида транспорт:
//Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
//Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
//Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.
// Напишете програма, която въвежда броя километри n и период от деня (ден или нощ) и изчислява цената на най-евтиния транспорт.
//Първият ред съдържа числото n – брой километри – цяло число в интервала [1…5000]
//Вторият ред съдържа дума “day” или “night” – пътуване през деня или през нощта
// Да се отпечата на конзолата най-ниската цена за посочения брой километри, форматирана до втория знак след десетичния разделител.

        int distanceInKm = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double pricePerKm = 0;
        //double transportPrice = distanceInKm * pricePerKm; - смята го като 0, ако е изведено тук
        if (distanceInKm >= 100) {
            pricePerKm = pricePerKm + 0.06;
            System.out.printf("%.2f", distanceInKm * pricePerKm);
        } else if (distanceInKm >= 20) {
            pricePerKm = 0.09;
            System.out.printf("%.2f", distanceInKm * pricePerKm);
        } else if (dayOrNight.equals("day")) {
            pricePerKm = 0.79;
            System.out.printf("%.2f", distanceInKm * pricePerKm + 0.70);
        } else {
            pricePerKm = 0.90;
            System.out.printf("%.2f", distanceInKm * pricePerKm + 0.70);
        }
    }
}
