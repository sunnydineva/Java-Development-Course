package softwareuniversityprogrammingbasics.ForLoop;

import java.util.Scanner;

public class L1006Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());
        double calculatedPoints = 0;
        double SubTotalPoints = pointsFromAcademy;
        double pointsForNomination = 1250.5;

        for (int i = 1; i <= jury; i++) {
            String judge = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            int lengthNameJudge = judge.length();
            calculatedPoints = lengthNameJudge * points / 2;
            SubTotalPoints = SubTotalPoints + calculatedPoints;
            if (SubTotalPoints >= pointsForNomination) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, SubTotalPoints);
                break;
            }
        }
        double diff = Math.abs(SubTotalPoints - pointsForNomination);
        if (SubTotalPoints < pointsForNomination) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
        }
    }
}
