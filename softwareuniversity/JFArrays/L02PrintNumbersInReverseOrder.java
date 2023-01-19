package softwareuniversity.JFArrays;

import java.util.Scanner;

public class L02PrintNumbersInReverseOrder {
    //Read n numbers and print them in reverse order.
    //3
    //10
    //20
    //30
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());

            // Print the elements from the last to the first
            for (int j = n - 1; j >= 0; j--)
                System.out.print(arr[j] + " ");
            System.out.println();
        }
    }
}
