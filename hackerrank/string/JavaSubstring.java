package hackerrank.string;

import java.util.Scanner;

public class JavaSubstring {

    public static void main(String[] args) {

        //Sample Input
        //
        //Helloworld
        //3 7
        //Sample Output
        //
        //lowo

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.close();

        System.out.println(str.substring(start, end));
    }
}
