package softwareuniversityprogrammingbasics.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L08A10MultiplyBy2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < Math.abs(Integer.MAX_VALUE); i++) {
            double input = Double.parseDouble(scanner.nextLine());
            if (input < 0) {
                System.out.println("Negative number!");
                break;
            } else {
                System.out.printf("Result: %.2f%n", input * 2);
            }
        }
    }
}
