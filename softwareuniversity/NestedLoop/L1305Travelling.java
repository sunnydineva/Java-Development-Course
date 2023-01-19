package softwareuniversity.NestedLoop;

import java.util.Scanner;

public class L1305Travelling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String destination = input;
            double budget = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while (sum < budget) {
                double savings = Double.parseDouble(scanner.nextLine());
                sum += savings;
            }
            System.out.printf("Going to %s!%n", destination);
            input = scanner.nextLine();
        }
    }
}
