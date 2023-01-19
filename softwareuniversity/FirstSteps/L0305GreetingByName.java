package softwareuniversity.FirstSteps;

import java.util.Scanner;

public class L0305GreetingByName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Hello, " +name + "!");
    }
}
