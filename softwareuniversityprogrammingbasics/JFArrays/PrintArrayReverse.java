package softwareuniversityprogrammingbasics.JFArrays;
import java.util.Scanner;

public class PrintArrayReverse {
    public static void main(String[] args) {

        // Read the array (n lines of integers)
        //2 8 30 25 40 72 -2 44 56
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(sc.nextLine());

       // Print the elements from the last to the first
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
