package softwareuniversity.ForLoop;

import java.util.Scanner;

public class L1008TennisRanklist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tours = Integer.parseInt(scanner.nextLine());
        int pointsAtStart = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int toursWon = 0;
        for (int i = 1; i <= tours; i++) {
            String tourExit = scanner.nextLine();
            switch (tourExit) {
                case "W": {
                    points = points + 2000;
                    toursWon++;

                }
                break;
                case "F": {
                    points = points + 1200;
                }
                break;
                case "SF": {
                    points = points + 720;
                }
            }
        }
        int finalPoints = pointsAtStart + points;
        System.out.printf("Final points: %d%n", finalPoints);
        int averagePoints = points / tours;
        System.out.printf("Average points: %d%n", averagePoints);
        double WinPercent = toursWon * 1.0 / tours * 100;
        System.out.printf("%.2f%%", WinPercent);
    }
}
