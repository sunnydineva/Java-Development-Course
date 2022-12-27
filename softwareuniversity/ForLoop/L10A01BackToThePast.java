package softwareuniversity.ForLoop;

import java.util.Scanner;

public class L10A01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritance = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        //int startYear = 1800;

        int ageIvan = 17;
        double expensesTotal = 0;
        double expensesEvenYear = 0;
        double expensesOddYear = 0;

        for (int i = 1800; i <= year; i++) {
            ageIvan++;
            //year ++;
            if (i % 2 == 0) {
                expensesTotal = expensesTotal + 12000;

            } else {
                expensesTotal = expensesTotal + 12000 + 50 * ageIvan;

            }

        }


        double diff = Math.abs(expensesTotal - inheritance);

        if (expensesTotal <= inheritance) {

            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", diff);
        }



    }

}
