package softwareuniversity.While;

import java.util.Scanner;

public class L12A01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mlInBottle = 750;

        int DetergentForDish = 5;
        int detergentForPot = 15;

        int bottles = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int detergent = bottles * mlInBottle;

        int countPots = 0;
        int countDishes = 0;
        int countLoadingDishwasher = 0;
        boolean isEnough = true;

        while (!input.equals("End")) {

            int num = Integer.parseInt(input);
            countLoadingDishwasher ++;

            if (countLoadingDishwasher % 3 == 0) {
                    detergent -= num * detergentForPot;
                    countPots += num;
            } else {
                    detergent -= num * DetergentForDish;
                    countDishes += num;
            }
            if (detergent < 0) {
                isEnough = false;
                break;
            }
            input = scanner.nextLine();

        }
        if (!isEnough) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergent));

        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", countDishes, countPots);
            System.out.printf("Leftover detergent %d ml.%n", Math.abs(detergent));
        }



    }

}
