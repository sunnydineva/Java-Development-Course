package softwareuniversityprogrammingbasics.ConditionalStatements;

import java.util.Scanner;

public class L0503EvenorOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}