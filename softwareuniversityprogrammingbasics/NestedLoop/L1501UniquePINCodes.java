package softwareuniversityprogrammingbasics.NestedLoop;

import java.util.Scanner;

public class L1501UniquePINCodes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumCeiling = Integer.parseInt(scanner.nextLine());
        int secondNumCeiling = Integer.parseInt(scanner.nextLine());
        int thirdNumCeiling = Integer.parseInt(scanner.nextLine());
        int countCombinations = 0;
        int counterSecondNum = 0;
        boolean isPrimeNum = false;

        for (int firstNum = 1; firstNum <= firstNumCeiling; firstNum++) {
            for (int secondNum = 1; secondNum <= secondNumCeiling; secondNum++) {
                int counter = 0;
                for (int i = 1; i <= secondNum; i++) {
                    if (secondNum % i == 0) {
                        counter++;
                    }
                    if (counter == 2) {
                        isPrimeNum = true;
                    } else {
                        isPrimeNum = false;
                    }
                }
                if (isPrimeNum) {
                    for (int thirdNum = 1; thirdNum <= thirdNumCeiling; thirdNum++) {
                        countCombinations++;
                        if ((firstNum % 2 == 0) && (thirdNum % 2 == 0)) {
                            System.out.printf("%d ", firstNum);
                            System.out.printf("%d ", secondNum);
                            System.out.printf("%d ", thirdNum);
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
