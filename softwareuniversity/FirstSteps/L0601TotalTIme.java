package ConditionalStatements;

import java.util.Scanner;

public class L0601TotalTIme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int totalTIme = firstNumber + secondNumber + thirdNumber;

        int minutes = totalTIme / 60;
        int seconds = totalTIme % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}

