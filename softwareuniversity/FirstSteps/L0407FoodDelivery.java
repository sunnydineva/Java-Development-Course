package softwareuniversity.FirstSteps;

import java.util.Scanner;

public class L0407FoodDelivery {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int countChickenMenu = Integer.parseInt(scan.nextLine());
        int countFishMenu = Integer.parseInt(scan.nextLine());
        int countVegetarianMenu = Integer.parseInt(scan.nextLine());
        double TotalMenus = countChickenMenu * 10.35 + countFishMenu * 12.40 + countVegetarianMenu * 8.15;
        double priceDesert = TotalMenus * 0.2;
        double TotalPrice = TotalMenus + priceDesert + 2.50;

        System.out.println(TotalPrice);
    }
}