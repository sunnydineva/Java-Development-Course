package softwareuniversity.ConditionalStatements;

import java.util.Scanner;

public class L06A012SleepyTomCat {
    public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);

    int vacationDays = Integer.parseInt(scanner.nextLine());
    int playNorm = 30000;
    int workingDays = 365 - vacationDays;
    int playtime = workingDays * 63 + (365 - workingDays) * 127;
        //  Ако времето за игра на Том е над нормата за текущата година:
    if (playtime > playNorm) {
//    o На първия ред отпечатайте: “Tom will run away”
//    o На втория ред отпечатайте разликата от нормата във формат:
//     “{H} hours and {M} minutes more for play”
        int timeLeftHours = (playNorm - playtime) / 60;
        int timeLeftMinutes = (playNorm - playtime) % 60;
        System.out.println("Tom will run away");
        System.out.printf("%d hours and %d minutes more for play", Math.abs(timeLeftHours), Math.abs(timeLeftMinutes));
    } else {
        //На първия ред отпечатайте: “Tom sleeps well”
//    o На втория ред отпечатайте разликата от нормата във формат:
//    “{H} hours and {M} minutes less for play”
        int timeLeftHours = (playNorm - playtime) / 60;
        int timeLeftMinutes = (playNorm - playtime) % 60;
        System.out.println("Tom sleeps well");
        System.out.printf("%d hours and %d minutes less for play", Math.abs(timeLeftHours), Math.abs(timeLeftMinutes));

    }





    }

}
