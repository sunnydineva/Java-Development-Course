package softwareuniversity.ConditionalStatements;

import java.util.Scanner;

public class L06A05Pets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//    Марина обича да пътува. Тя има 3 домашни любимеца (куче, котка и костенурка).
//    Когато заминава на пътешествие трябва да съобрази колко храна да им остави, за да не останат гладни.
//    Напишете програма, която пресмята колко килограма храна ще изядат всички за времето, в което Марина отсъства и дали оставената храна от нея ще им е достатъчна.
//    Всяко животно изяжда определено количество храна на ден.

        int days = Integer.parseInt(scanner.nextLine());
        int foodLeftKg = Integer.parseInt(scanner.nextLine());
        double foodForDogKg = Double.parseDouble(scanner.nextLine());
        double foodForCatKg = Double.parseDouble(scanner.nextLine());
        double foodForTurtleGrams = Double.parseDouble(scanner.nextLine());
        double foodForAllPets = days * (foodForDogKg + foodForCatKg + foodForTurtleGrams / 1000);
        double foodBalance = Math.abs(foodForAllPets - foodLeftKg);

        if (foodForAllPets <= foodLeftKg) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodBalance));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodBalance));
        }
    }
}
