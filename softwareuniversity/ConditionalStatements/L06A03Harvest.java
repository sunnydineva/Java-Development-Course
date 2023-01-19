package softwareuniversity.ConditionalStatements;

import java.util.Scanner;

public class L06A03Harvest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int X = Integer.parseInt(scanner.nextLine()); //X кв.м е лозето
        double Y = Double.parseDouble(scanner.nextLine());// От 1 кв.м лозе се изкарват Y килограма грозде.
        int Z = Integer.parseInt(scanner.nextLine()); // Желаното количество вино за продан е Z литра.
        int workers = Integer.parseInt(scanner.nextLine());
        double grapeForProduction = X * Y * 0.4; // От лозе с площ X квадратни метри се заделя 40% от реколтата за производство на вино.
        double wineAvailable = grapeForProduction / 2.5;// За 1 литър вино са нужни 2,5 кг. грозде.
        double wineNeeded = Z * 1.0 - wineAvailable;
        double wineXtra = wineAvailable - Z * 1.0;
        double winePerWorker = wineXtra / workers;

        if (wineAvailable < Z) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineNeeded));
        } else if (wineAvailable >= Z) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(wineAvailable));
            System.out.println();
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineXtra), Math.ceil(winePerWorker));
        }
    }
}
