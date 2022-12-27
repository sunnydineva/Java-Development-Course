package softwareuniversity.While;

import java.util.Scanner;

public class L1203Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int count5spent = 0;
        int totalDays = 0;
        double totalMoney = availableMoney;
        boolean is5daysSpend = false;

        while (totalMoney < neededMoney) {
            totalDays ++;
            String action = scanner.nextLine();
            double moneySavedOrSpared = Double.parseDouble(scanner.nextLine());

            switch (action) {
                case "save": {
                    count5spent = 0;
                    totalMoney += moneySavedOrSpared;
                    break;

                } case "spend": {
                    count5spent ++;
                    totalMoney -= moneySavedOrSpared;
                    if (totalMoney < 0) {
                        totalMoney = 0;
                    }
                    break;
                }
            }
            if (count5spent == 5) {
                is5daysSpend = true;
                break;
            }



        }

        if (is5daysSpend) {
            System.out.printf("You can't save the money.%n" +
                    "%d", totalDays);
        } else {
            System.out.printf("You saved the money for %d days.", totalDays);

        }



    }
}
