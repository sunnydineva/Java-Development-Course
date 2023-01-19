package softwareuniversityprogrammingbasics.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L0707WorkingHours {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int time = Integer.parseInt(scanner.nextLine());
        String daysOfWeek = scanner.nextLine();
        //boolean isSunday = false;

        if ((time <= 18 && time >= 10) && (daysOfWeek.equals("Monday") ||
                daysOfWeek.equals("Tuesday") ||
                daysOfWeek.equals("Wednesday") ||
                daysOfWeek.equals("Thursday") ||
                daysOfWeek.equals("Friday") ||
                daysOfWeek.equals("Saturday"))) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
