package softwareuniversity.JFArrays;

import java.util.Scanner;

public class L01DayOfWeek {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        boolean isValid = false;
        for (int i = 0; i < days.length + 1; i++) {
            if ((i == input) && (1 <= input)) {
                isValid = true;
                System.out.printf(days[i - 1]);
            }
        }
        if (!isValid) {
            System.out.println("Invalid day!");
        }
    }
}
