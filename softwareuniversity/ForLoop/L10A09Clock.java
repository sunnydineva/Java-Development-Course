package softwareuniversity.ForLoop;

import java.util.Scanner;

public class L10A09Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hh = 0;
        int mm = 0;
        int minutesForTheDay = 0;

        for (int i = 1; i < 1440; i++) {

            minutesForTheDay ++;
            hh = minutesForTheDay / 60;
            mm = minutesForTheDay % 60;

            System.out.printf("%d:%02d%n", hh, mm);

        }



    }

}
