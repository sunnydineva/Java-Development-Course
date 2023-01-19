package softwareuniversity.ConditionalStatements;

import java.util.Scanner;

public class L06A01PipesInPool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());
        double completionLt = P1 * H + P2 * H;
        double completionPercent = completionLt / V * 100;
        double completionP1 = P1 * H / completionLt * 100;
        double completionP2 = P2 * H / completionLt * 100;
        if (completionLt <= V) {
            System.out.printf("The pool is %.2f%%  full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", completionPercent, completionP1, completionP2);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, completionLt - V);
        }
    }
}
