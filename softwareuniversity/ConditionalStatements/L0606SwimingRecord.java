package softwareuniversity.ConditionalStatements;

import java.util.Scanner;

public class L0606SwimingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double record = Double.parseDouble(scanner.nextLine());
        Double distance = Double.parseDouble(scanner.nextLine());
        Double speed = Double.parseDouble(scanner.nextLine());

        double timeIvan = distance * speed;

        double delay = Math.floor(distance /15);
        double resistance = delay * 12.5;
        double ivanTimeWithDelay = timeIvan + resistance;

        if (ivanTimeWithDelay < record) {

            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanTimeWithDelay);

        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",  ivanTimeWithDelay - record);
        }


    }
}