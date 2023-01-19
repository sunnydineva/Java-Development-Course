package softwareuniversity.exam;

import java.util.Scanner;

public class E02FootballKit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tShirt = Double.parseDouble(scanner.nextLine());
        double target = Double.parseDouble(scanner.nextLine());
        double shorts = tShirt * 0.75;
        double socks = shorts * 0.20;
        double spikes = (tShirt + shorts) * 2;
        double subTotal = tShirt + shorts + socks + spikes;
        double discount = subTotal * 0.15;
        double total = subTotal - discount;

        if (total >= target) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", total);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", target - total);
        }
    }
}
