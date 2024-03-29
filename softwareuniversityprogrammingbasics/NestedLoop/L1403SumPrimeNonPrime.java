package softwareuniversityprogrammingbasics.NestedLoop;

import java.util.Scanner;

public class L1403SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sumPrime = 0;
        int sumNotPrime = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            int counter = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {// проверка за естествени делители
                    counter++;
                }
            }
            if (counter == 2) { // проверка дали е простоо число - само с 2 делителя
                sumPrime += number;
            } else {
                sumNotPrime += number;
            }

            input = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNotPrime);
    }
}
