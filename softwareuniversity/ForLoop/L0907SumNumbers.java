package softwareuniversity.ForLoop;

import java.util.Scanner;

public class L0907SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
