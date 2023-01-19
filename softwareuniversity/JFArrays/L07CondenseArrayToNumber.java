package softwareuniversity.JFArrays;
import java.util.Arrays;
import java.util.Scanner;

public class L07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program to read an array of integers and condense them by summing adjacent couples of elements
        // until a single integer is obtained. For example, if we have 3 elements {2, 10, 3},
        // we sum the first two and the second two elements and obtain {2+10, 10+3} = {12, 13},
        // then we sum again all adjacent elements and obtain {12+13} = {25}.
        //2 10 3	25	2 10 3  2+10 10+3  12 13  12 + 13  25
        //5 0 4 1 2	35	5 0 4 1 2  5+0 0+4 4+1 1+2  5 4 5 3  5+4 4+5 5+3  9 9 8  9+9 9+8  18 17  18+17  35
        //1	1	1 is already condensed to number

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int subSum = numbers[0];
        String subArray = "";
        int subSum2 = numbers[0];

        for (int i = 0; i < numbers.length - 1; i++) {
            subSum = numbers[i] + numbers[i + 1];
            //System.out.println(subSum);
            subArray = subArray + (subSum + " ");
            //System.out.println("SubArray: " + subArray);
        }
        while (subArray.length() >= 1) {
            int[] numbers2 = Arrays
                    .stream(subArray.split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
            subArray = "";
            for (int j = 0; j < numbers2.length - 1; j++) {
                subSum2 = numbers2[j] + numbers2[j + 1];
                //System.out.println("Total sum " + subSum2);

                 subArray = subArray + (subSum2 + " ");
                 //System.out.println("SubArray: " + subArray);
            }
        }
        System.out.println(subSum2);
    }
}