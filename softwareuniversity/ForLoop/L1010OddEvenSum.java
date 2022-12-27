package softwareuniversity.ForLoop;

import java.util.Scanner;

public class L1010OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) { // even
                sumEven = sumEven + number;
            } else {
                sumOdd = sumOdd + number;
            }
        }

        int diff = Math.abs(sumEven - sumOdd);

        if (sumEven == sumOdd) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEven);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }

    }
}
