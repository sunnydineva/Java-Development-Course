package softwareuniversity.While;

import java.util.Scanner;

public class L1108Graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double sumAllGrade = 0;
        int year = 1;
        int poorGradesCount = 0;
        boolean isExcluded = false;

        while (year <= 12) {
            if (poorGradesCount > 1) {
                isExcluded = true;
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                poorGradesCount++;
                continue;
            }
            sumAllGrade += grade;
            year++;
        }
        if (isExcluded) {
            System.out.printf("%s has been excluded at %d grade%n", name, year);
        } else {
            double avgGrade = sumAllGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f%n", name, avgGrade);
        }
    }
}
