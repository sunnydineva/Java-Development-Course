package softwareuniversity.JFArrays;

import java.util.Arrays;
import java.util.Scanner;

public class L05EvenAndOddSubtraction {
    public static void main(String[] args) {
        //Write a program that calculates the difference between
        // the sum of the even and the sum of the odd numbers in an array.
        //1 2 3 4 5 6
        // 2 + 4 + 6 = 12
        //1 + 3 + 5 = 9
        //12 – 9 = 3
        Scanner scanner = new Scanner(System.in);

        // First, we need to read the array.
        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        //We will need a variable for the sum.
        int sumEven = 0;
        int sumOdd = 0;
//Iterate through all elements in the array with for loop. If the number is even, add it to the sum.
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            } else {
                sumOdd += numbers[i];
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}

