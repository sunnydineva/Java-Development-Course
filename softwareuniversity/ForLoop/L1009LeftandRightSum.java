package softwareuniversity.ForLoop;

import java.util.Scanner;

public class L1009LeftandRightSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;
        int leftSum = 0;

        for (int i = 1; i <= 2 * n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            totalSum = totalSum + number;
            if (i <= n) {
                leftSum = leftSum + number;
            }
        }
        int rightSum = totalSum - leftSum;
        int diff = Math.abs(rightSum - leftSum);
        if (rightSum == leftSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", diff);
        }
    }
}
