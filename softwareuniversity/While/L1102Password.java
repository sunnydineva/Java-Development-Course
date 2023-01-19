package softwareuniversity.While;

import java.util.Scanner;

public class L1102Password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();
        String inputData = scanner.nextLine();

        while (!inputData.equals(password)) {
            inputData = scanner.nextLine();
        }
        System.out.printf("Welcome %s!%n", username);
    }
}
