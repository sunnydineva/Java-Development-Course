package softwareuniversity.ForLoop;

import java.util.Scanner;

public class L10A04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double topStudents = 0;
        double veryGoodStudents = 0;
        double goodStudents = 0;
        double failedStudents = 0;
        double rateSum = 0;


        int students = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= students ; i++) {

            double rate = Double.parseDouble(scanner.nextLine());
            rateSum = rateSum + rate;

            if (rate >=5) {
                topStudents++;

            } else if (rate >=4) {
                veryGoodStudents++;

            } else if (rate >= 3) {
                goodStudents++;

            } else {
                failedStudents++;
            }
        }

        System.out.println();
        System.out.printf("Top students: %.2f%%%n", topStudents / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", veryGoodStudents / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", goodStudents / students * 100);
        System.out.printf("Fail: %.2f%%%n", failedStudents / students * 100);
        System.out.printf("Average: %.2f", rateSum / students);

    }
}
