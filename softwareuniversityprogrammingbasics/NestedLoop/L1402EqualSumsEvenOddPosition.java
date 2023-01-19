package softwareuniversityprogrammingbasics.NestedLoop;

import java.util.Scanner;

public class L1402EqualSumsEvenOddPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {
            int currentNumber = i;
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 6; j >= 1; j--) {
                int lastDigit = currentNumber % 10; // взимаме последната цифра
                if (j % 2 == 0) {
                    evenSum += lastDigit;
                } else {
                    oddSum += lastDigit;
                }
                currentNumber = currentNumber / 10; //махаме последната цифра
            }
            if (evenSum == oddSum) {
                System.out.printf(i + " ");
            }
        }
    }
}
