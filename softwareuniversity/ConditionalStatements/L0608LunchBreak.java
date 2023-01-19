package softwareuniversity.ConditionalStatements;

import java.util.Scanner;

public class L0608LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        8. Обедна почивка
//        По време на обедната почивка искате да изгледате епизод от своя любим сериал. Вашата задача е да
//        напишете програма, с която ще разберете дали имате достатъчно време да изгледате епизода. По време на
//        почивката отделяте време за обяд и време за отдих.
//        Времето за обяд ще бъде 1/8 от времето за почивка, а
//        времето за отдих ще бъде 1/4 от времето за почивка.

        String nameSerial = scanner.nextLine();
        int durationSerial = Integer.parseInt(scanner.nextLine());
        int durationBreak = Integer.parseInt(scanner.nextLine());
        double lunchTime = durationBreak / 8.0;
        double relaxTime = durationBreak / 4.0;
        double timeLeft = durationBreak - lunchTime - relaxTime;
        double freeTime = 0;

        if (timeLeft >= durationSerial) {
            freeTime = durationBreak - lunchTime - relaxTime - durationSerial;
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameSerial, Math.ceil(freeTime));
        } else {
            freeTime = (durationBreak - lunchTime - relaxTime - durationSerial) * (-1);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameSerial, Math.ceil(freeTime));
        }
    }
}

