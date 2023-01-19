package softwareuniversity.ForLoop;

import java.util.Scanner;

public class L10A08EqualPairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int a = 0;
        int b = 0;
        int sum = 0;
        int toCompare = 0;
        boolean isEqual = false;
        int value = 0;
        int maxDiff = 0;

        for (int i = 1; i <= n * 2; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (n == 1) {
                if (i % 2 == 0) {
                    b = input;
                    sum = a + b;
                    value = sum;
                    isEqual = true;
                    toCompare = sum;
                } else {
                    a = input;
                }
            } else
                if (i % 2 == 0) {
                b = input;
                sum = a + b;
                if (sum == toCompare) {
                    value = sum;
                    isEqual = true;
                } else {
                    maxDiff = Math.abs(sum - toCompare);
                    isEqual = false;
                }
                toCompare = sum;
                a = 0;
                b = 0;
            } else {
                a = input;
            }
        }
        if (isEqual) {
            System.out.printf("Yes, value=%d", value);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}

