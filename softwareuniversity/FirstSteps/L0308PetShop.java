package softwareuniversity.FirstSteps;

import java.util.Scanner;

public class L0308PetShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double DogsFoodCount = Double.parseDouble(scan.nextLine());
        double CatsFoodCount = Double.parseDouble(scan.nextLine());
        double DogsExpenses = DogsFoodCount * 2.5;
        double CatsExpenses = CatsFoodCount * 4;
        double totalSum = DogsExpenses + CatsExpenses;

        System.out.println(totalSum + " lv.");
    }
}