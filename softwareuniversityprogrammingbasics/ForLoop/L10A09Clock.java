package softwareuniversityprogrammingbasics.ForLoop;

public class L10A09Clock {
    public static void main(String[] args) {

        int hh;
        int mm;
        int minutesForTheDay = 0;

        for (int i = 1; i < 1440; i++) {
            minutesForTheDay ++;
            hh = minutesForTheDay / 60;
            mm = minutesForTheDay % 60;
            System.out.printf("%d:%02d%n", hh, mm);
        }
    }
}
