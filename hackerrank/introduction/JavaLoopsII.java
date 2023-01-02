package hackerrank.introduction;

import java.util.Arrays;
import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = Integer.parseInt(scanner.nextLine());
        int a = 0;
        int b = 0;
        int n = 0;
        for (int i = 0; i < q; i++) {
            int[] array = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(value -> Integer.parseInt(value))
                    .toArray();
            for (int j = 0; j < array.length; j++) {
                a = array[0];
                b = array[1];
                n = array[2];
            }
            int result = a;
            StringBuilder output = new StringBuilder(String.valueOf(new StringBuilder()));
            for (int k = 0; k < n; k++) {
                int sumToAdd = ((int) Math.pow(2, k) * b);
                result = result + sumToAdd;
                output.append(String.valueOf(result)).append(" ");
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
