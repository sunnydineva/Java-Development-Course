package softwareuniversity.ForLoop;

import java.util.Scanner;

public class L1007TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        String peak = "";
        int peopleTotal = 0;
        int peopleMusala = 0;
        int peopleMonblan = 0;
        int peopleKilimandanjaro = 0;
        int peopleK2 = 0;
        int peopleEverest = 0;

        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            if (people <= 5) {
                peak = "Musala";
                peopleTotal = peopleTotal + people;
                peopleMusala = peopleMusala + people;
            } else if (people <= 12) {
                peak = "Monblan";
                peopleTotal = peopleTotal + people;
                peopleMonblan = peopleMonblan + people;
            } else if (people <= 25) {
                peak = "Kilimandjaro";
                peopleTotal = peopleTotal + people;
                peopleKilimandanjaro = peopleKilimandanjaro + people;
            } else if (people <= 40) {
                peak = "K2";
                peopleTotal = peopleTotal + people;
                peopleK2 = peopleK2 + people;
            } else {
                peak = "Everest";
                peopleTotal = peopleTotal + people;
                peopleEverest = peopleEverest + people;
            }
        }
        System.out.printf("%.2f%%%n", peopleMusala * 1.0 / peopleTotal * 100);
        System.out.printf("%.2f%%%n", peopleMonblan * 1.0 / peopleTotal * 100);
        System.out.printf("%.2f%%%n", peopleKilimandanjaro * 1.0 / peopleTotal * 100);
        System.out.printf("%.2f%%%n", peopleK2 * 1.0 / peopleTotal * 100);
        System.out.printf("%.2f%%%n", peopleEverest * 1.0 / peopleTotal * 100);
    }
}
