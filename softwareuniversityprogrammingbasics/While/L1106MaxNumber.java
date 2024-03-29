package softwareuniversityprogrammingbasics.While;

import java.util.Scanner;

public class L1106MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNum = Integer.MIN_VALUE;
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Stop")) {
            int currentNum = Integer.parseInt(inputLine);
            if (currentNum > maxNum) {
                maxNum = currentNum;
            }
            inputLine = scanner.nextLine();
        }
        System.out.println(maxNum);
    }
}
