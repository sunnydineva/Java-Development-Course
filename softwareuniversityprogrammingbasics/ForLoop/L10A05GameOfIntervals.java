package softwareuniversityprogrammingbasics.ForLoop;

import java.util.Scanner;

public class L10A05GameOfIntervals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());
        double numbersFrom0to9 = 0;
        double numbersFrom10to19 = 0;
        double numbersFrom20to29 = 0;
        double numbersFrom30to39 = 0;
        double numbersFrom40to50 = 0;
        double invalidNumbers = 0;
        double scores = 0;

        for (int i = 1; i <= moves ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if ((number < 0) || (number > 50)) {
            invalidNumbers ++;
            scores = scores / 2;
            } else if (number <=9) {
                numbersFrom0to9 ++;
                scores = scores + number * 0.2;
            } else if (number <=19) {
                numbersFrom10to19 ++;
                scores = scores + number * 0.3;
            } else if (number <=29) {
                numbersFrom20to29 ++;
                scores = scores + number * 0.4;
            } else if (number <= 39) {
                numbersFrom30to39 ++;
                scores = scores + 50;
            } else if (number <= 50) {
                numbersFrom40to50++;
                scores = scores + 100;
            }
        }
        System.out.printf("%.2f%n", scores);
        System.out.printf("From 0 to 9: %.2f%%%n", numbersFrom0to9 / moves * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", numbersFrom10to19 / moves * 100);
        System.out.printf(" From 20 to 29: %.2f%%%n", numbersFrom20to29 / moves * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", numbersFrom30to39 / moves * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", numbersFrom40to50 / moves * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", invalidNumbers / moves * 100);
    }
}
