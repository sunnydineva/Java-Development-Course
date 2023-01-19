package softwareuniversity.NestedLoop;

import java.util.Scanner;

public class L1304SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isValid = false;

        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= end; j++) {
                count++;
                int sum = i + j;
                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d ", count);
                    System.out.printf("(%d + %d = %d)%n", i, j, sum);
                    isValid = true;
                    break;
                }
            }
            if (isValid) {
                break;
            }
        }
        if (!isValid) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }
    }
}
