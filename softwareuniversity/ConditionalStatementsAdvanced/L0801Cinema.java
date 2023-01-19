package softwareuniversity.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L0801Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//  В една кинозала столовете са наредени в правоъгълна форма в r реда и c колони.
//  Има три вида прожекции с билети на различни цени:
//• Premiere – премиерна прожекция, на цена 12.00 лева.
//• Normal – стандартна прожекция, на цена 7.50 лева.
//• Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева
//  Напишете програма, която чете тип прожекция (стринг), брой редове и брой колони в залата (цели числа),
//  въведени от потребителя, и изчислява общите приходи от билети при пълна зала.
//  Резултатът да се отпечата във формат като в примерите по-долу, с 2 знака след десетичната точка.

        String typeProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double income = 0;
        double seats = rows * columns;

        switch (typeProjection) {
            case "Premiere":
                income = seats * 12;
                break;
            case "Normal":
                income = seats * 7.50;
                break;
            case "Discount":
                income = seats * 5.00;
                break;
        }
        System.out.printf("%.2f leva", income);
    }
}
