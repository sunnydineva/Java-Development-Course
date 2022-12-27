package softwareuniversity.exam;

import java.util.Scanner;

public class E04GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double degreesForLiter= 0;
        double totalDegreesForLiter= 0;
        double totalLiters = 0;

        for (int i = 1; i <= days ; i++) {
            double liters = Double.parseDouble(scanner.nextLine());
            totalLiters += liters;
            double degree = Double.parseDouble(scanner.nextLine());
            degreesForLiter = liters * degree;
            totalDegreesForLiter += degreesForLiter;

        }

        double avgDegree = totalDegreesForLiter / totalLiters;

        System.out.printf("Liter: %.2f%n", totalLiters);
        System.out.printf("Degrees: %.2f%n", avgDegree);

        if (avgDegree < 38) {
            System.out.printf("Not good, you should baking!");
        } else if (avgDegree <= 42) {
            System.out.printf("Super!");
        } else {
            System.out.printf("Dilution with distilled water!");
        }

    }
}
