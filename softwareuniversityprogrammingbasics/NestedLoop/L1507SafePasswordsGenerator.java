package softwareuniversityprogrammingbasics.NestedLoop;

import java.util.Scanner;

public class L1507SafePasswordsGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());
        char A = 34;
        char B = 63;
        int countCombinations = 0;

        for (int x = 1; x <= a; x++) {
            for (int y = 1; y <= b; y++) {
                A++;
                if (A > 55) {
                    A = 35;
                }
                B++;
                if (B > 96) {
                    B = 64;
                }
                countCombinations++;
                if (countCombinations <= maxPasswords) {
                    System.out.printf("%c%c%d%d%c%c|", A, B, x, y, B, A);
                }
            }
        }
    }
}
