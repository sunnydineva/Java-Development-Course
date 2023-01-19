package softwareuniversityprogrammingbasics.JFArrays;

import java.util.Scanner;

public class L04ReverseArrayOfStrings {
    public static void main(String[] args) {

        //Write a program to read an array of strings, reverse it and print its elements.
        // The input consists of a sequence of space-separated strings.
        // Print the output on a single line (space separated).Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        for (int i = 0; i < elements.length / 2; i++) {
            String oldElement = elements[i];
            elements[i] = elements[elements.length - 1 - i];
            elements[elements.length - 1 - i] = oldElement;
        }
        System.out.println(String.join(" ", elements));
    }
}
