package softwareuniversity.While;

import java.util.Scanner;

public class L1205Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double sumCoins = change * 100;

        int countCoins = 0;


        while (sumCoins > 0) {
            if (sumCoins >= 200) {
                countCoins++;
                sumCoins -= 200;

            } else if (sumCoins >= 100) {
                countCoins++;
                sumCoins -= 100;

            } else if (sumCoins >= 50) {
                countCoins++;
                sumCoins -= 50;

            } else if (sumCoins >= 20) {
                countCoins++;
                sumCoins -= 20;

            } else if (sumCoins >= 10) {
                countCoins++;
                sumCoins -= 10;

            } else if (sumCoins >= 5) {
                countCoins++;
                sumCoins -= 5;

            } else if (sumCoins >= 2) {
                countCoins++;
                sumCoins -= 2;

            } else if (sumCoins >= 1) {
                countCoins++;
                sumCoins -= 1;

            } else {
                break;
            }
        }

        System.out.println(countCoins);


    }
}
