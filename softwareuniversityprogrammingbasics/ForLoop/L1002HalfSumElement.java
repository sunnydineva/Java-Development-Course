package softwareuniversityprogrammingbasics.ForLoop;

import java.util.Scanner;

public class L1002HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum = sum + currentNumber; //sum += currentNumber;
            if (currentNumber > max) {
                max = currentNumber;
            }
        }
        sum = sum - max;
        if (sum == max) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sum - max));
        }
    }
}

