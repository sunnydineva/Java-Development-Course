package softwareuniversity.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L08A07SchoolCamp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());
        double nightPrice = 0;
        String sport = "";

        switch (season) {
            case "Winter": {
                switch (groupType) {
                    case "boys": {
                        nightPrice = 9.60;
                        sport = "Judo";
                    }
                    break;
                    case "girls": {
                        nightPrice = 9.60;
                        sport = "Gymnastics";
                    }
                    break;
                    case "mixed": {
                        nightPrice = 10;
                        sport = "Ski";
                    }
                }
            }
            break;
            case "Spring": {
                switch (groupType) {
                    case "boys": {
                        nightPrice = 7.20;
                        sport = "Tennis";
                    }
                    break;
                    case "girls": {
                        nightPrice = 7.20;
                        sport = "Athletics";
                    }
                    break;
                    case "mixed": {
                        nightPrice = 9.50;
                        sport = "Cycling";
                    }
                }
            }
            break;
            case "Summer": {
                switch (groupType) {
                    case "boys": {
                        nightPrice = 15;
                        sport = "Football";
                    }
                    break;
                    case "girls": {
                        nightPrice = 15;
                        sport = "Volleyball";
                    }
                    break;
                    case "mixed": {
                        nightPrice = 20;
                        sport = "Swimming";
                    }
                }
            }
            break;
        }

        double discount = 0;
        if (studentsCount >= 50)
            discount = 50;
        else if (studentsCount >= 20)
            discount = 15;
        else if (studentsCount >= 10)
            discount = 5;
        double totalPrice = studentsCount * nightPrice * nightsCount;
        totalPrice = totalPrice - totalPrice * discount * 0.01;
        System.out.printf("%s %.2f lv.", sport, totalPrice);
    }
}
