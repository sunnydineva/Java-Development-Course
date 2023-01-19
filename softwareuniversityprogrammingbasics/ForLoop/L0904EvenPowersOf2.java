package softwareuniversityprogrammingbasics.ForLoop;

import java.util.Scanner;

public class L0904EvenPowersOf2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 1; //ако е нула, ще върне некоректен резултат
        for (int i = 0; i <= n; i += 2) {
            System.out.println(num);
            num = num * 2 * 2; // четни степени на двойката
        }
    }
}
