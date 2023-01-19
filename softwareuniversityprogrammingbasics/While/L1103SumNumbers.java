package softwareuniversityprogrammingbasics.While;

import java.util.Scanner;

public class L1103SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int intNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (sum < intNum) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;
        }
        System.out.println(sum);
    }
}
