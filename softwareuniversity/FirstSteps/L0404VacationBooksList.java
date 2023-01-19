package softwareuniversity.FirstSteps;

import java.util.Scanner;
public class L0404VacationBooksList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pagesInBook = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int daysForRead = Integer.parseInt(scan.nextLine());
        int hoursForBook = pagesInBook / pagesPerHour;
        int hoursPerDay= hoursForBook / daysForRead;

        System.out.println(hoursPerDay);
        //Да се отпечата на конзолата броят часове, които Жоро трябва да отделя за четене всеки
    }
}