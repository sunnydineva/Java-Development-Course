package hackerrank.string;

import java.util.Scanner;

public class JavaStringIntroduction {
    //There are three lines of output:
    //For the first line, sum the lengths of the two .
    //For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
    //For the third line, capitalize the first letter in both and print them on a single line, separated by a space.
    //
    //Sample Input 0
    //
    //hello
    //java
    //Sample Output 0
    //
    //9
    //No
    //Hello Java

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstString =scanner.nextLine();
        String secondString =scanner.nextLine();
        scanner.close();

        int sumLengths = firstString.length() + secondString.length();
        System.out.println(sumLengths);

        System.out.println(firstString.compareTo(secondString) > 0 ? "Yes":"No");
/*
        if(firstString.length() == secondString.length()){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
 */
        System.out.println(firstString.substring(0, 1).toUpperCase() + firstString.substring(1)
                + " " +secondString.substring(0, 1).toUpperCase() + secondString.substring(1));
    }
}
