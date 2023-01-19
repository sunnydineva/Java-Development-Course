package softwareuniversityprogrammingbasics.JFArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingArrayValuesfromASingleLineShorter {

    public static void main(String[] args) {
        //Read an array of integers using functional programming:
        //2 8 30 25 40 72 -2 44 56
        Scanner sc = new Scanner(System.in);

        //import java.util.Arrays
        String inputLine = sc.nextLine();
        String[] items = inputLine.split(" ");
        int[] arr = Arrays.stream(items)
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        //To print all array elements, a for-loop can be used
        //Separate elements with white space or a new line
        // == new String [] {"one", "two"};
        // Process all array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %s%n", i, arr[i]);
        }

        //you can chain methods
        int[] arr2 = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
    }
}
