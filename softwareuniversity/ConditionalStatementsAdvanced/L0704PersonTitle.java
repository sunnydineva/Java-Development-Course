package softwareuniversity.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L0704PersonTitle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//  Да се напише конзолна програма, която прочита възраст (десетично число) и пол ("m" или "f"),
//  въведени от потребителя и отпечатва обръщение измежду следните:
//· "Mr." - мъж (пол "m") на 16 или повече години
//· "Master" - момче (пол "m") под 16 години
//· "Ms." - жена (пол "f") на 16 или повече години
//· "Miss" - момиче (пол "f") под 16 години

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (age >= 16) {
            if (gender.equals("m")) {
                System.out.println("Mr.");
            } else if (gender.equals("f")) {
                System.out.println("Ms.");
            }
        } else if (age < 16) {
            if (gender.equals("f")) {
                System.out.println("Miss");
            } else if (gender.equals("m")) {
                System.out.println("Master");
            }
        }
    }
}
