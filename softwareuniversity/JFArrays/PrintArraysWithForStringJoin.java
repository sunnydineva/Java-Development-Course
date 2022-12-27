package softwareuniversity.JFArrays;

import java.util.Scanner;

public class PrintArraysWithForStringJoin {
    public static void main(String[] args) {
//Use for-loop:
        String[] arr = {"one", "two"};
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);



//Use String.join(separator, array):
//Works only with strings
        String[] strings = { "one", "two" };
        System.out.println(String.join(" ", strings)); // one two
        int[] arr2 = { 1, 2, 3 };
        System.out.println(String.join(" ", arr)); // Compile error

//Solution: Reverse Array of Strings
        Scanner sc = new Scanner(System.in);
        String[] elements = sc.nextLine().split(" ");
        for (int i = 0; i < elements.length / 2; i++) {
            String oldElement = elements[i];
            elements[i] = elements[elements.length - 1 - i];
            elements[elements.length - 1 - i] = oldElement;
        }
        System.out.println(String.join(" ", elements));


    }
}
