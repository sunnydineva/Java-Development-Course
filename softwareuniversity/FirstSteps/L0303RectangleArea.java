package softwareuniversity.FirstSteps;

import java.util.Scanner;

public class L0303RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int area = firstNum * secondNum;

        System.out.println(area);
    }
}
