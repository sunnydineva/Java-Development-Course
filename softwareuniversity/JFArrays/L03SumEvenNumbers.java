package softwareuniversity.JFArrays;

import java.util.Arrays;
import java.util.Scanner;

public class L03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// First, we need to read the array.
        int [] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e ->Integer.parseInt(e))
                .toArray();
        //We will need a variable for the sum.
        int sumEven = 0;
//Iterate through all elements in the array with for loop.
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            }

        }
        System.out.println(sumEven);
    }
}
