package softwareuniversity.FirstSteps;

import java.util.Scanner;

public class L0307ProjectCreator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String archName = scan.nextLine();
        int projectsCount = Integer.parseInt(scan.nextLine());
        int leadTime = projectsCount * 3;

        System.out.printf("The architect %s will need %s hours to complete %s project/s.", archName, leadTime, projectsCount);
    }
}