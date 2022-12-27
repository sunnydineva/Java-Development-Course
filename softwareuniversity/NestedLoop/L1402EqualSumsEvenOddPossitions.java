package softwareuniversity.NestedLoop;

import java.util.Scanner;

public class L1402EqualSumsEvenOddPossitions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber ; i++) {
            String number = "" + i;

            int evenSum =0;
            int oddSum =0;

            for (int j = 0; j < number.length(); j++) {
                int lastDigit = Integer.parseInt(""+ number.charAt(j));  //int lastDigit = number.charAt(j)


                if (j % 2 == 0) {
                    evenSum += lastDigit;
                } else {
                    oddSum += lastDigit;
                }
                            }
            if (evenSum == oddSum) {
                System.out.printf(i + " ");
            }

        }



    }
}
