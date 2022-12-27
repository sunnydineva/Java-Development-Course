package softwareuniversity.ForLoop;

import java.util.Scanner;

public class L10A06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int periodInMonths = Integer.parseInt(scanner.nextLine());

        double electricityTotal = 0;
        double waterTotal = 0;
        double internetTotal = 0;
        double othersTotal = 0;



        for (int i = 1; i <= periodInMonths; i++) {

            double electricityBill = Double.parseDouble(scanner.nextLine());
            electricityTotal = electricityTotal + electricityBill;

            double waterBill = 20;
            waterTotal = waterTotal + waterBill;

            double internetBill = 15;
            internetTotal = internetTotal + internetBill;

            double otherBill = (electricityBill + waterBill + internetBill) * 1.2;
            othersTotal = othersTotal + otherBill;


        }

        double average = (electricityTotal + waterTotal + internetTotal + othersTotal)/ periodInMonths;

        System.out.printf("Electricity: %.2f lv%n", electricityTotal);
        System.out.printf("Water: %.2f lv%n", waterTotal);
        System.out.printf("Internet: %.2f lv%n", internetTotal);
        System.out.printf("Other: %.2f lv%n", othersTotal);
        System.out.printf("Average: %.2f lv", average);

    }
}
