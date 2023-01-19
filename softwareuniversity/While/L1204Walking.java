package softwareuniversity.While;

import java.util.Scanner;

public class L1204Walking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalSteps = 0;
        boolean isGoingHome = false;

        while (totalSteps < 10000) {
            String command = scanner.nextLine();
            if (command.equals("Going home")) {
                int steps = Integer.parseInt(scanner.nextLine());
                totalSteps += steps;
                isGoingHome = true;
                break;
            } else {
                int steps = Integer.parseInt(command);
                totalSteps += steps;
            }
        }
        if (isGoingHome && totalSteps < 10000) {
            System.out.printf("%d more steps to reach goal.", 10000 - totalSteps);
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalSteps - 10000);
        }
    }
}
