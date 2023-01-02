package hackerrank.introduction;

import java.util.Arrays;
import java.util.Scanner;

public class JavaLoopsIIv2 {
    //Sample Input
    //
    //2
    //0 2 10
    //5 3 5
    //Sample Output
    //
    //2 6 14 30 62 126 254 510 1022 2046
    //8 14 26 50 98
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int q = Integer.parseInt(scanner.nextLine());
        int a = 0;
        int b = 0;
        int n = 0;

        for (int i = 0; i < q; i++) {
            a = Integer.parseInt(scanner.next());
            b = Integer.parseInt(scanner.next());
            n = Integer.parseInt(scanner.next());

            int result = a;

            for (int j = 0; j < n; j++) {
                int sumToAdd = ((int)Math.pow(2, j) * b);
                result = result + sumToAdd;
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
