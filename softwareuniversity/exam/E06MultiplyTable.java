package softwareuniversity.exam;

import java.util.Scanner;

public class E06MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int lastDigit = number % 10;

        number = number / 10;

        int middleDigit = number % 10;

        int firstDigit = number / 10;

        for (int i = 1; i <= lastDigit; i++) {
            for (int j = 1; j <= middleDigit; j++) {
                for (int k = 1; k <= firstDigit; k++) {
                    int result = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, result);
                }
            }

        }


//            for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <=10 ; j++) {
//                int result = i * j;
//                System.out.printf("%d * %d = %d%n", i, j, result);
//
//            }
//
//        }


    }

}


