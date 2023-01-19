package softwareuniversityprogrammingbasics.JFArrays;

import java.util.Arrays;
import java.util.Scanner;

public class L03SumEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays   // First, we need to read the array.
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e ->Integer.parseInt(e))
                .toArray();

        int sumEven = 0; //We will need a variable for the sum.

        for (int i = 0; i < numbers.length; i++) {  //Iterate through all elements in the array with for loop.
            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            }
        }
        System.out.println(sumEven);
    }
}
