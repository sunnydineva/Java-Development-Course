package softwareuniversity.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L0808OnTimefortheExam {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int examHour = Integer.parseInt(scanner.nextLine());
    int examMinutes = Integer.parseInt(scanner.nextLine());
    int arrivalHour = Integer.parseInt(scanner.nextLine());
    int arrivalMinutes = Integer.parseInt(scanner.nextLine());

    int examTotalMin = examHour * 60 + examMinutes;
    int arrivalTotalMin = arrivalHour * 60 + arrivalMinutes;
    int differenceMinutes = Math.abs(examTotalMin - arrivalTotalMin);

    int differenceHh = differenceMinutes / 60;
    int differenceMm = differenceMinutes % 60;

    if (arrivalTotalMin > examTotalMin) {
        System.out.println("Late");
        if (differenceMinutes <= 59)  {
            System.out.printf("%d minutes after the start", differenceMm);
        } else {
                System.out.printf("%d:%02d hours after the start", differenceHh, differenceMm);
            }
    } else if ((arrivalTotalMin == examTotalMin) || (differenceMinutes <= 30)) {
            System.out.println("On time");
            if (differenceMinutes >= 1) {
                System.out.printf("%d minutes before the start", differenceMinutes);
            }
    } else  {
            System.out.println("Early");
            if (differenceMinutes <= 59) {
            System.out.printf("%d minutes before the start", differenceMinutes);
            } else {
            System.out.printf("%d:%02d hours before the start", differenceHh, differenceMm);
            }
    }
    }
}
