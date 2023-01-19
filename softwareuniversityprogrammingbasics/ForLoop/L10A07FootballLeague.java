package softwareuniversityprogrammingbasics.ForLoop;

import java.util.Scanner;

public class L10A07FootballLeague {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 1; i <= fans; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A": {
                    sectorA++;
                    break;
                } case "B": {
                    sectorB++;
                    break;
                } case "V": {
                    sectorV++;
                    break;
                } case "G": {
                    sectorG++;
                    break;
                }
            }
        }
        System.out.printf("%.2f%%%n", sectorA * 1.0 / fans * 100);
        System.out.printf("%.2f%%%n", sectorB * 1.0 / fans * 100);
        System.out.printf("%.2f%%%n", sectorV * 1.0 / fans * 100);
        System.out.printf("%.2f%%%n", sectorG * 1.0 / fans * 100);
        System.out.printf("%.2f%%", fans * 1.0 / stadiumCapacity * 100);
    }
}
