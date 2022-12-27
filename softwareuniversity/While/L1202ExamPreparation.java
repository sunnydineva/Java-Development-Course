package softwareuniversity.While;

import java.util.Scanner;

public class L1202ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPoorGrades = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        double sumGrades = 0;
        int countProblemsSolved = 0;
        int countPoorGrades = 0;
        boolean isNeedBreak = false;
        String lastProblem = "";

        while (!command.equals("Enough")) {
            String currentProblem = command;
            double grade = Double.parseDouble(scanner.nextLine());
            countProblemsSolved ++;
            lastProblem = currentProblem;

            if (grade <= 4) {
                countPoorGrades ++;
            }

            sumGrades += grade;

            if (countPoorGrades >= maxPoorGrades) {
                isNeedBreak = true;
                break;
            }

            command = scanner.nextLine();

        }

        if (isNeedBreak) {
            System.out.printf("You need a break, %d poor grades.%n", countPoorGrades);
        } else {
            System.out.printf("Average score: %.2f%n", sumGrades / countProblemsSolved);
            System.out.printf("Number of problems: %d%n", countProblemsSolved);
            System.out.printf("Last problem: %s%n", lastProblem);
        }

    }
}
