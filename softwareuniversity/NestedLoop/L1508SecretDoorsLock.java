package softwareuniversity.NestedLoop;

import java.util.Scanner;

public class L1508SecretDoorsLock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hundredsCeil = Integer.parseInt(scanner.nextLine());
        int dozensCeil = Integer.parseInt(scanner.nextLine());
        int unitsCeil = Integer.parseInt(scanner.nextLine());


        for (int hundreds = 1; hundreds <= hundredsCeil; hundreds++) {
            boolean isDozensPrime = false;

            for (int dozens = 1; dozens <= dozensCeil; dozens++) {
                int countNatDividers = 0;
                for (int k = 1; k <= dozens; k++) {
                    if (dozens % k == 0) {
                        countNatDividers++;
                    }
                    if (countNatDividers == 2) {
                        isDozensPrime = true;
                    } else {
                        isDozensPrime = false;

                    }
                }

                for (int units = 1; units <= unitsCeil; units++) {


                    if ((hundreds % 2 == 0) && (units % 2 == 0) && (isDozensPrime) && (dozens >= 2) && (dozens <= 7)) {
                        System.out.printf("%d %d %d %n", hundreds, dozens, units);
                    }

                }

            }

        }


    }
}
