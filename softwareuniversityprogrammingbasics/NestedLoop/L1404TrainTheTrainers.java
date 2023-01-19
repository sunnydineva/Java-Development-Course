package softwareuniversityprogrammingbasics.NestedLoop;

import java.util.Scanner;

public class L1404TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int judges = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int countGrades = 0;
        double sumAllGrades = 0;

        while (!command.equals("Finish")) {
            String presentationName = command;
            double sumGrades = 0;
            for (int i = 1; i <= judges; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                countGrades++;
                sumGrades += grade;
            }
            sumAllGrades += sumGrades;
            double avgGrade = sumGrades / judges;
            System.out.printf("%s - %.2f.%n", presentationName, avgGrade);

            command = scanner.nextLine();
        }
        double finalGrade = sumAllGrades / countGrades;
        System.out.printf("Student's final assessment is %.2f.", finalGrade);
    }
}
