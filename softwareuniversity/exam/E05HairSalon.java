package softwareuniversity.exam;

import java.util.Scanner;

public class E05HairSalon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

// Подстригване (haircut):
//o Мъжко (mens) - 15лв.
//o Дамско (ladies) – 20лв.
//o Детско (kids) – 10лв.
// Боядисване (color):
//o Поддръжка (touch up) – 20лв.
//o Пълно боядисване (full color) – 30лв
        int target = Integer.parseInt(scanner.nextLine());
        String input = "";
        int price = 0;
        int sum = 0;
        boolean isEnough = false;

        while (!input.equals("closed")) {
            String service = input;
            if (service.equals("haircut")) {
                String typeHaircut = scanner.nextLine();
                switch (typeHaircut) {
                    case "mens": {
                        price = 15;
                        sum += price;
                        break;
                    }
                    case "ladies": {
                        price = 20;
                        sum += price;
                        break;
                    }
                    case "kids": {
                        price = 10;
                        sum += price;
                        break;
                    }
                }
            } else if ((service.equals("color"))) {
                String typeColor = scanner.nextLine();
                switch (typeColor) {
                    case "touch up": {
                        price = 20;
                        sum += price;
                        break;
                    }
                    case "full color": {
                        price = 30;
                        sum += price;
                        break;
                    }
                }
            }
            if (sum >= target) {
                isEnough = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isEnough) {
            System.out.printf("You have reached your target for the day!%n");
            System.out.printf("Earned money: %dlv.", sum);
        } else {
            System.out.printf("Target not reached! You need %dlv. more.%n", target - sum);
            System.out.printf("Earned money: %dlv.", sum);
        }
    }
}
