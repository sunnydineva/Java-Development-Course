package softwareuniversityprogrammingbasics.While;

import java.util.Scanner;

public class L12A02ReportSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int desiredSum = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int countTransaction = 0;
        int countCCTransaction = 0;
        int countCSTransaction = 0;
        double CC = 0;
        double CS = 0;
        boolean isCollected = false;
        while (!input.equals("End")) {
            countTransaction++;
            int sum = Integer.parseInt(input);
            if (countTransaction % 2 == 0) { //card
                if (sum >= 10) {
                    CC += sum;
                    countCCTransaction++;
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }
            } else {                         //cash
                if (sum <= 100) {
                    CS += sum;
                    countCSTransaction++;
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }
            }
            if ((CC + CS) >= desiredSum) {
                isCollected = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isCollected) {
            System.out.printf("Average CS: %.2f%n", CS / countCSTransaction);
            System.out.printf("Average CC: %.2f%n", CC / countCCTransaction);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
